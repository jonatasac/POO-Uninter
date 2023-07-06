package Aula5Polimorfismo;

public abstract class Funcionario {
	String nome;
	
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract float pagamento();

}
