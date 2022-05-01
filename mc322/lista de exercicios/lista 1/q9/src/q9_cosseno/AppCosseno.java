package q9_cosseno;
import java.util.Scanner;

public class AppCosseno {
	
	public static int fat(int n) {
		int fat = 1;
		for(int i = 1; i <= n; i++) {
			fat *= i;
		}
		return fat;
	}
	
	public static double Cos(double a) {
		double cos = 1.0;
		int cont = 0;
		
		for(int i = 2; i <= 10; i+=2) {
			cont++;
			if(cont % 2 == 1) {
				cos = cos - Math.pow(a, i) / fat(i);
			}
			else {
				cos = cos + Math.pow(a, i) / fat(i);
			}	
		}
		return cos;
	}
		

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d, a, dhor, altura;
		d = a = dhor = altura = 0.0;
		
		d = Integer.parseInt(in.nextLine());
		a = Double.parseDouble(in.nextLine());
		
		dhor = d*Cos(a);
		altura = Math.sqrt(Math.pow(d, 2) - Math.pow(dhor, 2));
		
		
		System.out.println("distancia Horizontal: " + dhor);
		System.out.println("altura: " + altura);
		in.close();
	}

}
