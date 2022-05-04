package q02_Equipamento;

public class Equipamento {
	private double valor[];
	
	Equipamento(int n){
		valor = new double[n];
		
	}
	
	public int getNumeroEquipamentos() {
		return valor.length;
	}

	public double getValor(int n) {
		return valor[n];
	}

	public void setValor(int n, double valor) {
		this.valor[n] = valor;
	}
	
}
