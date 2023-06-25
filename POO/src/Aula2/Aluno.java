package Aula2;

public class Aluno {
	int matricula;
	String nome;
	String cpf;
	
	Aluno(){
		System.out.println("Aluno criado sem parametros");
	}
	
	public Aluno(int matricula) {
		super();
		this.matricula = matricula;
	}

	Aluno(int matricula, String nome, String cpf){
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	void info() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
		
	}
}
