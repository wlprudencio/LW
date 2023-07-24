package br.com.livraria.controle;

public class Livro {

	private String isbn; //Padrão Internacional de Numeração de Livro
	private String titulo;
	private long ano;
	private Autor autor; //Metodo que se referencia e puxa os metodos
	
	public Livro() {
		
	}
	
	public Livro(String isbn, String titulo, long ano) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
		
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getAno() {
		return ano;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro: " + this.titulo + "/n";
	}
	
	

	}
