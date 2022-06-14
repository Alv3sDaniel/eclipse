package com.castro.strategy;

public class CartaoCreditoStrategy implements PagamentoStategy{
	
	private String nomeCartao;
	private String numeroCartao;
	private String cvvCartao;
	private String dataExpCartao;

	
	
	public CartaoCreditoStrategy(String nomeCartao, String numeroCartao, String cvvCartao, String dataExpCartao) {		
		this.nomeCartao = nomeCartao;
		this.numeroCartao = numeroCartao;
		this.cvvCartao = cvvCartao;
		this.dataExpCartao = dataExpCartao;
	}

	public void pagar(double quantidade) {
		System.out.println("Pago com cartão de crédito! (Taxa 2%) - Valor: " + quantidade * 1.02);
	}
	

}
