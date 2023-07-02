package Aula4Herança;

public class Livro {
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
	public Livro(String titulo, String autor) {
		this.autor = autor;
		this.titulo = titulo;
	}
	
	public float lucro() {
		return precoVenda - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
		System.out.println("O autor: " + autor);
	}
	
	public float imposto() {
		return 0.2f * lucro();
	}
}
