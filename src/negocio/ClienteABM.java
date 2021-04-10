package negocio;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import dao.ClienteDao;
import datos.Cliente;
import datos.Prestamo;

public class ClienteABM {
	ClienteDao dao = new ClienteDao();

	public Cliente traer(long idCliente) {
		Cliente c = dao.traer(idCliente);
		return c;
	}

	public Cliente traer(int dni) {
		Cliente c = dao.traer(dni);
		return c;
	}

	public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) {
		Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(c);
	}

	public void modificar(Cliente c) {
		dao.actualizar(c);
	}

	public void eliminar(long idCliente) {
		Cliente c = dao.traer(idCliente);
		dao.eliminar(c);
	}

	public List<Cliente> traer() {
		return dao.traer();
	}

	public Cliente traerClienteYPrestamos(long idCliente) throws Exception {

		Cliente c = dao.traer(idCliente);

		Set<Prestamo> listaPrestamo = c.getPrestamos();
		if (listaPrestamo == null || listaPrestamo.isEmpty()) {
			throw new Exception("El cliente " + c.getNombre() + " no tiene ningun prestamo");
		} else {
			return dao.traerClienteYPrestamos(idCliente);
		}
	}
}
