package q6_palindromo;

import java.util.Scanner;

public class appPalindromo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String palavra = "";
		String inversa = "";
		
		palavra = in.nextLine();
		
		for(int i = palavra.length()-1; i >= 0 ; i--)
			inversa += palavra.charAt(i);			
		
		String resp =  palavra.equalsIgnoreCase(inversa) ? "e palindromo" : "nao e palindromo";
		
		System.out.println("palavra: " + palavra);
		System.out.println("inversa: " + inversa);
		System.out.println(resp);
		in.close();
	}

}
