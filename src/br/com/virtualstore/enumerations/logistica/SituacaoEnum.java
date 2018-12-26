/**
 * 
 */
package br.com.virtualstore.enumerations.logistica;

/**
 * @author MARCIO
 *	Representar as formas de estado do livro
 */
public enum SituacaoEnum {
	
	NOVO("Novo"),
	USADO("Usado");
	
	private String situcao;
	
	private SituacaoEnum(String situcao) {
		this.situcao = situcao;
	}

	public String getSitucao() {
		return situcao;
	}
}
