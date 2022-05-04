package q01_Voo;

import q03_voo.Voo;

public class VooEspecializado extends Voo {
	
	VooEspecializado(String n_Voo, int dia, int mes, int ano, String horario, int n_cadeiras) {
		super(n_Voo, dia, mes, ano, horario, n_cadeiras);
	}
	
	public int maxVagas() {
		return c.length;
	}
	
	public void cadeiraFumantes(int n) {
		int tamanho = c.length-1;
		int cont = 0;
		if(n < maxVagas()) {
			while(cont < n) {
				c[tamanho].setTipo("F");
				tamanho--;
				cont++;
			}
		}
	}
	
	public String tipo(int n) {
		return c[n].getTipo();
	}
	
	public int vagas() {
		int cont = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i].getOcupada() == false) {
				cont++;
			}
		}
		return cont;
	}

}
