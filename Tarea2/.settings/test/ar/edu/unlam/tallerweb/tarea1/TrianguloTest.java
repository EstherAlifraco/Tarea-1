package ar.edu.unlam.tallerweb.tarea1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void calculaAreaTriangulo() {
		Triangulo miTriangulo=new Triangulo(5.0);
		Double esperado=10.83;
		assertEquals(esperado.doubleValue(),miTriangulo.calculaAreaTriangulo().doubleValue(),0.01);
	}

	@Test
	public void calculaPerimetroTriangulo() {
		Triangulo miTriangulo=new Triangulo(3.0);
		Double esperado=9.0;
		assertEquals(esperado.doubleValue(),miTriangulo.calculaPerimetroTriangulo().doubleValue(),0.01);
	}

}
