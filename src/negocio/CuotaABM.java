package negocio;

import dao.CuotaDao;
import datos.Cuota;
import datos.Prestamo;

public class CuotaABM {
	private CuotaDao dao = new CuotaDao();

	public Cuota traerCuota(int nroCuota) throws Exception {
		// Implementar: si no existe la cuota lanzar la excepción
		Cuota c = dao.traer(nroCuota);
		if (c == null) {
			throw new Exception("No existe el prestamo con id:" + nroCuota);
		} else {
			return c;
		}
	}

	public void modificar(Cuota cuota) {
		dao.actualizar(cuota);
	}
	
	
}
