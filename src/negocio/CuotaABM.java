package negocio;

import java.time.LocalDate;

import negocio.PrestamoABM;
import dao.CuotaDao;
import datos.Cliente;
import datos.Cuota;
import datos.Prestamo;
import funciones.Funciones;

public class CuotaABM {
	private CuotaDao dao = new CuotaDao();

	public Cuota traerCuota(int nroCuota) throws Exception {
		// Implementar: si no existe la cuota lanzar la excepción
		Cuota c = dao.traer(nroCuota);
		if (c == null) {
			throw new Exception("No existe la cuota:" + nroCuota);
		} else {
			return c;
		}
	}

	public void agregarCuota(Prestamo prestamo) {
		Prestamo p = prestamo;
		//crea variables
		LocalDate fechaVencimiento = LocalDate.now();
		double saldoPendiente = 1;
		double amortizacion = 1;
		double interesCuota = 1;
		double cuota = 1;
		double deuda = 1;
		int nroCuota = 1;
		int i = 1;
		boolean cancelada = false;
		LocalDate fechaPago = LocalDate.now();
		double punitorios = 1;
		double amortizacionNumerador;
        double amortizacionDenominador;
        double amortizacionResultado;
        
		
		while (i <= p.getCantCuotas()) {			
			if (i == 1) {
				//Calculo de la primera cuota
            	
            	saldoPendiente = p.getMonto();
            	
            	amortizacionNumerador = saldoPendiente*p.getInteres();
            			
            	amortizacionDenominador = Math.pow((1+p.getInteres()), p.getCantCuotas()) -1 ;
            	
            	amortizacionResultado = amortizacionNumerador / amortizacionDenominador;
            	
            	interesCuota = saldoPendiente*p.getInteres();
            	
            	cuota = amortizacionResultado + interesCuota;
            	
            	deuda = saldoPendiente - amortizacionResultado;
            	
            	saldoPendiente = saldoPendiente - amortizacionResultado;
            	
            	fechaVencimiento = p.getFecha().plusMonths(1);
            	
            	while((Funciones.esDiaHabil(fechaVencimiento)) == false){ // si no es dia habil le agrega un dia hasta q lo sea
                    fechaVencimiento.plusDays(1);
            }
            	Cuota c1 = new Cuota(fechaVencimiento, saldoPendiente, amortizacion, interesCuota, cuota, deuda, cancelada, fechaPago, punitorios, prestamo,i);
				
				dao.agregar(c1);				
				System.out.println("i="+i+"//entro primer if");
			} 
			else{
				Cuota c2 = new Cuota(LocalDate.now(), 2, 2, 2, 2, 2, false, LocalDate.now(), 1, p,i);
        		
				dao.agregar(c2);
				System.out.println("i="+i+"//entro 2do if");
			}
			i++;			
		}
	}

//		if (p.getCuotas().isEmpty() == true || p.getCuotas() == null) {
//			dao.agregar(c1);
//		}
//		else {
//			
//			dao.agregar(c);
//		}
//		

	public void modificar(Cuota cuota) {
		dao.actualizar(cuota);
	}

}
