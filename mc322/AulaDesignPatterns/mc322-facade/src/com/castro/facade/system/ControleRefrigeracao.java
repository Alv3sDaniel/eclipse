package com.castro.facade.system;

public class ControleRefrigeracao {
	
	private int maxTemp;
	private Radiador radiador = new Radiador();
	private SensorTemperatura sensorTemp = new SensorTemperatura();
    private static final Integer VEL_RADIADOR_DEFAULT = 1000;

	
	public void setTemperaturaMax(int t) {
		System.out.println("Temp. max setada para " + t);
		this.maxTemp = t;
	}
	
	public void iniciar() {
		System.out.println("Controle de Refrigeração ok");
		radiador.setRotacao(VEL_RADIADOR_DEFAULT);
	}
	
	public void resfriar() {
		System.out.println("Resfriando...");
		radiador.ligar();
	}
	
	public void desligar() {
		System.out.println("Controle de refrigeração desligado");
	}

}
