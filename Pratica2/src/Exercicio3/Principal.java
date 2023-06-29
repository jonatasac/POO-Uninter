package Exercicio3;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"Mario",2000,500);
		
		
		c1.info();
		
		if(!c1.sacar(400)) {
			System.out.println("Não foi possivel efetuar o saque!");
		}
		c1.depositar(500);
		System.out.println();
		c1.info();

	}

}
