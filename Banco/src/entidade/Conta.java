package entidade;

public class Conta {
	
	private int nConta;
	private String nome;
	private double valorConta;
	
	//construtores
	
	public Conta() {	
	}
	
	public Conta(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
	}
	
	public Conta (int nConta, String nome, double valorConta) {
		this.nConta = nConta;
		this.nome = nome;
		this.valorConta = valorConta;
	}
	
	//getters e setters
	
	public int getNConta() {
		return nConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValorConta() {
		return valorConta;
	}
	
	//métodos
	
	public void definirNConta (int nConta) {
		this.nConta = nConta;
	}
	
	public void capitalInicial(double capitalInicial) {
		this.valorConta = capitalInicial;
	}
	
	public void deposito (double add) {
		this.valorConta += add;
	}
	
	public void saque (double sub) {
		this.valorConta -= sub + 5;
	}
	
	public String toString() {
		return "Dados da Conta:\n\nConta: " + getNConta() + "\nCliente: " + getNome() + "\nValor em conta: R$ " + String.format("%.2f", getValorConta());
	}
	
}
