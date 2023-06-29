package Exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Avaliacao luigi = new Avaliacao();
		luigi.n1 = 8;
		luigi.n2 = 6.5;
		luigi.n3 = 9;
		
		Avaliacao mario = new Avaliacao(7,4,10);
		
		System.out.println("Media Aritmetica do Mario: " + mario.mediaAritmetica());
		System.out.println("Media Ponderada do Mario: " + mario.mediaPonderada());
		System.out.println("Media Aritmetica do Mario: " + luigi.mediaAritmetica());
		System.out.println("Media Ponderada do Mario: " + luigi.mediaPonderada());
		
	}

}
