package q05_suporte_vetor;

public class Vetor {
	String vetor[];
	int cont = 0;
	
	public Vetor(int n){
		vetor = new String[n];
	}
	
	public void insert(String p) {
		if(cont < vetor.length) {
			vetor[cont] = p;
			cont++;
		}
		else {
			String vAntigo[] = vetor;
			vetor = new String[cont+1];
			for(int i = 0; i < vAntigo.length; i++) {
				vetor[i] = vAntigo[i];
			}
			vetor[cont] = p;
			cont++;
		}
	}
	
	public String get(int n) {
		if(vetor[n] != null) {
			return vetor[n];
		}
		return null;
	}
	
	public int size() {
		int tamanho = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != null) {
				tamanho++;
			}
		}
		return tamanho;
	}
}
