package Aula5Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		/*Funcionario f1 = new Funcionario("Mario");
		Funcionario f2 = new Funcionario("Mario");
		
		System.out.println("Nome f1: " + f1.nome);
		System.out.println("Nome f2: " + f2.nome);
		System.out.println();
		
		f2.nome = "Luigi";
		
		System.out.println("Nome f1: " + f1.nome);
		System.out.println("Nome f2: " + f2.nome);
		System.out.println();*/
		
		/*Funcionario f1 = new Assalariado("Mario",3500);
		f1 = new Horista("Luigi",100,40.5f);
		
		Funcionario funcionarios[] = {new Assalariado ("Mario",3500), 
									new Horista("Luigi",100,40.5f), 
									new Comissionado("Yoshi",50000,0.05f)};
		float total = 0;
		Funcionario f;
		for(int i=0; i<funcionarios.length;i++) {
			f = funcionarios[i];
			System.out.println(f.nome + " salario: " + f.pagamento());
			total += f.pagamento();
		}
		System.out.println("Total: " + total);*/
		
		/*Gato g1 = new Gato();
		Animal a1 = new Gato();
		a1.emitirSom();
		g1.emitirSom();
		a1.dormir();
		g1.dormir();*/
			
		Roupa r1 = new Roupa("Camisa",3,Estacao.VERAO);
		r1.msg();
	}

}
