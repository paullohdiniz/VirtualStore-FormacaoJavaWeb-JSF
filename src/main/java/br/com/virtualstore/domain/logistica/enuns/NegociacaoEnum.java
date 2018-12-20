/**
 * 
 */
package br.com.virtualstore.domain.logistica.enuns;

/**
 * @author MARCIO
 *	Representar as formas de circulação do livro
 */
public enum NegociacaoEnum {
	
	ALUGUEL("Aluguel"),
	VENDA("Venda");
	
	private String negociacao;
	
	private NegociacaoEnum(String negociacao) {
		this.negociacao = negociacao;
	}

	public String getNegociacao() {
		return negociacao;
	}
}
