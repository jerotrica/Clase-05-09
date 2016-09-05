package ar.edu.unlam.pb2;

public class Triangulo {
	private Double lado1Triangulo, lado2Triangulo, lado3Triangulo,
			baseTriangulo, alturaTriangulo;

	public Double calcularPerimetro() {
		Double perimetro;
		perimetro = lado1Triangulo + lado2Triangulo + lado3Triangulo;
		return perimetro;
	}

	public Double calcularArea() {
		Double area;
		area = (baseTriangulo * alturaTriangulo) / 2;
		return area;
	}

}
