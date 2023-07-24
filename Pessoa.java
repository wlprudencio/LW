package br.com.livraria.controle;

public class Pessoa {

	private String nome, CPF, CEP, numeroCelular;

	public Pessoa() {

	}

	public Pessoa(String nome, String CPF, String CEP, String numeroCelular) {
		this.nome = nome;
		this.CPF = CPF;
		this.CEP = CEP;
		this.numeroCelular = numeroCelular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome:" + nome + ", CPF:" + CPF + ", CEP: " + CEP + ", NumeroDeCelular:" 
	          + numeroCelular + "]";
	}
	

}
