package edu.fatec.exercicio2;

public class Produto {
	
	private String nome;
	private String unidade;
	private String descricao;
	private double preco;
	private double descontoMaximo;
	private Supermercado superMercado;
	
	public Produto(Supermercado s) {
		
	}
	
	public String toString() {
		return "";
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getDescontoMaximo() {
		return descontoMaximo;
	}


	public void setDescontoMaximo(double descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}


	public Supermercado getSuperMercado() {
		return superMercado;
	}


	public void setSuperMercado(Supermercado superMercado) {
		this.superMercado = superMercado;
	}	
	
}
