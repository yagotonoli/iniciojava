package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Nivel;

public class Funcionario {
	
	private String nome;
	private Nivel nivel;
	private Double salario;
	
	private Departamento departamento;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Nivel nivel, Double salario, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public List<ContratoPorHora> getContrato() {
		return contratos;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public void addContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void remContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double recebido(int ano, int mes) {
		double soma = salario;
		Calendar cal = Calendar.getInstance();
		for (ContratoPorHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma+= c.valorTotal();
			}
		}
		
		return soma;
	}
	
}
