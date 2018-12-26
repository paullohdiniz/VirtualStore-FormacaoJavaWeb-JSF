/**
 * 
 */
package br.com.virtualstore.domain.usuario;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import br.com.virtualstore.domain.logistica.Endereco;
import br.com.virtualstore.domain.logistica.Pedido;
import br.com.virtualstore.enumerations.usuario.EstadoCivilEnum;
import br.com.virtualstore.enumerations.usuario.PerfilEnun;
import br.com.virtualstore.enumerations.usuario.SexoEnum;
import br.com.virtualstore.enumerations.usuario.StatusUsuarioEnum;

/**
 * @author MARCIO 
 * Representar o usurio no sistema
 */
public class Usuario implements Serializable {

	/**
	 * Atributo da implementatação do Serializable. Boa pratica de programação
	 */
	private static final long serialVersionUID = -712494062048019067L;

	private Long id;

	private Date dataNascimento;

	private String nome;

	private String fotoUrl;

	private String naturalidade;

	private String email;

	private String cpf;

	private SexoEnum sexo;

	private EstadoCivilEnum estadoCivil;

	private PerfilEnun perfil;

	private StatusUsuarioEnum statusUsuario;

	private Login login;

	private Endereco endereco;

	private List<Pedido> listaVendasRelizadas;

	private List<Telefone> listaTelefones;

	public Usuario() {
		super();
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", dataNascimento=" + dataNascimento + ", nome=" + nome + ", fotoUrl=" + fotoUrl
				+ ", naturalidade=" + naturalidade + ", email=" + email + ", cpf=" + cpf + ", sexo=" + sexo
				+ ", estadoCivil=" + estadoCivil + ", perfil=" + perfil + ", statusUsuario=" + statusUsuario
				+ ", login=" + login + ", endereco=" + endereco + ", listaVendasRelizadas=" + listaVendasRelizadas
				+ ", listaTelefones=" + listaTelefones + "]";
	}

	/**
	 * Metodos hashCode e equals para o id. Boa pratica de programação
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Usuario))
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public EstadoCivilEnum getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public PerfilEnun getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEnun perfil) {
		this.perfil = perfil;
	}

	public StatusUsuarioEnum getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(StatusUsuarioEnum statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pedido> getListaVendasRelizadas() {
		return listaVendasRelizadas;
	}

	public void setListaVendasRelizadas(List<Pedido> listaVendasRelizadas) {
		this.listaVendasRelizadas = listaVendasRelizadas;
	}

	public List<Telefone> getListaTelefones() {
		return listaTelefones;
	}

	public void setListaTelefones(List<Telefone> listaTelefones) {
		this.listaTelefones = listaTelefones;
	}
}
