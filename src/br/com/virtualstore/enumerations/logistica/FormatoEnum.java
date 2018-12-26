/**
 * 
 */
package br.com.virtualstore.enumerations.logistica;

/**
 * @author MARCIO
 *	Representar as formas que o livro pode ter
 */
public enum FormatoEnum {
	
	E_BOOK("E-book"),
	FISICO("Fisico");
	
	private String formato;
	
	private FormatoEnum(String formato) {
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}
}
