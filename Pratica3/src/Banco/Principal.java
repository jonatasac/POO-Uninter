package Banco;

public class Principal {

	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		
		c.add(new Moeda("Real",0.5));
		c.add(new Moeda("Real",1));
		c.add(new Moeda("Real",0.1));
		c.add(new Moeda("Real",0.05));
		c.add(new Moeda("Real",0.25));
		
		System.out.printf("Total: %.2f \n", c.calcularTotal());

	}

}
