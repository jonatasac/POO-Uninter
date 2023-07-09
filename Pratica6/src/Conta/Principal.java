package Conta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta c1 = new Conta("Mario",5000);
		Conta c2 = new Conta("Luigi",2000);
		boolean sucessoLeitura = false;
		while(!sucessoLeitura) {
			try {
				/*c1.info();
				c2.info();
				c1.depositar(500);
				c2.depositar(800);
				c1.info();
				c2.info();
				c1.sacar(900);
				c2.sacar(300);*/
				c1.info();
				c2.info();
				System.out.println("Digite um valor para transferir:");
				double valorTransferir = teclado.nextDouble();
				c1.transferir(valorTransferir, c2);
				System.out.println();
				c1.info();
				c2.info();
				sucessoLeitura = true;
			}
			catch(Exception e){
				System.out.println("Ocorreu um erro, coloque um valor valido!");
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("\nFechando Programa...");
			}
		}
		
		
	}

}
