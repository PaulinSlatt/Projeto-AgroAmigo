package br.com.globalsolution.emprestimo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Emprestimo {

	private LocalDate dataSolicitacao;
	private LocalDate prazo;	
	private double taxaJuros;
	private BigDecimal valor;
	
	
	
	
	
	public Emprestimo(LocalDate prazo, double taxaJuros, BigDecimal valor) {
		this.dataSolicitacao = LocalDate.now();
		this.prazo = prazo;
		this.taxaJuros = taxaJuros;
		this.valor = valor;
	}
	public LocalDate getPrazo() {
		return prazo;
	}
	public void setPrazo(LocalDate prazo) {
		this.prazo = prazo;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
}
