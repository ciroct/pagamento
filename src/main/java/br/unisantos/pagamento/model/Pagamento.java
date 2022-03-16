package br.unisantos.pagamento.model;

import java.util.Date;

public class Pagamento {
	private Float valor;
	private String cartao;
	private Date validade;

	public Pagamento() {
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
}
