/**
 * 
 */
package br.com.virtualstore.enumerations.usuario;

/**
 * @author MARCIO
 *	Representar o tipo de  telefone que o usuario pode ter
 */
public enum TipoTelefoneEnum {

	FAX("Fax"),
	CONTATO("Contato"),
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial"),
	CELULAR("Celular");
	
	private String tipoTelefone;

	private TipoTelefoneEnum(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}
}
