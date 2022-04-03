package Clases;

public class Tarjeta {

	//Atributos detectados
	
	private int numeroDeTarjeta;
	private Cardholder cardholder;
	private Fecha fechaVencimiento;
	private Marca marca;

	
	//Constructor
	public Tarjeta(int numeroDeTarjeta, Cardholder Cardholder, Fecha fechaVencimiento, Marca marca) {
		super();
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.cardholder = Cardholder;
		this.fechaVencimiento = fechaVencimiento;
		this.marca = marca;
	}


	//getters and setters
	

	public int getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(int numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public Cardholder getCardholder() {
		return cardholder;
	}

	public void setCardholder(Cardholder cardholder) {
		this.cardholder = cardholder;
	}

	public Fecha getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Fecha fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Tarjeta [numeroDeTarjeta=" + numeroDeTarjeta + ", cardholder=" + cardholder + ", fechaVencimiento="
				+ fechaVencimiento + ", marca=" + marca + "]";
	}
	
	
	
	
}
