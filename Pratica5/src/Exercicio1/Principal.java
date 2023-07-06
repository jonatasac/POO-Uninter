package Exercicio1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Desktop comp1 = new Desktop(8,4,600);
		Notebook comp2 = new Notebook(8,4,15);
		
		Computador comp;
		
		ArrayList<Computador> listaComputadores = new ArrayList();
		
		listaComputadores.add(comp1);
		listaComputadores.add(comp2);
		listaComputadores.add(new Desktop(16,8,1200));
		listaComputadores.add(new Notebook(16,8,18));
		
		double total = 0;
		for(Computador c : listaComputadores) {
			System.out.println("Valor Computador: " + c.calculaValor());
			System.out.println();
			total += c.calculaValor();
		}
		System.out.println("Total do valor: " + total);
	}

}
