package br.com.globalsolution.propriedade;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Propriedade {

	private BigDecimal hectares;
	private LocalDate calendarioPlantio;
	
	public Propriedade(BigDecimal hectares) {
		this.hectares = hectares;
		this.calendarioPlantio = LocalDate.now();
	}

	
	public BigDecimal getHectares() {
		return hectares;
	}

	public void setHectares(BigDecimal hectares) {
		this.hectares = hectares;
	}

	public LocalDate getCalendarioPlantio() {
		return calendarioPlantio;
	}
	
	
}
