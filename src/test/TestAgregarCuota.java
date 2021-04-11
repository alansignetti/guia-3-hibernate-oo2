package test;

import datos.Prestamo;
import negocio.ClienteABM;
import negocio.CuotaABM;
import negocio.PrestamoABM;

public class TestAgregarCuota {
	public static void main(String[] args) throws Exception {
//		PrestamoABM p= ;
		int idPrestamo = 1;
		PrestamoABM abmPrestamo = new PrestamoABM();
		Prestamo p = abmPrestamo.traerPrestamo(idPrestamo);
		CuotaABM abmCuota = new CuotaABM();
		
//		System.out.println(p);
		abmCuota.agregarCuota(p);
		
	}
}
