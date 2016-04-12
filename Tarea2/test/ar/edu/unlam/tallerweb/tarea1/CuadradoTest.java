package ar.edu.unlam.tallerweb.tarea1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void calculaAreaCuadrado() {
		Cuadrado miCuadrado=new Cuadrado(3.0);
		Double esperado=9.0;
		assertEquals(esperado.doubleValue(),miCuadrado.calculaAreaCuadrado().doubleValue(),0.01);
	}

	@Test
	public void calculaPerimetroCuadrado() {
		Cuadrado miCuadrado=new Cuadrado(3.0);
		Double esperado=12.0;
		assertEquals(esperado.doubleValue(),miCuadrado.calculaPerimetroCuadrado().doubleValue(),0.01);
	}


}
