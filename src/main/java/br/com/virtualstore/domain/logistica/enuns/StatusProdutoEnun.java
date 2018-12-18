/**
 * 
 */
package br.com.virtualstore.domain.logistica.enuns;

/**
 * @author MARCIO
 *
 */
public enum StatusProdutoEnun {

	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	private String status;

	private StatusProdutoEnun(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
