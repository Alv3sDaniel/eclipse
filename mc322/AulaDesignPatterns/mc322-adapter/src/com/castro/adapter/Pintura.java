package com.castro.adapter;

import java.util.ArrayList;

public class Pintura {
	ArrayList<Forma> formas = new ArrayList<Forma>();

	public Pintura() {
	}

	public void addForma(Forma forma) {
		formas.add(forma);
	}

	public ArrayList<Forma> getFormas() {
		return new ArrayList<Forma>(formas);
	}

	public void pintar() {
		if (formas.isEmpty()) {
			System.out.println("Nada para pintar...");
		} else {
			formas.stream().forEach(f -> f.pintar());

		}
	}

	public void redimensionar() {
		if (formas.isEmpty())
			System.out.println("Nada para redimensionar");
		else
			formas.stream().forEach(f -> f.redimensionar());
	}
}