package ar.edu.unlam.tallerweb.tarea1;

public class Triangulo {
	private Double lado;
	public Triangulo(Double lado){
		this.lado=lado;
	}
	
	public Double calculaAreaTriangulo(){
		return (Math.sqrt(3)/4) * (this.lado * this.lado);
	}
	
	public Double calculaPerimetroTriangulo(){
		return 3*lado;
	}

}