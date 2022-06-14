package com.castro.adapter;

public class Triangulo implements FormaAvancada {

	private final double a;
	private final double b;
	private final double c;

	public Triangulo() {
	        this(1.0d, 1.0d, 1.0d);
	    }
	
	public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


	@Override
	public double calcularArea() {
		double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double calcularPerimetro() {
        return a + b + c;

	}

	@Override
	public void pintarForma() {
	    System.out.println("Pintando um triangulo com area de: " + calcularArea() + " e perimetro de: " + calcularPerimetro());
	}

}
