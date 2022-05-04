package q05_suporte_vetor;

public class AppVetor {

	public static void main(String[] args) {
		Vetor v = new Vetor(3);
		
		v.insert("paulo");
		v.insert("roberto");
		v.insert("carlo");
		v.insert("leandro");
		
		System.out.println(v.size());
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
	}

}
