package com.castro.adapter;

public class Retangulo implements Forma{

	@Override
	public void pintar() {
		System.out.println("Desenhando um retangulo...");
	}

	@Override
	public void redimensionar() {
		System.out.println("Redimensionando um retangulo...");
	}

	@Override
	public String descricao() {
		return "Objeto Retangulo";
		
	}

	@Override
	public boolean estaOculto() {		
		return false;
	}

}
