import java.util.Scanner;

public class AppLost {

	public static void main(String[] args) {
		char comando;
		ControleJogo cj = new ControleJogo();
		Scanner in = new Scanner(System.in);
		System.out.println("Hello world!");
		comando = in.nextLine().charAt(0);
		
		cj.comando(comando);
	}

}
