package q4_pertence_a_fibonacci;

import java.util.Scanner;

public class Main {
	
	public static long[] geraFibonacci(){ 
		long fibonacci[] = new long[100];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for(int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-2] + fibonacci[i-1]; 
		}
		return fibonacci;
	}

	public static void main(String[] args) {
		long fibonacci[] = new long[100];
		boolean encontrado = false;
		fibonacci = geraFibonacci();
		
		Scanner in = new Scanner(System.in);
		int numero = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < fibonacci.length; i++) {
			if(fibonacci[i] == numero) {
				encontrado = true;
			}
			System.out.println(i+":" + fibonacci[i]);
		}
		
		
		
		if(encontrado) {
			System.out.println("faz Parte");
		}
		else {
			System.out.println("nao faz parte");
		}
	}

}
