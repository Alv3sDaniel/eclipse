package com.castro.adapter;

public class Losango implements FormaAvancada {

	private final double a;
	private final double b;

	public Losango() {
		this(1.0d, 1.0d);
	}

	public Losango(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double calcularArea() {
		return a*b;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (a+b);
	}

	@Override
	public void pintarForma() {
		System.out.println("Pintando um losango com area de: " + calcularArea() + " e perimetro de: " + calcularPerimetro());

	}

}
