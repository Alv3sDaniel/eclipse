package com.castro.facade;

import com.castro.facade.system.ControleFluxoAr;
import com.castro.facade.system.ControleRefrigeracao;
import com.castro.facade.system.ConversorCatalizador;
import com.castro.facade.system.Ignicao;
import com.castro.facade.system.InjecaoEletronica;

public class MotorCarroFacade {
	
	private InjecaoEletronica injecao = new InjecaoEletronica();
	private ControleFluxoAr controleAr = new ControleFluxoAr();
	private Ignicao ignicao = new Ignicao();
	private ControleRefrigeracao controleRef = new ControleRefrigeracao();
	private ConversorCatalizador convCatalizador = new ConversorCatalizador();
	
	public void ligarMotor() {
		injecao.ligar();
		controleAr.lerAr();
		injecao.ligar();
		injecao.injetar();
		ignicao.darPartida();
		controleRef.setTemperaturaMax(95);
		controleRef.iniciar();		
		convCatalizador.ligar();
	}
	
	public void desligarMotor() {
		injecao.desligar();
		convCatalizador.desligar();
		controleRef.resfriar();
		controleRef.desligar();
		controleAr.desligar();
	}
	
	public static void main(String[] args) {
		MotorCarroFacade motor = new MotorCarroFacade();
		motor.ligarMotor();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		finally {
			motor.desligarMotor();
		}
		
		
	}

}
