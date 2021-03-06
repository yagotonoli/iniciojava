package entidades;

public class Funcionarios {
	
	Integer id;
	String nome;
	Double salario;
	
	public Funcionarios(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumento(Double porc) {
		this.salario = salario + (salario / 100 * porc);
	}
	
	public String toString () {
		return "ID: " + getId() + "\nNome: " + getNome() + "\nSalário: R$ " + String.format("%.2f", getSalario()) ;
	}

}
