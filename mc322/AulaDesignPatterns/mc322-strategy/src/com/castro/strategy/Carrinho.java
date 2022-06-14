package com.castro.strategy;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Item> listaItens;
	
	public Carrinho() {
		this.listaItens = new ArrayList<Item>();
	}
	
	public void adicionaItem(Item item) {
		listaItens.add(item);
	}
	
	public void removeItem(Item item) {
		listaItens.remove(item);
	}
	
	public double calculaValorTotal() {
		double soma = 0;
		for(Item it : listaItens) {
			soma+= it.getPreco();
		}
		return soma;
	}
	
	public void pagar(PagamentoStategy metodoPagamento) {
		metodoPagamento.pagar(calculaValorTotal());
	}

}
