package ar.edu.unlam.tallerweb.tarea1;

public class Cuadrado {
	private Double lado;
	public Cuadrado(Double lado){
		this.lado=lado;
	}
	
	public Double calculaAreaCuadrado(){
		return lado*lado;
	}
	
	public Double calculaPerimetroCuadrado(){
		return 4*lado;
	}

}
