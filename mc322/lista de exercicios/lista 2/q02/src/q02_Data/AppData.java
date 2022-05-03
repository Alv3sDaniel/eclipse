package q02_Data;

public class AppData {

	public static void main(String[] args) {
		Data d = new Data(3, 5, 2012);
		Data e = new Data(3, 5, 2014); //-1
		Data f = new Data(3, 5, 2010); //1
		Data g = new Data(3, 6, 2012); //-1
		Data h = new Data(3, 4, 2012); //1
		Data i = new Data(4, 5, 2012); //-1
		Data j = new Data(2, 5, 2012); //1
		Data k = new Data(3, 5, 2012); //0
		
		/*System.out.println(d.getDia());
		System.out.println(d.getMes());
		System.out.println(d.getAno());
		System.out.println(d.isBissexto());
		System.out.println(d.compara(e));
		System.out.println(d.getMesExtenso());
		
		System.out.println(e.getDia());
		System.out.println(e.getMes());
		System.out.println(e.getAno());
		System.out.println(e.isBissexto());
		System.out.println(e.compara(d));
		System.out.println(e.getMesExtenso());*/
		
		System.out.println(d.compara(e));
		System.out.println(d.compara(f));
		System.out.println(d.compara(g));
		System.out.println(d.compara(h));
		System.out.println(d.compara(i));
		System.out.println(d.compara(j));
		System.out.println(d.compara(k));
		
	}

}
