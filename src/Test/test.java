package Test;

import java.time.LocalDate;

import Clases.Cardholder;
import Clases.Fecha;
import Clases.Marca;
import Clases.Operacion;
import Clases.Sistema;
import Clases.Tarjeta;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaraci�n Sistema
		Sistema sistema = new Sistema(null);
	
		//Declaracion de objetos
		Cardholder cardholder1 = new Cardholder("Mar�a", "G�mez");
		Fecha fechaV_1 = new Fecha(12, 5, 2023);
		Tarjeta tarjeta1 = new Tarjeta(123123, cardholder1 , fechaV_1, Marca.AMEX);
		
		Cardholder cardholder2 = new Cardholder("Juan", "P�rez");
		Fecha fechaV_2 = new Fecha(1, 4, 2022);
		Tarjeta tarjeta2 = new Tarjeta(321321, cardholder2 , fechaV_2, Marca.NARA);
		
		Cardholder cardholder3 = new Cardholder("Josefina", "Casta");
		Fecha fechaV_3 = new Fecha(28, 10, 2028);
		Tarjeta tarjeta3 = new Tarjeta(456789, cardholder3 , fechaV_3, Marca.VISA);
		
		//A�adir tarjetas.
		sistema.a�adirTarjeta(tarjeta1);
		sistema.a�adirTarjeta(tarjeta2);
		sistema.a�adirTarjeta(tarjeta3);
		
		
		//Invocar un m�todo que devuelva toda la informaci�n de una tarjeta
		sistema.mostarDatos(tarjeta1.getNumeroDeTarjeta()); 
		System.out.println("");
		sistema.mostarDatos(tarjeta2.getNumeroDeTarjeta()); 
		System.out.println("");
		sistema.mostarDatos(tarjeta3.getNumeroDeTarjeta()); 
		System.out.println("");

		//Informar si una operaci�n es valida
		sistema.operacionValida(1500);
		sistema.operacionValida(500);
		sistema.operacionValida(1000);
		sistema.operacionValida(2500);

		System.out.println("");
		
		//Informar si una tarjeta es v�lida para operar
     	sistema.validarFecha(tarjeta1.getNumeroDeTarjeta());//Vence en el 2023
		System.out.println("");
		sistema.validarFecha(tarjeta2.getNumeroDeTarjeta());//Venci� el 1 de abril de este a�o
		System.out.println("");
		sistema.validarFecha(tarjeta3.getNumeroDeTarjeta());//Vence en el 2018		
		System.out.println("");
		
		//Identificar si una tarjeta es distinta a otra
		sistema.identificacionTarjeta(tarjeta1, tarjeta2);
		sistema.identificacionTarjeta(tarjeta1, tarjeta1);
		sistema.identificacionTarjeta(tarjeta3, tarjeta2);
		sistema.identificacionTarjeta(tarjeta3, tarjeta3);

		System.out.println("");
		//Obtener por medio de un m�todo la tasa de una operaci�n informando marca e importe
		
		
		System.out.println("La tasa es de: " + sistema.calcularTasa(Marca.NARA, 1500) + " %");
		System.out.println("");
		System.out.println("La tasa es de: " + sistema.calcularTasa(Marca.AMEX, 1000) + " %");
		System.out.println("");
		System.out.println("La tasa es de: " + sistema.calcularTasa(Marca.VISA, 330) + " %");

	}

}
