package q02_Equipamento;

public class EquipamentoCorrigido extends Equipamento {
	int mesCorrente;
	private int mesCompra;

	EquipamentoCorrigido(int n, int mesCompra) {
		super(n);
		this.mesCompra = mesCompra;
		this.mesCorrente = 1;
	}
	
	public int getMesCorrente(int n) {
		return mesCorrente;
	}

	public void setMesCorrente(int mesCorrente) {
		if(mesCorrente > 12) {
			mesCorrente = mesCorrente % 12;
		}
		this.mesCorrente = mesCorrente;
	}
	
	public int getMesCompra(int n) {
		return mesCompra;
	}

	public void setMesCompra(int n, int mesCompra) {
		this.mesCompra = mesCompra;
	}
	
	public void corrige(double a) {
		for(int i = 0; i < getNumeroEquipamentos(); i ++) {
			if(getMesCompra(i) == getMesCorrente(i)) {
				setValor(i, getValor(i)*(1+(a/100)));
			}
		}
		setMesCorrente(getMesCorrente(1)+1);
	}
	
	public void imprime() {
		for(int i = 0; i < getNumeroEquipamentos(); i ++) {
			System.out.println(getValor(i));
			System.out.println(getMesCorrente(i));
			System.out.println(getMesCompra(i));
			System.out.println("=====");
		}
	}
	
	public void substitui(EquipamentoCorrigido b) {
		if(getNumeroEquipamentos() == b.getNumeroEquipamentos()) {
			for(int i = 0; i < getNumeroEquipamentos(); i++) {
				setValor(i, b.getValor(i));
				setMesCompra(i, b.getMesCompra(i));
			}
		}
	}
	
}
