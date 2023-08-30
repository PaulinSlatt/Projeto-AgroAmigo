package br.com.globalsolution.emprestimo;

import java.math.BigDecimal;

import br.com.globalsolution.agricultor.Agricultor;

public class GerenciadorDeEmprestimo {

	
	public GerenciadorDeEmprestimo() {
		
	}
	
	//10hectares e 360mil anual
	public boolean  consultarEmprestimoDisponivel(Agricultor agricultor) {
		long hectares = agricultor.getPropriedade().getHectares().longValue();
		long renda = agricultor.getRenda().longValue() * 12;
		
		System.out.println(hectares);
		System.out.println("Renda"+renda);
		
		if(hectares < 10) 
			return false;
		if(renda< 360000) 
			return false;
		return true;
	}
	
	
	
}
