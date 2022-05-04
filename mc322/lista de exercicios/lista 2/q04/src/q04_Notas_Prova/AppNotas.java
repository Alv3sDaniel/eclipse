package q04_Notas_Prova;

public class AppNotas {

	public static void main(String[] args) {
		Gabarito g = new Gabarito();
		Prova a1 = new Prova(g);
		Prova a2 = new Prova(g);
		
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('C');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		a1.respostaAluno('A');
		
		System.out.println("acertos a1:" + a1.acertos());
		System.out.println("nota a1:" +a1.nota());
		
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('A');
		a2.respostaAluno('C');
		
		System.out.println("acertos a2:" + a2.acertos());
		System.out.println("nota a2:" + a2.nota());
		
		System.out.println("maior: "+a1.maior(a2));

	}

}
