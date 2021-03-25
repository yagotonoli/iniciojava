package entities;

public class Estudante {
	
	public String nome;
	public double n1, n2, n3;
	
	public double notaFinal () {
		return n1 + n2 + n3;
	}
	
	
	public String toString () {
		if (notaFinal() >= 60) {
			return nome + ", " + notaFinal() + " -  APROVADO";
		}
		else {
			return nome + ", " + notaFinal() + " -  REPROVADO POR " + (60 - notaFinal()) + " PONTOS";
		}
		
	}

}
