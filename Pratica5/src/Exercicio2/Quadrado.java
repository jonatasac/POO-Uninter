package Exercicio2;

public class Quadrado implements Imprimivel{
	int medidaLado;

	@Override
	public void imprimir() {
		System.out.println("Quadrado:");
		System.out.println("Lado: "+medidaLado);
		System.out.println("Area: "+(medidaLado*medidaLado));
		System.out.println("-----");
		
	}

	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}
}
