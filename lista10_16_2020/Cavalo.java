package lista10_16_2020;

public class Cavalo extends Heranca_Animais {
	
	private String corre;
	
	public Cavalo() {
		super();
	}

	public Cavalo(String nome, int idade, String som, String corre) {
		super(nome, idade, som);
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public String som () {
		
		return "relincha";
	}
}
