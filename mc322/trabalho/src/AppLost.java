import java.util.ArrayList;
import java.util.Scanner;

public class AppLost {

	public static void main(String[] args) {
		/*ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    //varifica se algo especifico esta no arraylist
	    if(cars.contains("Mazda")) {
	    	System.out.println("tem sim");
	    }
		
	    System.out.println(cars);
	    
	    //percorre arraylist e pega o elemento do indice i
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		//remove elemento da posicao 0 do arraylist
		cars.remove(0);
		
		//remove o elemento dado como parametro
		cars.remove("BMW");
		
		System.out.println(cars);
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		int i,j;
		//pega o indice de algo especifico do arraylist
		i = cars.indexOf("Ford");
		j = cars.indexOf("Mazda");
		System.out.println(i+" "+ j );*/
		
		Scanner in = new Scanner(System.in);
		
		char comando;
		comando = in.nextLine().charAt(0);
		
		System.out.println("O comando recebido foi: " + comando);
		// duvida: como fazer o programa ler o comando sem precisar usar o "enter"?
		// ou então como incluir um enter em linhas de codigo?
		// solucao:  criar metodo mecheTeclado() dentro da classe ControleJogo que vai escutar um comando dado no teclado e chamar um metodo que realiza a acao
	}
}
