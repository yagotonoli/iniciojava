package entidades;

public class PessoaJuridica extends Pessoa {
	
	private int nFuncionarios;
	
	public PessoaJuridica() {		
	}

	public PessoaJuridica(String nome, Double renda, int nFuncionarios) {
		super(nome, renda);
		this.nFuncionarios = nFuncionarios;
	}

	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public Double imposto() {
		
		if (nFuncionarios > 10) {
			return (getRenda() / 100 * 14);
		}
		
		else {
			return getRenda() / 100 * 16;
		}
	}

}
