package br.com.globalsolution.agricultor;

import java.math.BigDecimal;

import br.com.globalsolution.mercadoria.Mercadoria;
import br.com.globalsolution.propriedade.Propriedade;

public class AgricultorPF extends Agricultor{

	private BigDecimal cpf;

	public AgricultorPF(String nome, Propriedade propriedade, BigDecimal renda, Mercadoria mercadoria, BigDecimal cpf) {
		super(nome, propriedade, renda, mercadoria);
		this.cpf = cpf;
	}
	
	public BigDecimal getCpf() {
		return cpf;
	}

	public void setCpf(BigDecimal cpf) {
		this.cpf = cpf;
	}

	
	
	
	
	
}
