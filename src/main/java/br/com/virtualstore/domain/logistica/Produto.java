/**
 * 
 */
package br.com.virtualstore.domain.logistica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import br.com.virtualstore.domain.logistica.enuns.GeneroEnum;
import br.com.virtualstore.domain.logistica.enuns.StatusProdutoEnun;

/**
 * @author MARCIO
 *	Representar o produto que o usuario pode comprar
 */
public class Produto implements Serializable {

	/**
	 * Atributo da implementatação do Serializable. Boa pratica de programação
	 */
	private static final long serialVersionUID = 5533075836829063036L;
	
	private Long id;
	
	private Long estoque;
	
	private String codigoDeBarras;
	
	private String nome;
	
	private String descricao;
	
	private String fotoUrl;
	
	private StatusProdutoEnun statusProduto;
	
	private GeneroEnum genero;
	
	private BigDecimal precoComDesconto = null;
	
	private BigDecimal preco;
	
	private Marca marca;
	
	private List<Categoria> listaCategoria;

	public Produto() {
		super();
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", estoque=" + estoque + ", codigoDeBarras=" + codigoDeBarras + ", nome=" + nome
				+ ", descricao=" + descricao + ", fotoUrl=" + fotoUrl + ", statusProduto=" + statusProduto + ", genero="
				+ genero + ", precoComDesconto=" + precoComDesconto + ", preco=" + preco + ", marca=" + marca
				+ ", listaCategoria=" + listaCategoria + "]";
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
		if (!(obj instanceof Produto))
			return false;
		Produto other = (Produto) obj;
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

	public Long getEstoque() {
		return estoque;
	}

	public void setEstoque(Long estoque) {
		this.estoque = estoque;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public StatusProdutoEnun getStatusProduto() {
		return statusProduto;
	}

	public void setStatusProduto(StatusProdutoEnun statusProduto) {
		this.statusProduto = statusProduto;
	}

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

	public BigDecimal getPrecoComDesconto() {
		return precoComDesconto;
	}

	public void setPrecoComDesconto(BigDecimal precoComDesconto) {
		this.precoComDesconto = precoComDesconto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(List<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}
}
