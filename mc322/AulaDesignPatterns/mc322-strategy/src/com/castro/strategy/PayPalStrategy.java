package com.castro.strategy;

public class PayPalStrategy implements PagamentoStategy{
	
	private String emailId;
	private String password;
	
	
	public PayPalStrategy(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}


	@Override
	public void pagar(double quantidade) {
		System.out.println("Pago com paypal! (Desconto de 5%) - Valor: " + quantidade * 0.95);

	}

}
