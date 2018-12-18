/**
 * 
 */
package br.com.virtualstore.domain.usuario.enuns;

/**
 * @author MARCIO
 *	Representar o status do usuario. Se ativo ele uso muito a plataforma, se inativo ele não usa mais ou faz tempo que usou
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
