package lista10_07;

import java.util.Scanner;

public class TresInteiros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int x = 0,y = 0,z = 0, maior = 0;
		
		System.out.println("Vamos fazer um teste? Me informe 3 n�meros inteiros e eu mostrarei o maior :)");
		System.out.println();
		System.out.print("Digite um n�mero inteiro: ");
		x = leia.nextInt();
		System.out.print("Digite mais um n�mero inteiro: ");
		y = leia.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		z = leia.nextInt();
		System.out.println();
			
		Integer[] numeros = {x, y, z};
		if (maior <= x) {
				maior = x;}
		if (maior <= y) {
				maior = y;}
		if (maior <= z) {
				maior = z;}
		
		
		System.out.println("O maior n�mero inteiro dentre os informados � " + maior +".");
	}

}