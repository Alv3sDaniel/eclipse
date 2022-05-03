package q01_Notas;

public class Aluno {
	String matricula;
	String nome;
	double p1, p2, t;
	
	Aluno(String matricula, String nome, Double p1, Double p2, Double t){
		this.matricula = matricula;
		this.nome = nome;
		this.p1 = p1;
		this.p2 = p2;
		this.t = t;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}


	public double media() {
		double media;
		media = (2.5*p1 + 2.5*p2 + 2*t)/7; 
		return media;
	}
	public double Final() {
		double f;
		if(media() < 5 ) {
			f = 10 - media();
			return f;
		}
		return 0;
		
	}
}
