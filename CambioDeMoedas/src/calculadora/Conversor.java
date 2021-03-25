package calculadora;

public class Conversor {
	
	public static final double IOF = 6.0;
	
	public static double valorFinal (double valorDolar, double qntDolar) {
		return (valorDolar * qntDolar) + (valorDolar * qntDolar / 100 * IOF);
	}

}
