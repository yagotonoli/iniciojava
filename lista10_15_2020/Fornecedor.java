package lista10_15_2020;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDebito;
	
	public Fornecedor(String nome) {
		super(nome);
	}

	public Fornecedor(String nome, String endereço, double valorCredito) {
		super(nome, endereço);
		this.valorCredito = valorCredito;
	}
	
	public double obterSaldo () {
		
		return valorCredito - valorDebito;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDebito() {
		return valorDebito;
	}

	public void setValorDebito(double valorDebito) {
		this.valorDebito = valorDebito;
	}
	
	
}
