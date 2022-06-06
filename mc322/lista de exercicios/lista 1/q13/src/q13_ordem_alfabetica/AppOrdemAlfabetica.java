package q13_ordem_alfabetica;

import java.util.Arrays;

public class AppOrdemAlfabetica {
	
	public static String[] juntaListas(String[] v1, String[] v2){

		int t1, t2;
		t1 = v1.length;
		t2 = v2.length;
		String[] vr = new String[t1+t2];
		int cont1,cont2;
		cont1 = cont2 = 0;
		
		while(cont1 < t1 || cont2 < t2) {
			if(cont1 == t1) {
				vr[cont1+cont2] = v2[cont2];
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
		}
		
		return vr;
		
	}
	
	public static void imprimeLista(String[] lista){
		int tamanho_lista = lista.length;
		
		for(int i = 0; i < tamanho_lista; i++){
			System.out.print(lista[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		
		String[] v1 =  {"Julio", "Creber", "Alisson", "Borba", "Nathan" };
		String[] v2 =  {"Judit", "Romario", "Andressa", "Raphael", "Jhony"};
		String[] vr;
		
		Arrays.sort(v1, String.CASE_INSENSITIVE_ORDER); // ordena v1 em ordem alfabetica;
		Arrays.sort(v2, String.CASE_INSENSITIVE_ORDER);
		
		vr = juntaListas(v1,v2);
		imprimeLista(v1);
		imprimeLista(v2);
		imprimeLista(vr);
		
		
	}
}
