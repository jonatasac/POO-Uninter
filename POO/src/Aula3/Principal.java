package Aula3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		/*Horario aula = new Horario();
		
		aula.setHora(12);
		aula.setMinuto(30);
		aula.setSegundo(20);
		
		aula.info();*/
		
		/*ArrayList<Integer> lista = new ArrayList();
		HashSet<Integer> conjunto = new HashSet();
		HashMap<String,Integer> mapa = new HashMap();
		
		int soma;
		soma = 0;
		for(int i=0;i<lista.size();i++) {
			soma += lista.get(i);
		}
		
		soma = 0;
		for(int item : lista) {
			soma+=item;
		}
		
		soma = 0;
		//Iterator it = mapa.entrySet().iterator();
		//Iterator it = conjunto.iterator();
		Iterator it = lista.iterator();
		
		while(it.hasNext()) {
			soma+=(int)it.next();
		}*/
		
		LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		System.out.println(dataHoje.format(formatador));

	}

}
