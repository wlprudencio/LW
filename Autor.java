package br.com.livraria.controle;

import java.util.ArrayList;
import java.util.List;

public class Autor  {

	private String nome;
	private List<Livro> livro = new ArrayList<>();

	public Autor() {

	}

	public Autor(String nome, String isbn, String titulo, long ano, Livro livro) {
		this.nome = nome;
		this.livro = new ArrayList<>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

}
