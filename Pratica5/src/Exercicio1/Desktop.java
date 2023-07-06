package Exercicio1;

public class Desktop extends Computador{
	double acessorios;

	@Override
	double calculaValor() {
		double total = 200 * GbMemoria + 400 * numProcessadores + acessorios;
		return total;
	}

	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}
	

}
