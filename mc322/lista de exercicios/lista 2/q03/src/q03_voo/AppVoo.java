package q03_voo;

public class AppVoo {

	public static void main(String[] args) {
		
		Voo a = new Voo("28", 23, 05, 2012, "13:24:50", 100);
		
		a.c[0] = new Cadeira();
		
		//a.showCadeiras();
		System.out.println(a.proximoLivre());
		System.out.println(a.verifica(45));
		System.out.println(a.ocupa(45));
		System.out.println(a.verifica(45));
		System.out.println(a.vagas());
		System.out.println(a.getVoo());
		
	}

}
