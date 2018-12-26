/**
 * 
 */
package br.com.virtualstore.enumerations.logistica;

/**
 * @author MARCIO
 *	Representar as formas de pagamento que o usuario pode escolher
 */
public enum FormaPagamentoEnum {

	BOLETO("Boleto"),
	CARTAO_DE_CREDITO("Cartão de credito"),
	CARTAO_DE_DEBITO("Cartão de debito");
	
	private String formaPagamento;
	
	FormaPagamentoEnum(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}
}
