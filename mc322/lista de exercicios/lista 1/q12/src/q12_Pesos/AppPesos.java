package q12_Pesos;

import java.util.Random;

public class AppPesos {
	
	public static double[] geraLista(int n) {
		double list_Pesos[] = new double[n];
		double peso = 0;
		
		Random aleatorio = new Random();
		
		for(int i = 0; i < n; i++) {
			peso = aleatorio.nextDouble(280) + 20; //gera peso aleatorio entre [20 - 300]
			list_Pesos[i] = Math.round(peso); //arredonda como ex: 250.0
		}
		
		return list_Pesos;
	}
	
	public static int buscaPosicaoMenorPeso(double[] list_Pesos) {
		int posicao = 0;
		int tamanho_lista = list_Pesos.length;
		
		for(int i = 1; i < tamanho_lista; i++) {
			if(list_Pesos[i] < list_Pesos[posicao]) {
				posicao = i;
			}
		}
		
		return posicao;
	}

	public static void main(String[] args) {
		double list_Pesos[] = new double[150]; 
		list_Pesos = geraLista(150);
		int ind = 0;
		
		ind = buscaPosicaoMenorPeso(list_Pesos);
		
		for(int i = 0; i < 150; i++) {
			System.out.println("posicao "+i+": "+ list_Pesos[i]);
		}
		System.out.println("O individuo de menor peso se encontra na posicao " + ind + " da lista");
	}
}
