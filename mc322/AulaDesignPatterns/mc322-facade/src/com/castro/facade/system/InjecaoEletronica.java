package com.castro.facade.system;

public class InjecaoEletronica {
	
	private BombaCombustivel bomba = new BombaCombustivel();
	
	public void ligar() {
		System.out.println("Injeção ligando...");
	}
	
	public void injetar() {
		bomba.bombear();
		System.out.println("Combustível injetado");
	}
	
	public void desligar() {
		System.out.println("Injeção desligando...");
	}
	

}
