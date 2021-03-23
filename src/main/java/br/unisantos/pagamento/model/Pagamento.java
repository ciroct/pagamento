package br.unisantos.pagamento.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pagamento {
    private BigDecimal valor;
    private Cartao cartao;
    private Date validade;

    public Pagamento() {  }

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

}
