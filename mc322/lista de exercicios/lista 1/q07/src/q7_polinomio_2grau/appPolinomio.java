package q7_polinomio_2grau;

import java.util.Scanner;

public class appPolinomio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a, b, c, d, r;
		a = b = c = d = r = 0;
		
		a = Float.parseFloat(in.nextLine());
		b = Float.parseFloat(in.nextLine());
		c = Float.parseFloat(in.nextLine());
		
		d = b*b - 4*a*c;
		
		r = d > 0 ? 2 : (d == 0 ? 1 : 0); // if inline:  2 se d > 2; 1 se d = 0; 0 se d < 0  
		
		System.out.println("raizes reais: " + r);
	}

}
