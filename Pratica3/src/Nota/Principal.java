package Nota;

public class Principal {

	public static void main(String[] args) {
		
		/*Nota mario = new Nota();
		Nota luigi = new Nota(9,6,7,3);
		
		System.out.println("Media Luigi");
		luigi.resultado();
		System.out.println();
		
		mario.setNota1(9);
		mario.setNota2(8);
		mario.setNota3(10);
		mario.setFaltas(5);
		
		mario.resultado();
		mario.setNota1(2);
		mario.setFaltas(10);
		mario.resultado();*/
		
		Aluno a1 = new Aluno("Mario",111,0.1,new Curso("Medicina",4000));
		a1.info();
		
		
		
	}

}
