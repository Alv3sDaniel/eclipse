package com.castro.adapter;

public class Circulo implements Forma{

	@Override
	public void pintar() {
		System.out.println("Desenhando um circulo...");
	}

	@Override
	public void redimensionar() {
		System.out.println("Redimensionando um circulo...");
	}

	@Override
	public String descricao() {
		return "Objeto circulo";
		
	}

	@Override
	public boolean estaOculto() {		
		return false;
	}


}
