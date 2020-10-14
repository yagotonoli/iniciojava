package lista10_09_2020;

import java.util.Scanner;

public class MatrizesNumMaiores10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		String maior = "";
		int contagem = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.print("Escreva posição: linha [" + (linha + 1) + "], coluna [" + (coluna + 1) + "]: ");
				matriz[linha][coluna] = leia.nextInt();

			}
		}
		System.out.println();
		System.out.println("Matriz:");
		for (int linha = 0; linha < 3; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha][coluna] + "	");

			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (matriz[linha][coluna] > 10) {

					maior = (maior + " " + matriz[linha][coluna] + ",");
					contagem = contagem + 1;

				}
			}
		}
		System.out.println();
		System.out.println();
		maior = (maior + ".");
		System.out.println("Os números maiores que 10:" + maior + " Foram " + contagem + " números.");

		leia.close();
	}
}
