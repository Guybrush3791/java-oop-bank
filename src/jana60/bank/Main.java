package jana60.bank;

public class Main {

	public static void main(String[] args) {
		
		Conto c = new Conto(2342342, "Pluto");
		
		System.out.println(c);
		System.out.println("---------------------------------------");
		
		c.addMoney(100);
		System.out.println(c);
		
		System.out.println("---------------------------------------");
		
		boolean res = c.getMoney(40);
		System.out.println("risultato prelievo: " + res);
		System.out.println("---------------------------------------");
		System.out.println(c);
		
		System.out.println("---------------------------------------");
		
		res = c.getMoney(140);
		System.out.println("risultato prelievo: " + res);
		System.out.println("---------------------------------------");
		System.out.println(c);
	}
}
