package entidades;

public class Produto {
	
	private String nome;
	private Double preço;
	
	Produto(){
	}

	public Produto(String nome, Double preço) {
		this.nome = nome;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	public String etiqueta() {
		return getNome() + " - R$ " + String.format("%.2f", getPreço());
	}
}
