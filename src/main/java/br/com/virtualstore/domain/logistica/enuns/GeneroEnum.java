/**
 * 
 */
package br.com.virtualstore.domain.logistica.enuns;

/**
 * @author MARCIO
 *	Representar o genero do produto que esta a venda
 */
public enum GeneroEnum {

	FEMININO("Feminino"),
	MASCULINO("Masculino"),
	UNISSEX("unissex");
	
	private String genero;
	
	GeneroEnum(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}
}
