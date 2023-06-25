package Transição;

import java.util.Scanner;

public class PythonToJava {
	
	public static void print(float x) {
		System.out.println(x);
	}
	
	public static float media(float a, float b, float c) {
		float resultado = (a+b+c)/3;
		return resultado;
	}
	
	public static void main(String[] args) {
		/*System.out.println("Alo mamae");
		System.out.println("Alo papai");
		int idade = 20; //inteiro - não tem parte fracionaria 4bytes
		float peso; //float - pode representar valores reais com fração 4bytes
		double massa = 125.65; //double - pode representar valores reais com maior precisão com fração 8 bytes
		char inicial = 'L'; //apenas aspas simples
		boolean maiorDeIdade = false;
		String nome = "Mario"; //apenas aspas duplas
		int tamanhoString = nome.length();
		System.out.println("O tamanho da String eh: " + tamanhoString);*/
		
		/*int resultado;
		resultado = 4 + 3;
		System.out.println(resultado);
		double resultado1;
		resultado1 = 4d / 3;
		System.out.println(resultado1);*/
		
		/*double resultado;
		resultado = Math.pow(2,3); //numero elevado a potencia
		resultado = Math.sqrt(9); //raiz quadrada
		System.out.println(resultado);*/
		
		/*System.out.println("Digite sua idade:");
		Scanner teclado = new Scanner(System.in); //Lê o teclado como entrada.
		int idade = teclado.nextInt(); //Lê valor inteiro
		System.out.println("Sua idade eh: " + idade + " anos!");
		if(idade < 18) {
			System.out.println("Voce eh Menor de idade!");
		}
		else if (idade < 65) {
			System.out.println("Voce eh Adulto!");
		}
		else {
			System.out.println("Voce ja eh um veiaco!");
		}*/
		
		Scanner teclado = new Scanner(System.in);
		/*String nome;
		print("ola mundo, agora sim digite um nome");
		nome = teclado.next();
		print("Seu nome eh: " + nome);*/
		float x = teclado.nextFloat();
		float y = teclado.nextFloat();
		float z = teclado.nextFloat();
		print(media(x,y,z));
		
	}
}
