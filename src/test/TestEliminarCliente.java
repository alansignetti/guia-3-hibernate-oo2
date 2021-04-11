package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) throws Exception {
		 ClienteABM abm = new ClienteABM();
	     long idCliente = 1;
	     Cliente cEliminado = abm.traerPorId(idCliente);
	     abm.eliminar(idCliente);
	     System.out.println("Cliente eliminado exitosamente! --- "); //+ cEliminado
	}

}
