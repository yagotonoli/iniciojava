package lista10_08_2020;

public class NumerosModulo5 {

	public static void main(String[] args) {
		
		//Exercício: Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		
		int num1 = 1;
		
		System.out.println("Números de 1.000 à 1.999 que, quando divididos por 11, obtemos resto '5': ");
		System.out.println();
		
		for (num1 = 1000; num1 <= 1999; num1++) {
			
			if ((num1 % 11) == 5) {
			
				System.out.println(num1);
			}
		}
	}
}
