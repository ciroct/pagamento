package br.unisantos.pagamento.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pagamento {
    private BigDecimal valor;
    private String cartao;
    private Date validade;

    public Pagamento() {  }

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
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
