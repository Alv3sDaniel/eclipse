package q03_voo;

public class Cadeira {
	Boolean ocupada;
	String tipo;
	
	public Cadeira(){
		this.ocupada = false;
		this.tipo = "N";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getOcupada() {
		return ocupada;
	}

	public void setOcupada(Boolean ocupada) {
		this.ocupada = ocupada;
	}

}
