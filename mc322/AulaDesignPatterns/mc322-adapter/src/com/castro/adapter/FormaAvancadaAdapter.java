package com.castro.adapter;

public class FormaAvancadaAdapter implements Forma {

	private FormaAvancada adaptee;

	public FormaAvancadaAdapter(FormaAvancada adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void pintar() {
		adaptee.pintarForma();

	}

	@Override
	public void redimensionar() {
		System.out.println(descricao() + " nao pode ser redimensionado");
	}

	@Override
	public String descricao() {
		if (adaptee instanceof Triangulo)
			return "Objeto Triangulo";
		else if (adaptee instanceof Losango)
			return "Objeto Losango";
			else
				return "Objeto Desconhecido";
	}

	@Override
	public boolean estaOculto() {
		return false;
	}

}
