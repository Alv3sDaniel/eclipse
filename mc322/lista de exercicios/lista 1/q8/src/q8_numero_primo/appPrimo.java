package q8_numero_primo;

import java.util.Scanner;

public class appPrimo {
	
	public static int[] geraListPrimos(int n) {
		int listPrimos[] = new int[n];
		int cont, cont_primos, conta_multiplos;
		cont = cont_primos = conta_multiplos = 0;
		
		while(cont_primos != n) {
			conta_multiplos =  0;
			for(int i = 1; i <= cont; i++) {
				if(cont%i == 0) {
					conta_multiplos++;
				}
			}
			if(conta_multiplos == 2) {
				listPrimos[cont_primos] = cont;
				cont_primos++;
			}
			cont++;
		}
		
		return listPrimos; 
	}
	
	public static boolean ePrimo(int n) {
		int listPrimos[] = new int[n];
		listPrimos = geraListPrimos(n);
		
		for(int i = 0; i < n; i++) {
			if(n == listPrimos[i]) {
				return true;
			}
			else if(n < listPrimos[i]) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		
		n = Integer.parseInt(in.nextLine());
		int lista_primos[] = new int[n];
		
		lista_primos = geraListPrimos(n);
		
		for(int i = 0; i < n; i++) {
			if (i < n - 1) {
				System.out.print(lista_primos[i] + " ");
			}
			else {
				System.out.println(lista_primos[i]);
			}
		}
		
		
		String resp = ePrimo(n) ? "E Primo" : "Nao e Primo";
		System.out.print( n + " " + resp);
		in.close();
	}

}
