package com.castro.strategy;

import java.util.ArrayList;

public class appStrategy {
	
	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		Item it1 = new Item("abc",22.22);
		Item it2 = new Item("efg",11.11);
		
		carrinho.adicionaItem(it1);
		carrinho.adicionaItem(it2);
		
		PayPalStrategy paypal = new PayPalStrategy("garderio@ic.unicamp.br", "umdoistres");
		PagamentoStategy cc = new CartaoCreditoStrategy("G-Unicamp", "123456", "999", "12-2027");
		
		
		carrinho.pagar(paypal);
		carrinho.pagar(cc);
		
		
		
		
		
		ArrayList<PagamentoStategy> lista = new ArrayList<>();
		lista.add(paypal);
		lista.add(cc);
		for(PagamentoStategy p : lista) {
			p.pagar(10);
		}
	}

}
