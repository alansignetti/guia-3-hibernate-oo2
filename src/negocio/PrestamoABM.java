package negocio;

import dao.PrestamoDao;
import java.time.LocalDate;
import java.util.List;
import datos.Cliente;
import datos.Prestamo;

public class PrestamoABM {
	private PrestamoDao dao = new PrestamoDao();

	public Prestamo traerPrestamo(long idPrestamo) throws Exception {
//Implementar: si no existe el prestamo lanzar la excepci�n
		
		Prestamo p = dao.traer(idPrestamo);
		
		if (p == null){			
			throw new Exception("No existe el prestamo con id:"+ idPrestamo);			
		}
		else {
			return p;
		}
		
	}

	public List<Prestamo> traerPrestamo(Cliente c) {
		return dao.traer(c);
	}
	/*
	 * Pendiente implementar Alta, Modificar
	 */
	public boolean agregarPrestamo(LocalDate fecha,double monto,double interes,int cantCuotas,Cliente cliente) {
		
		Prestamo p = new Prestamo(fecha,monto,interes,cantCuotas,cliente);
		return cliente.getPrestamos().add(p);
	}
	
	public void modificarPrestamo(Prestamo p,LocalDate fecha,double monto,double interes,int cantCuotas ) throws Exception{

		p.setCantCuotas(cantCuotas);
		p.setFecha(fecha);
		p.setInteres(interes);
		p.setMonto(monto);
	}
	
}
