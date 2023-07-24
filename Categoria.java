package br.com.livraria.controle;

public class Categoria extends Livro {

	private long codigo;
	private String descricao;

	public Categoria() {

	}

	public Categoria(long codigo, String descricao, String isbn, String titulo, long ano) {
		this.codigo = codigo;
		this.descricao = descricao;
		super.setIsbn(isbn);
		super.setTitulo(titulo);
		super.setAno(ano);
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}

