package model.entidades;

import model.exceptions.Tratamento;

public class Conta {
	
	private Integer numero;
	private String cliente;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
	}

	public Conta(Integer numero, String cliente, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	//métodos
	
	@Override
	public String toString() {
		return "Conta: " + getNumero()
			+ "\nCliente: " + getCliente()
			+ "\nSaldo: R$ " + getSaldo()
			+ "\nLimite de Saque: R$ " + getLimiteSaque();
	}
	
	public void deposito(Double valor) {
		this.saldo =+ valor;
	}
	
	public void saque(Double valor) throws Tratamento {
		if (valor > saldo) {
			throw new Tratamento ("Saldo insuficiente em conta");
		}
		
		if(valor > limiteSaque) {
			throw new Tratamento ("O valor ultrapassa o limite de saque de sua conta");
		}
		
		this.saldo = getSaldo() - valor;
	}
	
}
