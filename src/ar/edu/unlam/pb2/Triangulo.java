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
	

	public Double getLado1Triangulo() {
		return lado1Triangulo;
	}

	public void setLado1Triangulo(Double lado1Triangulo) {
		this.lado1Triangulo = lado1Triangulo;
	}

	public Double getLado2Triangulo() {
		return lado2Triangulo;
	}

	public void setLado2Triangulo(Double lado2Triangulo) {
		this.lado2Triangulo = lado2Triangulo;
	}

	public Double getLado3Triangulo() {
		return lado3Triangulo;
	}

	public void setLado3Triangulo(Double lado3Triangulo) {
		this.lado3Triangulo = lado3Triangulo;
	}
}
