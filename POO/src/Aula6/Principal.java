package Aula6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		System.out.println("Digite um valor entre 0 e 10");
		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
		try {
			if(valor>10 || valor<0) {
				throw new Exception("Valor Invalido"); //RuntimeException nao precisa de try catch
			}else {
				System.out.println("Valor: " + valor);
			}
		}
		catch(Exception e) {
			System.out.println("Aconteceu um problema: "+ e.getMessage());
		}
		*/
		/*String s1 = new String("MSG");
		String s2 = new String("MSG");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		/*Usuario u1 = new Usuario(111,"Mario","111.222.333-45");
		Usuario u2 = new Usuario(111,"Mario","111.222.333-45");
		Usuario u3 = u1;
		
		System.out.println(u1==u2);
		System.out.println(u1==u3);
		
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
		
		System.out.println(u1);*/
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.numero += 10;
		System.out.println(s1.numero);
		System.out.println(s2.numero);
		
		s2.numero += 40;
		System.out.println(s1.numero);
		System.out.println(s2.numero);
	}

}
