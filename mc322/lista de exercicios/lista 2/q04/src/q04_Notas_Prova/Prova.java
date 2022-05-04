package q04_Notas_Prova;

public class Prova {
	char resposta[] = new char[15];
	int contQuestoes = 0;
	Gabarito g;
	
	public Prova(Gabarito g) {
		this.g = g;
	}
	
	public void respostaAluno(char r) {
		resposta[contQuestoes] = r;
		contQuestoes++;
	}
	
	public int acertos() {
		
		int acertos = 0;
		for(int i = 0; i < resposta.length; i++) {
			if(resposta[i] == g.respostaQuestao(i)) {
				acertos++;
			}
		}
		return acertos;
	}
	
	public double nota() {
		double nota = 0;
		for(int i = 0; i < resposta.length; i++) {
			if(resposta[i] == g.respostaQuestao(i)) {
				if(i < 10 ) {
					nota += 0.5;
				}
				else {
					nota += 1;
				}
			}
		}
		return nota;
	}
	
	public double maior(Prova outro) {
		double acAtual = acertos();
		double nAtual = nota();
		
		if(acAtual > outro.acertos()) {
			return acAtual;
		}
		else if(this.acertos() < outro.acertos()) {
			return outro.acertos();
		}
		else if(nAtual > outro.nota()) {
			return nAtual;
		}
		else if(nAtual < outro.nota()) {
			return outro.nota();
		}
		return nAtual;
	}
	
}
