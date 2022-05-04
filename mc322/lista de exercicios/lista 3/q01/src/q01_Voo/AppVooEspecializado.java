package q01_Voo;

public class AppVooEspecializado {

	public static void main(String[] args) {
		VooEspecializado ve = new VooEspecializado("48", 4, 3, 2012, "01:25:55", 120);
		
		ve.cadeiraFumantes(20);
		System.out.println("Proxima posicao livre: "+ve.proximoLivre());
		System.out.println("verifica cadeira da posicao 45 esta ocupada:"+ve.verifica(115));
		System.out.println("ve se a cadeira da posicao 45 pode ser ocupada:"+ve.ocupa(115));
		System.out.println("verifica cadeira da posicao 45 esta ocupada:"+ve.verifica(115));
		System.out.println("vagas que estao disponiveis:"+ve.vagas());
		System.out.println("numero maximo de vagas: "+ve.maxVagas());
		System.out.println(ve.c[2].getOcupada());
		System.out.println("numero do voo: "+ve.getVoo());
		
		System.out.println(ve.tipo(99));
		System.out.println(ve.tipo(119));

	}

}
