/**
 * 
 */
package br.com.virtualstore.domain.usuario.enuns;

/**
 * @author MARCIO
 *	Representar o sexo do usuario
 */
public enum SexoEnum {

	NAO_QUERO_INFORMAR("Não quero informar"),
	FEMININO("Feminino"),
	MASCULINO("Masculino");
	
	private String sexo;
	
	private SexoEnum(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}
}
