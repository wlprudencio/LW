package br.com.livraria.controle;

public class Editora {

	private String nome;
	private String codigo;

	public Editora() {

	}

	public Editora(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
