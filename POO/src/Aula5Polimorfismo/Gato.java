package Aula5Polimorfismo;

public class Gato implements Animal{

	@Override
	public void emitirSom() {
		System.out.println("MIAU");
		
	}

	@Override
	public void dormir() {
		System.out.println("zzz");
		
	}
	
}
