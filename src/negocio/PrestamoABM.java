package negocio;

import dao.PrestamoDao;
import negocio.CuotaABM;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import datos.Cliente;
import datos.Prestamo;

public class PrestamoABM {
	private PrestamoDao dao = new PrestamoDao();

	public Prestamo traerPrestamo(long idPrestamo) throws Exception {
//Implementar: si no existe el prestamo lanzar la excepci?n
		
		Prestamo p = dao.traer(idPrestamo);
		
		if (p == null){			
			throw new Exception("No existe el prestamo con id:"+ idPrestamo);			
		}
		else {
			return p;
		}
		
	}

	public List<Prestamo> traerPrestamo(Cliente c) throws Exception {
		
		Set<Prestamo> listaPrestamo = c.getPrestamos();
		if (listaPrestamo == null || listaPrestamo.isEmpty()) {
			throw new Exception("El cliente "+ c.getNombre()+ " no tiene ningun prestamo");	 
		}
		else {
			return dao.traer(c);
		}
	}
	/*
	 * Pendiente implementar Alta, Modificar
	 */
	public void agregarPrestamo(LocalDate fecha,double monto,double interes, int cantCuotas,Cliente cliente) {
		CuotaABM c = new CuotaABM();
		
		Prestamo p = new Prestamo(fecha,monto,interes,cantCuotas,false, cliente);
		
		dao.agregar(p);
		
		c.agregarCuota(p);
		
		
	}
	
	
	public void modificarPrestamo(Prestamo p ) throws Exception{
		dao.actualizar(p);
	}


   
}
