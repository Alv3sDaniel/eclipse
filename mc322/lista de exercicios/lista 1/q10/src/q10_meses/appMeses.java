package q10_meses;

import java.util.Scanner;

public class appMeses {
	
	public static String metodo1(int n) {
		int m = n % 12;
		String mes = "";
		switch(m) {
		case 1:
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Marco";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;
		}
		
		return mes;
	}
	
	public static String metodo2(int n) {
		int m = n % 12;
		String mes;
		String list_Meses[] = new String[12];
		list_Meses[0] = "Janeiro";
		list_Meses[1] = "Fevereiro";
		list_Meses[2] = "Marco";
		list_Meses[3] = "Abril";
		list_Meses[4] = "Maio";
		list_Meses[5] = "Junho";
		list_Meses[6] = "Julho";
		list_Meses[7] = "Agosto";
		list_Meses[8] = "Setembro";
		list_Meses[9] = "Outubro";
		list_Meses[10] = "Novembro";
		list_Meses[11] = "Dezembro";
		
		mes = list_Meses[m-1];
		
		return mes;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		n = Integer.parseInt(in.nextLine());
		
		System.out.println("Metodo 1: Mes: " + metodo1(n));
		System.out.println("Metodo 2: Mes: " + metodo2(n));
		in.close();
	}
}
