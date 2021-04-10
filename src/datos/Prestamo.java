package datos;

import java.time.LocalDate;
import java.util.Set;

import funciones.Funciones;

public class Prestamo {
	private long idPrestamo;
	private LocalDate fecha;
	private double monto;
	private double interes;
	private int cantCuotas;
	private Cliente cliente;
	private boolean cancelado;
	private Set<Cuota> cuotas;

	public Prestamo() {
	}

	public Prestamo(LocalDate fecha, double monto, double interes, int cantCuotas, Cliente cliente,boolean cancelado ) {
		super();
		this.fecha = fecha;
		this.monto = monto;
		this.interes = interes;
		this.cantCuotas = cantCuotas;
		this.cliente = cliente;
		this.cancelado = cancelado;
	}

	public long getIdPrestamo() {
		return idPrestamo;
	}

	protected void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getCancelado() {
		return cantCuotas;
	}

	public void setCancelado(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}
	public Set<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(Set<Cuota> prestamos) {
		this.cuotas = prestamos;
	}

	public String toString() {
		String prestamo = "Prestamo: $ " + monto + "\nFecha: " + Funciones.traerFechaCorta(fecha) + "\nInteres: "
				+ interes + "\nCant.de Cuotas: " + cantCuotas + "\nCancelado: "+ cancelado;
		return prestamo;
	}
}