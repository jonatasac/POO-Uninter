package Aula4Herança;

public class LivroDigitalHerança extends Livro{
	public String linkDownload;
	public int tamanhoMB;
	
	public LivroDigitalHerança(String titulo,  String autor, String linkDownload) {
		super(titulo,autor);
		this.linkDownload = linkDownload;
	}
	
	public float tamanhoPorPagina() {
		return tamanhoMB / (float)paginas;
	}
	
	public float imposto() {
		return super.imposto() + 2;
	}
	public void imprimirTitulo() {
		System.out.println();
		System.out.println("O link: " + linkDownload);
		System.out.println("O titulo: " + titulo);
		System.out.println("O autor: " + autor);
	}
	
	public void imprimirImposto() {
		System.out.println("Imposto livro fisico: " + super.imposto()); //imposto da classe mãe Livro
		System.out.println("Imposto livro digital: " + this.imposto()); //imposto da classe filha LivroDigitalHerança
	}
}
