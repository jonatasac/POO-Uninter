package Aula4Herança;

public class Principal {

	public static void main(String[] args) {
		Livro l1 = new Livro("A Lista de Schindler", "Nao Sei");
		l1.imposto();
		LivroDigitalHerança l2 = new LivroDigitalHerança("A Lista de Schindler", "Jonatas", "http://www.naosei.com");
		l2.imposto();
		
		l1.imprimirTitulo();
		l2.imprimirTitulo();
		
		System.out.println(l1 instanceof Livro);
		System.out.println(l2 instanceof Livro);
		System.out.println(l1 instanceof LivroDigitalHerança);
		System.out.println(l2 instanceof LivroDigitalHerança);
		
	}

}
