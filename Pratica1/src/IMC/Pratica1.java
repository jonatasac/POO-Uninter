package IMC;

import java.util.Scanner;

public class Pratica1 {

	public static void main(String[] args) {
		int peso;
		double altura;
		
		System.out.println("Digite o Peso seguido de altura:");
		Scanner teclado = new Scanner(System.in);
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("IMC: %.2f", imc);

	}

}
