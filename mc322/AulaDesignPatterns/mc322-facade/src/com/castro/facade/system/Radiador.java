package com.castro.facade.system;

public class Radiador {
	
	public void ligar() {
		System.out.println("Radiador ligado...");
	}
	
	public void desligar() {
		System.out.println("Radiador desligado...");
	}
	
	public void setRotacao(int rpm) {
		System.out.println("Velocidade do radiador setada para " + rpm + "rpm");
	}

}
