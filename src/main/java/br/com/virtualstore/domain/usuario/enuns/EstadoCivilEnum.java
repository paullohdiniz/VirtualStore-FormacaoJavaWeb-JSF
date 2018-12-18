/**
 * 
 */
package br.com.virtualstore.domain.usuario.enuns;

/**
 * @author MARCIO
 *	Representar o estado civil do usuario
 */
public enum EstadoCivilEnum {

	CASADO_COMUNHAO_PARCIAL("Casado - Comunhão Parcial"),
	CASADO_COMUNHAO_UNIVERSAL("Casado - Comunhão Universal"),
	CASADO_REGIME_TOTAL("Casado - Regime Total"),
	CASADO_REGIME_MISTO_ESPECIAL("Casado - Regime Misto ou Especial"),
	CASADO_SEPARACAO_BENS("Casado - Separação de Bens"),
	DIVORCIADO("Divorciado"),
	SEPARADO("Separado Judicialmente"),
	SOLTEIRO("Solteiro"),
	UNIAO_ESTAVEL("União Estável"),
	VIUVO("Viúvo");
	
	private String estadoCivil;
	
	private EstadoCivilEnum(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}
}
