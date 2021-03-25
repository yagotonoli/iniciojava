package entidades;

public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		if (getRenda() < 20000) {
			return (getRenda() / 100 * 15) - (gastosSaude / 2);
		}
		else {
			return (getRenda() / 100 * 25) - (gastosSaude / 2);
		}
	}
	
	

}
