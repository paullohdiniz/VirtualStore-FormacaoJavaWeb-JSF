/**
 * 
 */
package br.com.virtualstore.domain.logistica;

import java.io.Serializable;
import java.util.List;

/**
 * @author MARCIO
 *	Representar o autor do livro
 */
public class Autor implements Serializable {

	/**
	 * Atributo da implementatação do Serializable. Boa pratica de programação
	 */
	private static final long serialVersionUID = 2048760791178680125L;

	private Long id;
	
	private String nome;
	
	private List<Livro> listaLivros;

	public Autor() {
		super();
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nome=" + nome + ", listaLivros=" + listaLivros + "]";
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
		if (!(obj instanceof Autor))
			return false;
		Autor other = (Autor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the listaLivros
	 */
	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	/**
	 * @param listaLivros the listaLivros to set
	 */
	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
}
