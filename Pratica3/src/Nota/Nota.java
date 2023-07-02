package Nota;

public class Nota {
	private double nota1;
	private double nota2;
	private double nota3;
	private int faltas;
	
	public Nota() {
		
	}
	
	public Nota(double nota1, double nota2, double nota3, int faltas) {
		super();
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
		setFaltas(faltas);
	}
	public void setNota1(double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Nota Invalida");
			return;
		}
		nota1 = nota;
	}
	public void setNota2(double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Nota Invalida");
			return;
		}
		nota2 = nota;
	}
	public void setNota3(double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Nota Invalida");
			return;
		}
		nota3 = nota;
	}
	
	
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		if(faltas>40 || faltas<0) {
			System.out.println("Numero de faltas invalido");
			return;
		}
		this.faltas = faltas;
	}
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public double getNota3() {
		return nota3;
	}
	
	void resultado() {
		double media = (nota1 + nota2 + nota3)/3;
		System.out.println("Media: " + media);
		System.out.println("Numero de faltas: " + faltas);
		if(faltas>7) {
			System.out.println("Reprovado por faltas");
		}		
		else if (media < 4) {
			System.out.println("Reprovado por notas");
		}
		else if (media<7) {
			System.out.println("Exame Final");
		}
		else {
			System.out.println("Aprovado");
		}
	}
}
