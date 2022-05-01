package q1_impares_no_intervalo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String entrada = "";
		int a = 0, b = 0;
		
		entrada = in.nextLine();
		a = Integer.parseInt(entrada);
		entrada = in.nextLine();
		b = Integer.parseInt(entrada);
		
		for(int i = a; i < b; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		in.close();
	}
}
