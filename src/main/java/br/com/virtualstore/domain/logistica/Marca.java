/**
 * 
 */
package br.com.virtualstore.domain.logistica;

import java.io.Serializable;
import java.util.List;

/**
 * @author MARCIO
 *	Representar as marcas que um produto poder ter
 */
public class Marca implements Serializable {

	/**
	 * Atributo da implementatação do Serializable. Boa pratica de programação
	 */
	private static final long serialVersionUID = -5154420324048596821L;
	
	private Long id;
	
	private String nome;
	
	private List<Produto> listaProdutos;

	public Marca() {
		super();
	}

	@Override
	public String toString() {
		return "Marca [id=" + id + ", nome=" + nome + ", listaProdutos=" + listaProdutos + "]";
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
		if (!(obj instanceof Marca))
			return false;
		Marca other = (Marca) obj;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
