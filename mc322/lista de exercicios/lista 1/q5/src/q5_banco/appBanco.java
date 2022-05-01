package q5_banco;

import java.util.Scanner;

public class appBanco {

	public static void main(String[] args) {
		float p, a, i; //p: dinheiro emprestado; a: reais pagos por mes; i: porcentagem do saldo corrente (juros)
		float juros_mes, valor_de_abatimento, juros_acumulado, valor_ultima_prestação;
		int n_meses;
		p = a = i = juros_mes = valor_de_abatimento = juros_acumulado = valor_ultima_prestação = 0;
		n_meses = 0;
		
		Scanner in = new Scanner(System.in);
		
		p = Float.parseFloat(in.nextLine());
		a = Float.parseFloat(in.nextLine());
		i = Float.parseFloat(in.nextLine());
		
		while(p > 0){
			n_meses++;
			juros_mes = p * (i/100);
			valor_de_abatimento = a - juros_mes;
			juros_acumulado += juros_mes;
			
			if(valor_de_abatimento > p) {
				valor_ultima_prestação = valor_de_abatimento - (valor_de_abatimento - p);
				p = p - valor_ultima_prestação;
				//p = p - 300;
				System.out.println("mes:"+ n_meses );
				System.out.println("Dinheiro aplicado no pagamento da divida:"+ valor_ultima_prestação);
				System.out.println("valor acumulado de juros ja pagos:" + juros_acumulado);
				System.out.println("Saldo devedor: " + p);
				
			}
			else {
				p = p - valor_de_abatimento;
				//p = p - 300;
				System.out.println("mes:"+ n_meses );
				System.out.println("Dinheiro aplicado no pagamento da divida:"+ valor_de_abatimento );
				System.out.println("valor acumulado de juros ja pagos:" + juros_acumulado);
				System.out.println("Saldo devedor: " + p);
				
			}
			
		}
		
		System.out.println("meses necessarios para quitar o emprestimo: " + n_meses);
		System.out.println("valor da ultima parcela: " + valor_ultima_prestação);
		in.close();
	}

}
