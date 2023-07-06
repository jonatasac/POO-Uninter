package Exercicio1;

public abstract class Computador {
	int GbMemoria;
	int numProcessadores;
	
	
	
	public Computador(int gbMemoria, int numProcessadores) {
		super();
		GbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}



	abstract double calculaValor();
}
