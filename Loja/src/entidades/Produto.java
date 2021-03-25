package entidades;

public class Produto {
	
	private String nome;
	private double preco;
	public double totalEstoque;
	private int qnt;
	
	//construtores
	
	public Produto () {
	}
	
	public Produto (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto (String nome, double preco, int qnt) {
		this.nome = nome;
		this.preco = preco;
		this.qnt = qnt;
	}
	
	//getters e setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPrec(double preco) {
		this.preco = preco;
	}
	
	public int getQnt() {
		return qnt;
	}
	
	//métodos
	
	public double totalEstoque() {
		return qnt * preco;
	}
	
	public void addQnt (int add) {
		this.qnt += add;
	}
	
	public void subQnt (int sub) {
		this.qnt -= sub;
	}
	
	public String toString () {
		return "Informações do Produto: " + nome + ", R$ " + String.format("%.2f", preco) + ", quantidade em estque: " + qnt + ". Valor total em estoque: R$ " + String.format("%.2f", totalEstoque()) + ".";
	}

}
