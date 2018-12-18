/**
 * 
 */
package br.com.virtualstore.domain.logistica.enuns;

/**
 * @author MARCIO
 *
 */
public enum StatusVendaEnum {

	INICIADA("Iniciada"),
	EM_ANDAMENTO("Em andamento"),
	CONCLUIDA("Concluída"),
	CONCLUIDA_ENTREGADA("Concluída e entregada");
	
	private String status;
	
	StatusVendaEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
