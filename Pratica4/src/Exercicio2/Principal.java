package Exercicio2;

public class Principal {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Noite Gospel", 60, 15);
		iv.info();
		Ingresso i = new Ingresso("Domingo Galinha Pintadinha", 30);
		i.info();
	}

}
