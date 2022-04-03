package Clases;

public class Fecha {

	//Atributos
	private int dia;
    private int mes;
    private int año;

    //Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    //setters y getters
    public void setDia(int dia) {
        dia = dia;
    }
    public void setMes(int mes) {
        mes = mes;
    }
    public void setAño(int año) {
        año = año;
    }
    
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }

    //toString
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}
	
    
	
}
