package br.unisantos.pagamento.model;

import java.io.Serializable;

public class Cartao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String numero;

	public Cartao(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return numero;
	}		

}
