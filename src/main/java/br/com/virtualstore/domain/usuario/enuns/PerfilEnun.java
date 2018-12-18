/**
 * 
 */
package br.com.virtualstore.domain.usuario.enuns;

/**
 * @author MARCIO
 *	Representar as permisões do usuario
 */
public enum PerfilEnun {

	ROLE_ADMIN("Administrador"),
	ROLE_USER("Usuario");
	
	private String perfil;

	private PerfilEnun(String perfil) {
		this.perfil = perfil;
	}

	public String getPerfil() {
		return perfil;
	}
}
