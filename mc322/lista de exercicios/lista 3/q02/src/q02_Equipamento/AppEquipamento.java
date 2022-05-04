package q02_Equipamento;

public class AppEquipamento {

	public static void main(String[] args) {
		Equipamento e = new Equipamento(4);
		EquipamentoCorrigido ec1 = new EquipamentoCorrigido(4, 2);
		EquipamentoCorrigido ec2 = new EquipamentoCorrigido(4, 5);
		
		e.setValor(0, 100);
		e.setValor(1, 300);
		e.setValor(2, 400);
		e.setValor(3, 500);
		
		
		ec1.setValor(0, 100);
		ec1.setValor(1, 200);
		ec1.setValor(2, 300);
		ec1.setValor(3, 400);
		
		ec2.setValor(0, 200);
		ec2.setValor(1, 400);
		ec2.setValor(2, 600);
		ec2.setValor(3, 800);
		
		
		//ec.imprime();
		ec1.corrige(10);
		//ec.imprime();
		ec1.corrige(10);
		ec1.imprime();
		
		ec1.substitui(ec2);
		ec2.imprime();
		ec1.imprime();
		
	}
}
