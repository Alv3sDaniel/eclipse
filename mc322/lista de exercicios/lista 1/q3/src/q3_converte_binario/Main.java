package q3_converte_binario;
import java.util.Scanner;

public class Main {
	
	public static String inverteStr(String palavra) {
		String nova_palavra = "";
		for(int i = palavra.length() - 1; i >= 0; i--) {
			nova_palavra += palavra.charAt(i);
		}
		return nova_palavra;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inteiro = 0;
		String binario = "";

		inteiro = Integer.parseInt(in.nextLine());
		
		while(inteiro != 0) {
			if(inteiro%2 == 0) {
				binario += "0";
			}
			else {
				binario += "1";
			}
			inteiro = inteiro / 2;
		}
		
		binario = inverteStr(binario);
		
		System.out.println(binario);
		in.close();
	}
	
}
