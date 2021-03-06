package entities;

public class Terceiro extends Funcionario {
	
	private Double adicional;
	
	public Terceiro() {
	}

	public Terceiro(String nome, Integer horas, Double valorHora, Double adicional) {
		super(nome, horas, valorHora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public Double pagamento() {
		Double antesAdicional = getHoras() * getValorHora();
		Double totalTerceiro = antesAdicional + (adicional / 100 * 110);
		return totalTerceiro;
	}

}
