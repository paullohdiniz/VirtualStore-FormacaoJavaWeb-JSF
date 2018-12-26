/**
 * 
 */
package br.com.virtualstore.domain.logistica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import br.com.virtualstore.enumerations.logistica.ColecaoEnum;
import br.com.virtualstore.enumerations.logistica.FormatoEnum;
import br.com.virtualstore.enumerations.logistica.GeneroEnum;
import br.com.virtualstore.enumerations.logistica.NegociacaoEnum;
import br.com.virtualstore.enumerations.logistica.SituacaoEnum;
import br.com.virtualstore.enumerations.logistica.StatusEstoqueEnum;
import br.com.virtualstore.enumerations.logistica.StatusProdutoEnum;

/**
 * @author MARCIO
 *	Representar o livro que o usuario pode comprar ou alugar
 */
public class Livro implements Serializable {

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
	
	private String titulo;
	
	private String editora;
	
	private ColecaoEnum colecaoEnum;
	
	private FormatoEnum formatoEnum;
	
	private NegociacaoEnum negociacaoEnum;
	
	private StatusEstoqueEnum statusEstoqueEnum; 
	
	private SituacaoEnum situacaoEnum;
	
	private StatusProdutoEnum statusProdutoEnum;
	
	private GeneroEnum generoEnum;
	
	private BigDecimal precoComDesconto = null;
	
	private BigDecimal preco;
	
	private List<Autor> listaAutores;
	
	private List<Categoria> listaCategoria;

	public Livro() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livro [id=" + id + ", estoque=" + estoque + ", codigoDeBarras=" + codigoDeBarras + ", nome=" + nome
				+ ", descricao=" + descricao + ", fotoUrl=" + fotoUrl + ", titulo=" + titulo + ", editora=" + editora
				+ ", colecaoEnum=" + colecaoEnum + ", formatoEnum=" + formatoEnum + ", negociacaoEnum=" + negociacaoEnum
				+ ", statusEstoqueEnum=" + statusEstoqueEnum + ", situacaoEnum=" + situacaoEnum + ", statusProdutoEnum="
				+ statusProdutoEnum + ", generoEnum=" + generoEnum + ", precoComDesconto=" + precoComDesconto
				+ ", preco=" + preco + ", listaAutores=" + listaAutores + ", listaCategoria=" + listaCategoria + "]";
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
		if (!(obj instanceof Livro))
			return false;
		Livro other = (Livro) obj;
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
	 * @return the estoque
	 */
	public Long getEstoque() {
		return estoque;
	}

	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(Long estoque) {
		this.estoque = estoque;
	}

	/**
	 * @return the codigoDeBarras
	 */
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	/**
	 * @param codigoDeBarras the codigoDeBarras to set
	 */
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the fotoUrl
	 */
	public String getFotoUrl() {
		return fotoUrl;
	}

	/**
	 * @param fotoUrl the fotoUrl to set
	 */
	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the editora
	 */
	public String getEditora() {
		return editora;
	}

	/**
	 * @param editora the editora to set
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	/**
	 * @return the colecaoEnum
	 */
	public ColecaoEnum getColecaoEnum() {
		return colecaoEnum;
	}

	/**
	 * @param colecaoEnum the colecaoEnum to set
	 */
	public void setColecaoEnum(ColecaoEnum colecaoEnum) {
		this.colecaoEnum = colecaoEnum;
	}

	/**
	 * @return the formatoEnum
	 */
	public FormatoEnum getFormatoEnum() {
		return formatoEnum;
	}

	/**
	 * @param formatoEnum the formatoEnum to set
	 */
	public void setFormatoEnum(FormatoEnum formatoEnum) {
		this.formatoEnum = formatoEnum;
	}

	/**
	 * @return the negociacaoEnum
	 */
	public NegociacaoEnum getNegociacaoEnum() {
		return negociacaoEnum;
	}

	/**
	 * @param negociacaoEnum the negociacaoEnum to set
	 */
	public void setNegociacaoEnum(NegociacaoEnum negociacaoEnum) {
		this.negociacaoEnum = negociacaoEnum;
	}

	/**
	 * @return the statusEstoqueEnum
	 */
	public StatusEstoqueEnum getStatusEstoqueEnum() {
		return statusEstoqueEnum;
	}

	/**
	 * @param statusEstoqueEnum the statusEstoqueEnum to set
	 */
	public void setStatusEstoqueEnum(StatusEstoqueEnum statusEstoqueEnum) {
		this.statusEstoqueEnum = statusEstoqueEnum;
	}

	/**
	 * @return the situacaoEnum
	 */
	public SituacaoEnum getSituacaoEnum() {
		return situacaoEnum;
	}

	/**
	 * @param situacaoEnum the situacaoEnum to set
	 */
	public void setSituacaoEnum(SituacaoEnum situacaoEnum) {
		this.situacaoEnum = situacaoEnum;
	}

	/**
	 * @return the statusProdutoEnum
	 */
	public StatusProdutoEnum getStatusProdutoEnum() {
		return statusProdutoEnum;
	}

	/**
	 * @param statusProdutoEnum the statusProdutoEnum to set
	 */
	public void setStatusProdutoEnum(StatusProdutoEnum statusProdutoEnum) {
		this.statusProdutoEnum = statusProdutoEnum;
	}

	/**
	 * @return the generoEnum
	 */
	public GeneroEnum getGeneroEnum() {
		return generoEnum;
	}

	/**
	 * @param generoEnum the generoEnum to set
	 */
	public void setGeneroEnum(GeneroEnum generoEnum) {
		this.generoEnum = generoEnum;
	}

	/**
	 * @return the precoComDesconto
	 */
	public BigDecimal getPrecoComDesconto() {
		return precoComDesconto;
	}

	/**
	 * @param precoComDesconto the precoComDesconto to set
	 */
	public void setPrecoComDesconto(BigDecimal precoComDesconto) {
		this.precoComDesconto = precoComDesconto;
	}

	/**
	 * @return the preco
	 */
	public BigDecimal getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	/**
	 * @return the listaAutores
	 */
	public List<Autor> getListaAutores() {
		return listaAutores;
	}

	/**
	 * @param listaAutores the listaAutores to set
	 */
	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}

	/**
	 * @return the listaCategoria
	 */
	public List<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	/**
	 * @param listaCategoria the listaCategoria to set
	 */
	public void setListaCategoria(List<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}
}
