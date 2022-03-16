package br.unisantos.pagamento.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.unisantos.pagamento.model.Pagamento;

@ManagedBean
@RequestScoped
public class PagamentoBean {
	private Pagamento pagamento = new Pagamento();

	public PagamentoBean() {
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
		
}
