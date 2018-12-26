/**
 * 
 */
package br.com.virtualstore.enumerations.logistica;

/**
 * @author MARCIO
 *	Representar as formas de estoque que o livro pode ter
 */
public enum StatusEstoqueEnum {
	
	EM_ESTOQUE("Em estoque"),
	ESGOTADO("Esgotado"),
	EMPRESTADO("Emprestado");
	
	private String statusEstoque;
	
	private StatusEstoqueEnum(String statusEstoque) {
		this.statusEstoque = statusEstoque;
	}

	public String getStatusEstoque() {
		return statusEstoque;
	}
}
