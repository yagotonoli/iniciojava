package lista10_07;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		System.out.println();
		
		if (idade >= 10 && idade <= 14) {
			System.out.print("Voc� est� na faixa et�ria infantil.");
		}
		if (idade >= 15 && idade <= 17) {
			System.out.print("Voc� est� na faixa et�ria juvenil.");
		}
		if (idade >= 18 && idade <= 25) {
			System.out.print("Voc� est� na faixa et�ria de adulto.");
		}
		else {System.out.print("Por favor, inicie novamente e digite um valor inteiro entre 10 e 25.");}
	}

}
