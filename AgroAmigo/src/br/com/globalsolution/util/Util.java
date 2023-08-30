package br.com.globalsolution.util;


import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.globalsolution.agricultor.Agricultor;
import br.com.globalsolution.emprestimo.GerenciadorDeEmprestimo;



public class Util {
	
	private List<Agricultor> agricultores = new ArrayList<>();
	
	public void menu() {
		int opcao;
//		String aux = "Gerenciador de Emprestimos\n";
//		aux += "1. Cadastrar Agricultor\n";
//		aux += "2. Consultar Emprestimo\n";
//		aux += "3. Lista Agricultores\n";
//		aux += "4. Deletar Agricultor\n";
//		aux += "5. Fechar programa\n";
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
	
			switch (opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				consultarEmprestimo();
				break;
			case 3:
				if(agricultores.isEmpty()) {
					showMessageDialog(null, "Lista está vazia,tente adicionar um agricultor");
					break;
				}
				showMessageDialog(null, listaAgricultor());
				break;
			case 4:
				deletar();
				break;
			case 5:
				break;
			default:
				showMessageDialog(null, "Opcao invalida");
			}
		} while(opcao != 5);
	}
	


	private  void cadastrar() {
		int opcao =0;
		while(opcao !=1 && opcao!=2) {
			opcao = parseInt(showInputDialog("Escolha o tipo do cadastro:"+ "\n1. Agricultor CNPJ"+ "\n2. Agricultor CPF"));
		}
		agricultores.add(UtilAgricultor.geraAgricultor(opcao));
		showMessageDialog(null,"Agricultor adicionado com sucesso");
	}



	private void consultarEmprestimo() {
		if(agricultores.isEmpty()) {
			showMessageDialog(null, "Não há agricultores para consultar");
			
		}else {
			int index = indexEmprestimoDisponivel();
			GerenciadorDeEmprestimo geren = new GerenciadorDeEmprestimo();
			boolean podePegarEmprestimo = geren.consultarEmprestimoDisponivel(agricultores.get(index));
			if(podePegarEmprestimo) {
				agricultores.get(index).setTelefone(new BigDecimal(
						showInputDialog("Você pode solicitar um emprestimo!\nDigite seu numero para entrarmos em contato contigo: ")));
			}else {
				showMessageDialog(null, "Você não pode solicitar um emprestimo infelizmente\nPara poder, deve ter no minimo 10Hectares de terra e 360mil de renda no ano");
			}
		}
		
	}
	

	private int indexEmprestimoDisponivel() {
		int index = parseInt(showInputDialog("Escolha um agricultor para consultar\n" + listaAgricultor()));
		return index-1;
	}
	
	
	
	private void deletar() {
		if(agricultores.isEmpty()) {
			showMessageDialog(null, "Não temos agricultores cadastrados");
		}else {
			int index = parseInt(showInputDialog("Escolha um agricultor para Deletar\n" + listaAgricultor()));
			
			agricultores.remove(index-1);
		}
		
	}
	
	
	

	private String listaAgricultor() {
		String aux="";
		int index=0;
		for (Agricultor agricultor : agricultores) {
			index++;
			aux += index+ ". "+agricultor.toString() + "\n\n";
		}
		return aux;
	}
	


	private  String gerarMenu() {
		String aux = "Gerenciador de Emprestimos\n";
		aux += "1. Cadastrar Agricultor\n";
		aux += "2. Consultar Emprestimo\n";
		aux += "3. Lista Agricultores\n";
		aux += "4. Deletar Agricultor\n";
		aux += "5. Fechar programa\n";
		return aux;
	}
	
}
