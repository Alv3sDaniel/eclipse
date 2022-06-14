package com.castro.facade.system;

public class ControleFluxoAr {
	
	private MedidorFluxoAr medidorAr = new MedidorFluxoAr();
	
	public void lerAr() {
		medidorAr.obterMedicoes();
		System.out.println("Informação do ar provida!");
	}
	
	public void desligar() {
		System.out.println("Controle de ar desligado!");
	}

}
