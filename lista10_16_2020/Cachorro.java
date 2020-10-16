package lista10_16_2020;

public class Cachorro extends Heranca_Animais {
	
	private String corre;
	
	public Cachorro() {
		super ();
	}

	public Cachorro(String nome, int idade, String som, String corre) {
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
		
		return "late";
	}
}
