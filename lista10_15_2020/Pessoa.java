package lista10_15_2020;

public class Pessoa {
	
	private String nome;
	private String enderešo;
	private String telefone;
	
	//CONSTRUTORES
	
	public Pessoa () {
		
	}
	
	public Pessoa (String nome) {
		
		this.nome = nome;
	}
	
	public Pessoa (String nome, String enderešo) {
			
			this.nome = nome;
			this.enderešo = enderešo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
