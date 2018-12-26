/**
 * 
 */
package br.com.virtualstore.domain.logistica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import br.com.virtualstore.domain.usuario.Usuario;
import br.com.virtualstore.enumerations.logistica.FormaPagamentoEnum;
import br.com.virtualstore.enumerations.logistica.StatusVendaEnum;

/**
 * @author MARCIO
 *	Representar o carinho de compras virtual do usuario
 */
public class Venda implements Serializable {

	/**
	 * Atributo da implementatação do Serializable. Boa pratica de programação
	 */
	private static final long serialVersionUID = 443960697543334949L;
	
	private Long id;
	
	private Integer volumesTotal;
	
	private BigDecimal frete;
	
	private BigDecimal total;
	
	private BigDecimal subTotal;
	
	private BigDecimal desconto;
	
	private Calendar dataCompra;
	
	private StatusVendaEnum statusVenda;
	
	private FormaPagamentoEnum formaPagamento;
	
	private Usuario vendedor;
	
	private Usuario comprador;
	
	private List<Item> itensVenda;

	public Venda() {
		super();
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", volumesTotal=" + volumesTotal + ", frete=" + frete + ", total=" + total
				+ ", subTotal=" + subTotal + ", desconto=" + desconto + ", dataCompra=" + dataCompra + ", statusVenda="
				+ statusVenda + ", formaPagamento=" + formaPagamento + ", vendedor=" + vendedor + ", comprador="
				+ comprador + ", itensVenda=" + itensVenda + "]";
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
		if (!(obj instanceof Venda))
			return false;
		Venda other = (Venda) obj;
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

	public Integer getVolumesTotal() {
		return volumesTotal;
	}

	public void setVolumesTotal(Integer volumesTotal) {
		this.volumesTotal = volumesTotal;
	}

	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public StatusVendaEnum getStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(StatusVendaEnum statusVenda) {
		this.statusVenda = statusVenda;
	}

	public FormaPagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public Usuario getComprador() {
		return comprador;
	}

	public void setComprador(Usuario comprador) {
		this.comprador = comprador;
	}

	public List<Item> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(List<Item> itensVenda) {
		this.itensVenda = itensVenda;
	}
}
