package br.com.globalsolution.agricultor;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.globalsolution.emprestimo.Emprestimo;
import br.com.globalsolution.mercadoria.Mercadoria;
import br.com.globalsolution.produto.Produtos;

import br.com.globalsolution.propriedade.Propriedade;

public abstract class Agricultor {

	private String nome;
	private Propriedade propriedade;
	private BigDecimal renda;
	private Mercadoria mercadoria;
	private BigDecimal telefone;
	private Emprestimo emprestimo;
	
	
	
	public Agricultor(String nome, Propriedade propriedade, BigDecimal renda, Mercadoria mercadoria) {
		this.nome = nome;
		this.propriedade = propriedade;
		this.renda = renda;
		this.mercadoria = mercadoria;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Propriedade getPropriedade() {
		return propriedade;
	}



	public void setPropriedade(Propriedade propriedade) {
		this.propriedade = propriedade;
	}



	public BigDecimal getRenda() {
		return renda;
	}



	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}



	public Mercadoria getMercadoria() {
		return mercadoria;
	}



	public void setMercadoria(Mercadoria mercadoria) {
		this.mercadoria = mercadoria;
	}
	
	
	
	@Override
	public String toString() {
		String classe = this.getClass().getSimpleName();
		
		
		System.out.println(classe);
		return "Nome: "+ nome +
				"\nTipo: " + classe +
				"\nHectares de terra:" + propriedade.getHectares() + 
				"\nRenda anual:" + renda.multiply(new BigDecimal("12"));
	}


	public BigDecimal getTelefone() {
		return telefone;
	}

	public void setTelefone(BigDecimal telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
	
}
