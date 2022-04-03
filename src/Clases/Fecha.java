package Clases;

public class Fecha {

	//Atributos
	private int dia;
    private int mes;
    private int a�o;

    //Constructor con par�metros
    public Fecha(int dia, int mes, int a�o) {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }

    //setters y getters
    public void setDia(int dia) {
        dia = dia;
    }
    public void setMes(int mes) {
        mes = mes;
    }
    public void setA�o(int a�o) {
        a�o = a�o;
    }
    
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getA�o() {
        return a�o;
    }

    //toString
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}
	
    
	
}
