package Leonidas;

import java.util.Scanner;

public class Leonidas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valorCorreto = 10000;
		System.out.println("Digite seu palpite: ");
		int palpite = teclado.nextInt();
		String msg;
		
		while (palpite != valorCorreto) {
			msg = palpite>valorCorreto?"Um Pouco Menos...":"Um Pouco Mais...";
			System.out.println(msg);
			/*if (palpite > valorCorreto) {
				System.out.println("Um pouco menos...");
	
			}
			else {
				System.out.println("Um pouco mais...");
			}*/
			System.out.println("Digite outro palpite: ");
			palpite = teclado.nextInt();
		}
		System.out.println("Parabens, acertou!");
	}

}
