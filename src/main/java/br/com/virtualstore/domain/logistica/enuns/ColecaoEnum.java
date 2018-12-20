/**
 * 
 */
package br.com.virtualstore.domain.logistica.enuns;

/**
 * @author MARCIO
 *	Representar se o livro faz parte de uma coleção ou uma triologia
 */
public enum ColecaoEnum {
	
	COLECAO("Coleção"),
	TRILOGIA("Trilogia");
	
	private String colecao;
	
	private ColecaoEnum(String colecao) {
		this.colecao = colecao;
	}

	public String getColecao() {
		return colecao;
	}
}
