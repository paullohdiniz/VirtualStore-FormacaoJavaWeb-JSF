/**
 * 
 */
package br.com.virtualstore.enumerations.logistica;

/**
 * @author MARCIO
 *	Representar o genero que o livro que esta a venda
 */
public enum GeneroEnum {

	INFANTIL("Infantil"),
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
