package lista10_16_2020;

public class Preguica extends Heranca_Animais {
	
	private String sobeEmArvore;
	
	public Preguica() {
		super();		
	}

	public Preguica(String nome, int idade, String som, String sobeEmArvore) {
		super(nome, idade, som);
		this.sobeEmArvore = sobeEmArvore;
	}

	public String getSobeEmArvore() {
		return sobeEmArvore;
	}

	public void setSobeEmArvore(String sobeEmArvore) {
		this.sobeEmArvore = sobeEmArvore;
	}
	
public String som () {
		
		return "(faz som de preguiça)";
	}

}
