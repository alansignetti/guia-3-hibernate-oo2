package datos;

import java.time.LocalDate;

public class Cuota {
	private int nroCuota;
	private LocalDate fechaVencimiento;
	private double saldoPendiente;
	private double interesCuota;
	private double cuota;
	private double deuda;
	private boolean cancelada;
	private LocalDate fechaPago;
	private double punitorios;
	private long idPrestamo;
	
	
	
	public Cuota( LocalDate fechaVencimiento, double saldoPendiente, double interesCuota, double cuota,
			double deuda, boolean cancelada, LocalDate fechaPago, double punitorios, long idPrestamo) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.saldoPendiente = saldoPendiente;
		this.interesCuota = interesCuota;
		this.cuota = cuota;
		this.deuda = deuda;
		this.cancelada = cancelada;
		this.fechaPago = fechaPago;
		this.punitorios = punitorios;
		this.idPrestamo = idPrestamo;
	}
	public int getNroCuota() {
		return nroCuota;
	}
	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public double getSaldoPendiente() {
		return saldoPendiente;
	}
	public void setSaldoPendiente(double saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}
	public double getInteresCuota() {
		return interesCuota;
	}
	public void setInteresCuota(double interesCuota) {
		this.interesCuota = interesCuota;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	public boolean isCancelada() {
		return cancelada;
	}
	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	public double getPunitorios() {
		return punitorios;
	}
	public void setPunitorios(double punitorios) {
		this.punitorios = punitorios;
	}
	public long getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	
	@Override
	public String toString() {
		return "Cuota: " + nroCuota + "\nfechaVencimiento: " + fechaVencimiento + "\nsaldoPendiente: "
				+ saldoPendiente + "\ninteresCuota: " + interesCuota + "\ncuota: " + cuota + "\ndeuda: " + deuda
				+ "\ncancelada: " + cancelada + "\nfechaPago: " + fechaPago + "\npunitorios: " + punitorios
				+ "\nidPrestamo: " + idPrestamo;
	}
}
