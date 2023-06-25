package Aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		//Scanner teclado = new Scanner(System.in);
		a.matricula = 1001;
		a.nome = "Super Mario";
		a.cpf = "15913628759";
		
//		Aluno b = new Aluno();
//		b.matricula = 1002;
//		b.nome = "Yoshi";
//		b.cpf = "14953638456";
		
		a.info();
		//b.info();
		
		/*Turma nova = new Turma();
		nova.prof = new Professor();
		nova.prof.nome = "Jonatas";
		nova.alunos = new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome = "Super Mario";*/
		
		Aluno c = new Aluno(1003,"Super Luigi", "222.333.444-55");
		c.info();
		
		Aluno d = new Aluno(1004);
		d.info();
		ArrayList<Aluno> alunos = new ArrayList();
		alunos.add(d);
		alunos.add(new Aluno(1005,"Bowser","666.777.888-99"));
		d.info();
		
	}

}
