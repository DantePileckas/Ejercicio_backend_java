package Clases;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;

public class Sistema {

	
	private ArrayList<Tarjeta> tarjetas;
	private final int MAX_CONSUMO = 1000;

	public Sistema(ArrayList<Tarjeta> tarjetas) {
		super();
		this.tarjetas = new ArrayList<Tarjeta>();
	}

	//Getters and setters
	public ArrayList<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
		tarjetas = tarjetas;
	}
	
	//Métodos
	
	//Añadir Tarjeta
	
	public void añadirTarjeta(Tarjeta tarjeta) {
		this.tarjetas.add(tarjeta);
	}
	
	//Buscar Tarjeta. (Para mostrar los datos de una tarjeta debo validar que exista.)
	public Tarjeta buscarTarjeta(int id){
		Tarjeta tarjeta = null;
		int i = 0;
 
     	while (i < tarjetas.size() && tarjeta == null) {
			if (tarjetas.get(i).getNumeroDeTarjeta()==id) {
				tarjeta = tarjetas.get(i);
			} else {
				i++;
			}
	}
		return tarjeta;

	
	
}
	
	//Mostar Info de tarjeta
    
	public void mostarDatos(int id) {
		try {
			Tarjeta tarjeta = buscarTarjeta(id);
			if(tarjeta != null) {
				System.out.println(tarjeta.toString());
			} else {
				System.out.println("Tarjeta no identificada");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

	//validar operacion
	public boolean operacionValida(double valorConsumido) {
		boolean operacionValida = false;
		try {
		if(valorConsumido <= MAX_CONSUMO) {
			operacionValida = true;
			System.out.println("¡Operación exitosa!");
		} else {
			System.out.println("Operación invalida. Supera el máximo");
		}}catch (Exception e) {
			System.out.println(e);
		}
		
		return operacionValida;
	
	}
	
	
	//Informar si una tarjeta es válida para operar
	public void validarFecha(int id) {
		boolean tarjetaVencida = false;
		
		try {
		Tarjeta tarjeta = buscarTarjeta(id);
		
		if(tarjeta!=null) {
		  
			Locale locale = new Locale("es", "ES");
			
			Month mMonth=Month.of(tarjeta.getFechaVencimiento().getMes());
		    String monthName=mMonth.getDisplayName(TextStyle.FULL,locale); 
			
			LocalDate fechaVencimientoDate = LocalDate.of(tarjeta.getFechaVencimiento().getAño(),
														  tarjeta.getFechaVencimiento().getMes(),
														  tarjeta.getFechaVencimiento().getDia());
			
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	
			String fechaActual= LocalDate.now().format(formatter);
			LocalDate date = LocalDate.parse(fechaActual, formatter);
			
			if(fechaVencimientoDate.compareTo(date)<0) {
				System.out.println("Tarjeta Vencida");
				tarjetaVencida = true;
			} else {
				System.out.println("Tarjeta sin vencer");
			}
			
		} else {
			System.out.println("Tarjeta no encontrada");
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	
	//Identificar si una tarjeta es distinta a otra
	public boolean identificacionTarjeta(Tarjeta tarjeta1, Tarjeta tarjeta2) {
		boolean sonDiferentes = false;
		try {
		if(tarjeta1.getNumeroDeTarjeta() != tarjeta2.getNumeroDeTarjeta()){
			sonDiferentes=true;
			System.out.println("Efectivamente, son diferentes");
		} else {
			System.out.println("Son iguales");
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		return sonDiferentes;
		
	}
	
	
	
	//Obtener por medio de un método la tasa de una operación informando marca e importe
	public double calcularTasa(Marca marca, Fecha fecha) {
		double importe = 0; 
		
		switch (marca) {
		case VISA: {
			importe = fecha.getAño() / fecha.getMes(); 
		}
		break;
		
		case NARA:{
			importe = fecha.getDia()  * 0.5;
		}
		break;
		case AMEX:{
			importe = fecha.getMes()  * 0.1;

		}
		break;
		
		default:
			System.out.println("Valor incorrecto: " + marca);

		}
		
		return importe;
		
	}
	
	
	
}


