package q06_VetorOrdenado;

public class AppVetorOrdenado {

	public static void main(String[] args) {
		VetorOrdenado a = new VetorOrdenado(5);
		VetorOrdenado b = new VetorOrdenado(5);
		VetorOrdenado c;
		
		a.insert("Ana");
		a.insert("Beto");
		a.insert("Zelda");
		a.insert("Maluko");

		b.insert("Danilo");
		b.insert("Clara");
		b.insert("New");
		
		a.imprime();
		System.out.println("====");
		b.imprime();
		System.out.println("====");
		c = a.merge(b);
		
		c.imprime();
		c.insert("Crla");
		System.out.println("====");
		c.imprime();

	}

}
