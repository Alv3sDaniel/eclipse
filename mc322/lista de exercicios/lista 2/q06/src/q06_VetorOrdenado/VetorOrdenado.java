package q06_VetorOrdenado;

public class VetorOrdenado {
	String vetor[];
	int cont = 0;
	
	public VetorOrdenado(int n){
		vetor = new String[n];
	}
	
	public void insert(String p) {
		boolean incluido = false;
		if(cont < vetor.length) {
			for(int i = 0; i < size(); i++) {
				if(p.compareTo(vetor[i]) < 0){
					for(int j = vetor.length-1; j > i; j--) {
						vetor[j] = vetor[j-1];
					}
					vetor[i] = p;
					cont++;
					incluido = true;
					break;
				}
			}
			if(incluido == false) {
				vetor[cont] = p;
				cont++;
			}		
		}
		else {
			String vAntigo[] = vetor;
			vetor = new String[cont+1];
			for(int i = 0; i < vAntigo.length; i++) {
				vetor[i] = vAntigo[i];
			}
			for(int i = 0; i < size(); i++) {
				if(p.compareTo(vetor[i]) < 0){
					for(int j = vetor.length-1; j > i; j--) {
						vetor[j] = vetor[j-1];
					}
					vetor[i] = p;
					cont++;
					incluido = true;
					break;
				}
			}
			if(incluido == false) {
				vetor[cont] = p;
				cont++;
			}
		}
	}
	
	public void imprime() {
		for(int i = 0; i < size(); i++) {
			System.out.println(vetor[i]);
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
	
	public VetorOrdenado merge(VetorOrdenado v2){
		int t1, t2;
		t1 = size();
		t2 = v2.size();
		VetorOrdenado vr = new VetorOrdenado(t1+t2);
		
		for(int i = 0; i < t1; i++) {
			vr.insert(vetor[i]);
		}
		
		for(int i = 0; i < t2; i++) {
			vr.insert(v2.vetor[i]);
		}
		
		/*while(cont1 < t1 || cont2 < t2) {
			if(cont1 == t1) {
				vr[cont1+cont2] = v2.vetor[cont2];
				cont2++;
			}
			else if(cont2 == t2) {
				vr[cont1+cont2] = v1[cont1];
				cont1++;
			}
			else {				
				if(v1[cont1].compareTo(v2[cont2]) < 0) {
					vr[cont1+cont2] = v1[cont1];
					cont1++;
				}
				else {
					vr[cont1+cont2] = v2[cont2];
					cont2++;
				}
			}
		}*/
		
		return vr;
		
	}
}
