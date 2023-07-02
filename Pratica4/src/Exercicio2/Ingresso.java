package Exercicio2;

public class Ingresso {
	public String nomeEvento;
	double valor;
	
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}

	void info() {
		System.out.println("Nome do Evento: "+ nomeEvento);
		System.out.println("Valor do Evento: "+ valor);
	}
}
