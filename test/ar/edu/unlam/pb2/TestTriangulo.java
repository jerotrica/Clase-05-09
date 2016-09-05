package ar.edu.unlam.pb2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestTriangulo {

	@SuppressWarnings("deprecation")
	@Test
	public void testCalculoPerimetro() {
		Triangulo miTriangulo= new Triangulo();
		miTriangulo.setLado1Triangulo(2.0);
		miTriangulo.setLado2Triangulo(3d);
		miTriangulo.setLado3Triangulo(5d);
		Double perimetro;
		perimetro= miTriangulo.calcularPerimetro();
		Assert.assertEquals(10, perimetro, 0.01);
	}

}
