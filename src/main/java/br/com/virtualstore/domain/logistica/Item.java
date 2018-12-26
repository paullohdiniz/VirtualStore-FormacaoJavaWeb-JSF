/**
 * 
 */
package br.com.virtualstore.domain.logistica;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author MARCIO
 *	Representar os itens do carinho de compras vitual
 */
public class Item implements Serializable {

	/**
	 * Atributo da implementatação do Serializable. Boa pratica de programação
	 */
	private static final long serialVersionUID = -2791125505602883826L;
	
	private Long id; 
	
	private Integer quantidade;
	
	private BigDecimal subTotal;
	
	private Livro produto;
	
	private Pedido venda;

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", quantidade=" + quantidade + ", subTotal=" + subTotal + ", produto=" + produto
				+ ", venda=" + venda + "]";
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
		if (!(obj instanceof Item))
			return false;
		Item other = (Item) obj;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public Livro getProduto() {
		return produto;
	}

	public void setProduto(Livro produto) {
		this.produto = produto;
	}

	public Pedido getVenda() {
		return venda;
	}

	public void setVenda(Pedido venda) {
		this.venda = venda;
	}
}
