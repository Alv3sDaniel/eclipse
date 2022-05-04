package q03_voo;

import q02_Data.Data;

public class Voo {
	String n_voo;
	Data data;
	String horario;
	public Cadeira[] c; ; // true = ocupada; false = disponivel
	
	public Voo(String n_Voo, int dia, int mes, int ano, String horario, int n) {
		this.n_voo = n_Voo;
		this.data = new Data(dia, mes, ano);
		this.horario = horario;
		c = new Cadeira[n];
		for(int i = 0; i < n; i++) {
			c[i] = new Cadeira();
		}
	}
	
	public void showCadeiras() {
		for(int i = 0;i < 100; i++) {
			System.out.println(c[i]);
		}
	}
	
	
	public void setN_voo(String n_voo) {
		this.n_voo = n_voo;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getVoo() {
		return n_voo;
	}
	
	public int proximoLivre() {
		for(int i = 0; i < 100; i++) {
			if(c[i].getOcupada() == false) {
				return i;
			}
		}
		return 0;
	}
	
	public boolean verifica(int n) {
		return c[n].getOcupada();
	}
	
	public boolean ocupa(int n) {
		if(verifica(n) == false) {
			c[n].setOcupada(true);
			return true;
		}
		return false;
	}
	
	public int vagas() {
		int cont = 0;
		for(int i = 0; i < 100; i++) {
			if(c[i].getOcupada() == false) {
				cont++;
			}
		}
		return cont;
	}
	
}
