/**
 * 
 */
package br.com.virtualstore.enumerations.logistica;

/**
 * @author MARCIO
 *	Representar o estado onde o usuario mora
 */
public enum EstadoEnum {

	AC("Acre - AC"),
	AL("Alagoas - AL"),
	AP("Amapá - AP"),
	AM("Amazonas - AM"),
	BA("Bahia - BA"),
	CE("ceará - CE"),
	DF("Distrito Federal - DF"),
	ES("Espírito Santo - ES"),
	GO("Goias - GO"),
	MA("Maranhão - MA"),
	MT("Mato Grosso - MT"),
	MS("Mato Grosso do Sul - MS"),
	MG("Minas Gerais - MG"),
	PA("Pará - PA"),
	PB("Paraíba - PB"),
	PR("Paraná - PR"),
	PE("Pernambuco - PE"),
	PI("Piauí - PI"),
	RJ("Rio de Janeiro - RJ"),
	RN("Rio Grande do Norte - RN"),
	RS("Rio Grande do Sul - RS"),
	RO("Rondônia - RO"),
	RR("Roraima - RR"),
	SC("Santa Catarina - SC"),
	SP("São Paulo - SP"),
	SE("Sergipe - SE"),
	TO("Tocantins - TO");
	
	private String estado;

	private EstadoEnum(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
}
