package q11_media_salarios;

import java.util.Random;
import java.util.Scanner;

public class appMediaSalarios {
	
	public static double[] preencheLista(int n) {
		double list_salarios[] = new double[n];
		double salario = 0;
		
		Random aleatorio = new Random();
		
		for(int i = 0; i < n; i++) {
			salario = aleatorio.nextDouble(19000) + 1000; //gera salario aleatorio entre [1000 - 20000]
			list_salarios[i] = Math.round(salario); //arredonda como ex: 15651.0
		}
		
		return list_salarios;
	}
	
	public static double mediaSalarios(double[] list_salarios) {
		double soma, media;
		soma = media = 0;
		
		int n_fun = list_salarios.length;
		
		for(int i = 0; i < n_fun; i++) {
			soma += list_salarios[i];
		}
		media = soma/n_fun;
		
		return Math.round(media); 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n_fun = 0;
		
		n_fun = Integer.parseInt(in.nextLine());
		
		double list_salarios[] = new double[n_fun];
		
		list_salarios = preencheLista(n_fun);
		for(int i = 0; i < n_fun; i++) {
			System.out.println("fun " + (i+1) + ":" + list_salarios[i]);
		}
		
		System.out.println("Media de salarios: " + mediaSalarios(list_salarios));
		in.close();
	}
}
