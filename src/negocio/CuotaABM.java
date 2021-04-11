package negocio;

import java.time.LocalDate;

import negocio.PrestamoABM;
import dao.CuotaDao;
import datos.Cliente;
import datos.Cuota;
import datos.Prestamo;

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
//		Cuota c = new Cuota(fechaVencimiento, saldoPendiente, amortizacion, interesCuota, cuota, deuda, cancelada, fechaPago, punitorios, prestamo);
		Prestamo p = prestamo;
		//crea variables
		LocalDate fechaVencimiento = LocalDate.now();
		double saldoPendiente = 1;
		double amortizacion = 1;
		double interesCuota = 1;
		double cuota = 1;
		double deuda = 1;
		boolean cancelada = false;
		LocalDate fechaPago = LocalDate.now();
		double punitorios = 1;
//		Cuota c1 = new Cuota(LocalDate.now(), 1, 1, 1, 1, 1, false, LocalDate.now(), 1, p);
		Cuota c2 = new Cuota(LocalDate.now(), 2, 2, 2, 2, 2, false, LocalDate.now(), 1, p);
		Cuota c1 = new Cuota(fechaVencimiento, saldoPendiente, amortizacion, interesCuota, cuota, deuda, cancelada, fechaPago, punitorios, p);
		
		int i = 1;
		System.out.println("\n\n\nNo entro" + p.getCantCuotas());
		while (i <= p.getCantCuotas()) {
			System.out.println("\n Entro al while:" + i );
			System.out.println(fechaVencimiento+"\n"+ saldoPendiente+"\n"+ amortizacion+"\n"+ interesCuota+"\n"+ cuota+"\n"+ deuda+"\n"+ cancelada+"\n"+ fechaPago+"\n"+ punitorios+"\n"+ prestamo);
			if (i == 1) {
				dao.agregar(c1);
				i++;
				System.out.println(i + "entro primer if");
			} else {
				dao.agregar(c2);
				i++;
				System.out.println(i + "entro 2do if");
			}
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
