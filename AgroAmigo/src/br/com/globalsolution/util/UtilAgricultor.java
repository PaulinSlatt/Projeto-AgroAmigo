package br.com.globalsolution.util;

import java.math.BigDecimal;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import br.com.globalsolution.agricultor.Agricultor;
import br.com.globalsolution.agricultor.AgricultorPF;
import br.com.globalsolution.agricultor.AgricultorPJ;
import br.com.globalsolution.mercadoria.Mercadoria;
import br.com.globalsolution.propriedade.Propriedade;

public class UtilAgricultor {

	
	
	
	protected static Agricultor geraAgricultor(int opcao){
		Agricultor agricultor = null;
		String nome = showInputDialog("Digite seu nome");
		BigDecimal renda = new BigDecimal(showInputDialog("Digite sua renda MENSAL sem virgulas: "+ "\nExemplo: 20.000"));
		
		BigDecimal hectares = new BigDecimal(showInputDialog("Digite quantos hectares tem sua propriedade: "+ "\nExemplo: 10"));
		Propriedade propriedade = new Propriedade(hectares);
		Mercadoria mercadoria = new Mercadoria();

		if(opcao ==1) {
			BigDecimal cnpj = new BigDecimal(showInputDialog("Digite seu CNPJ sem / ou - : "+ "\nExemplo: 12.345.678.0001.00"));
			agricultor = new AgricultorPJ(nome, propriedade, renda, mercadoria, cnpj);
		}
		if(opcao ==2) {
			BigDecimal cpf = new BigDecimal(showInputDialog("Digite seu CPF sem - : "+ "\nExemplo: 123.123.123.12"));
			agricultor = new AgricultorPF(nome, propriedade, renda, mercadoria, cpf);
		}
		return agricultor;
	}
	
	
	
}
