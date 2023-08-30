package br.com.globalsolution.mercadoria;

import java.util.LinkedList;
import java.util.List;

public class Mercadoria {

	private List<TipoMercadoria> tiposProdutos;

	
	
	
	public Mercadoria() {
		this.tiposProdutos = new LinkedList<>();
	}




	public List<TipoMercadoria> getTiposProdutos() {
		return tiposProdutos;
	}
	
	
	
	
}
