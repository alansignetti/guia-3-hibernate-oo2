package test;
import java.time.LocalDate;
import negocio.ClienteABM;
public class TestAgregarCliente {
    public static void main(String[] args) throws Exception {
        String apellido = "apellido 1";
        String nombre = "nombre 1";
        int documento = 111;
        // tu fecha de nacimiento
        LocalDate fechaDeNacimiento = LocalDate.now();
        ClienteABM abm = new ClienteABM();
        @SuppressWarnings("unused")
		int ultimoIdCliente = abm.agregar(apellido, nombre, documento,
            fechaDeNacimiento);
    }
}