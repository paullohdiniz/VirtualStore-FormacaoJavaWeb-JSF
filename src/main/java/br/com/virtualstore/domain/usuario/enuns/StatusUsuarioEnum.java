/**
 * 
 */
package br.com.virtualstore.domain.usuario.enuns;

/**
 * @author MARCIO
 *
 */
public enum StatusUsuarioEnum {

	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	private String status;
	
	StatusUsuarioEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
