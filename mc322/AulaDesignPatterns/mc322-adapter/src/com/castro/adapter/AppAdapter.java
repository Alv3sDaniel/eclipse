package com.castro.adapter;

public class AppAdapter {
	
	public static void main(String[] args) {
//		System.out.println("Criando algumas formas...");
//		
//		Pintura pintura = new Pintura();
//		pintura.addForma(new Retangulo());
//		pintura.addForma(new Circulo());
//		
//		
//		System.out.println("Pintando...");
//		pintura.pintar();
//		System.out.println("Redimensionando...");
//		pintura.redimensionar();
		
		System.out.println("Criando algumas formas...");
		
		Pintura pintura = new Pintura();
		pintura.addForma(new Retangulo());
		pintura.addForma(new Circulo());
		pintura.addForma(new FormaAvancadaAdapter(new Triangulo()));
		pintura.addForma(new FormaAvancadaAdapter(new Losango()));
		
		
		System.out.println("Pintando...");
		pintura.pintar();
		System.out.println("Redimensionando...");
		pintura.redimensionar();
		
		
		
		
		
		
	}

}
