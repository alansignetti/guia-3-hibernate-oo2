package test;

import java.time.LocalDate;

import datos.Cliente;
import negocio.ClienteABM;
import negocio.PrestamoABM;


public class TestAgregarPrestamo {
public static void main(String[] args) {
		ClienteABM abmCliente = new ClienteABM();
		int idCliente = 2;
		Cliente cliente = abmCliente.traerPorId(idCliente);
		System.out.println(cliente);
		PrestamoABM abmPrestamo = new PrestamoABM();
		
		
		LocalDate fecha = LocalDate.now();
		double monto= 11111; 
		double interes= 11; 
		int cantCuotas=5;
		abmPrestamo.agregarPrestamo(fecha, monto, interes, cantCuotas, cliente);
//		abmPrestamo.agregarPrestamo(LocalDate.now(), 5000, 20, 10, cliente, false);
//		("prueba@Prestamo2", "22-2222-2222", "022-2222-2222", cliente);
		
//		int id = abmPrestamo(LocalDate.now(), 5000, 20, 10, cliente,false);
	}
	
}
