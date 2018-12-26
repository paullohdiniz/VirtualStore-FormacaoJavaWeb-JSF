/**
 * 
 */
package br.com.virtualstore.enumerations.logistica;

/**
 * @author MARCIO
 *	Representar o status do livro. Se ativo esta a venda, se inativo o usuario só postou mas não desidiu se vai vender ainda
 */
public enum StatusProdutoEnum {

	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	private String status;

	private StatusProdutoEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
