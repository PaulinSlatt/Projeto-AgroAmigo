package br.com.globalsolution.agricultor;

import java.math.BigDecimal;

import br.com.globalsolution.mercadoria.Mercadoria;
import br.com.globalsolution.propriedade.Propriedade;

public class AgricultorPJ extends Agricultor{
	
	private BigDecimal cnpj;
	
	public AgricultorPJ(String nome, Propriedade propriedade, BigDecimal renda, Mercadoria mercadoria, BigDecimal cnpj) {
		super(nome, propriedade, renda, mercadoria);
		this.cnpj = cnpj;
	}

	public BigDecimal getCnpj() {
		return cnpj;
	}

	public void setCnpj(BigDecimal cnpj) {
		this.cnpj = cnpj;
	}
	
	
	

}
