package q02_Data;

public class Data {
	int dia,mes,ano;
	
	public Data(int dia, int mes, int ano){
		if(dia < 1 || dia > 31 || mes < 1 || mes > 31 || ano < 1){
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
		else {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(dia >= 1 && dia <= 31)
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes >= 1 && mes <= 12)
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano >= 1)
			this.ano = ano;
	}
	
	public int compara(Data outra) {
		int status;
		if(ano > outra.getAno()){
			status = 1;
			return status;
		}
		else if(ano < outra.getAno()) {
			status = -1;
			return status;
		}
		else if(mes > outra.getMes()){
			status = 1;
			return status;
		}
		else if(mes < outra.getMes()) {
			status = -1;
			return status;
		}
		else if(dia > outra.getDia()){
			status = 1;
			return status;
		}
		else if(dia < outra.getDia()) {
			status = -1;
			return status;
		}
		return 0;
	}
	
	public String getMesExtenso() {
		String[] meses = new String[12];
		meses[0] = "Janeiro";
		meses[1] = "Feveireiro";
		meses[2] = "Marco";
		meses[3] = "Abril";
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";
		
		return meses[mes-1];
	}
	
	public boolean isBissexto() {
		if(ano % 4 == 0) {
			return true;
		}
		return false;
	}
	
	public Data clone() {
		return new Data(dia, mes, ano);
	}
	
}
