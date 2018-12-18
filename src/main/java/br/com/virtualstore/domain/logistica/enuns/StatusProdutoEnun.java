/**
 * 
 */
package br.com.virtualstore.domain.logistica.enuns;

/**
 * @author MARCIO
 *	Representar o status do produto. Se ativo esta a venda, se inativo o usuario só postou mas não desidiu se vai vender ainda
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
