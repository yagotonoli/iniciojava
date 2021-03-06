package entidades;

public class ItemPedido {
	
	private Integer quantidade;
	private Double preço;
	
	private Produto produto;
	
	public ItemPedido() {
	}

	public ItemPedido(Integer quantidade, Double preço, Produto produto) {
		this.quantidade = quantidade;
		this.preço = preço;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return quantidade * preço;
	}
	
	public String toString() {
		return produto.getNome();
	}
}
