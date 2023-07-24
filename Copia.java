package br.com.livraria.controle;

public class Copia {

	private long codigo;
	private double preco;

	public Copia() {

	}

	public Copia(long codigo, double preco) {
		this.codigo = codigo;
		this.preco = preco;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
