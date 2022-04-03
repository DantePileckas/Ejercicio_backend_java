package Clases;

public class Cardholder {

	//Atributos
	private String nombre;
	private String apellido;
	
	//constructor
	public Cardholder(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	//To String
	@Override
	public String toString() {
		return "Cardholder [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
