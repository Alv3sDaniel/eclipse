package q2_salario;
import java.util.Scanner;
public class appSalario {
	
	public static double reajuste(double salario) {
		double salario_reajustado = 0;
		if(salario > 0 && salario <= 150) {
			salario_reajustado =  salario*(1 + 25.0/100);
		}
		else if(salario > 150 && salario <= 300) {
			salario_reajustado =  salario*(1 + 20.0/100);
		}
		else if(salario > 300 && salario <= 600) {
			salario_reajustado =  salario*(1 + 15.0/100);
		}
		else{
			salario_reajustado =  salario*(1 + 10.0/100);
		}
		return salario_reajustado;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome = "";
		double salario = 0, soma_salarios = 0, soma_SalRea = 0;
		String lst_nomes[] = new String[10];
		double lst_salarios[] = new double[10];
		double lst_SalRea[] = new double[10];
		
		nome = in.nextLine();
		
		int cont = 0;
		while(!nome.equalsIgnoreCase("FIM")) {
			salario = Float.parseFloat(in.nextLine());
			
			lst_nomes[cont] = nome;
			lst_salarios[cont] = salario;
			lst_SalRea[cont] =  reajuste(salario);
			cont++;
			nome = in.nextLine();
		}
		
		for(int i = 0; i < cont; i++) {
			soma_salarios += lst_salarios[i];
			soma_SalRea += lst_SalRea[i];
		}

		System.out.println("Soma dos salarios: " + soma_salarios);
		System.out.println("Soma dos salarios reajustados: " + soma_SalRea);
		System.out.println("diferenca entre salario reajustado e nao reajustado: " + (soma_SalRea - soma_salarios));
		
		in.close();
	}

}
