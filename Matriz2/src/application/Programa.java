package application;

import java.util.*;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas linhas terá a matriz: ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas terá a matriz: ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Insira o valor da posição linha [%d], coluna [%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

		System.out.println("\nNúmero que deseja analisar na matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (x == matriz[i][j]) {
					System.out.println("Número " + x + "na posição " + i + ", " + j + ":");
					if (i > 0) {
						System.out.println("Acima: " + matriz[i - 1][j]);
					}
					if (i < (m - 1)) {
						System.out.println("Abaixo: " + matriz[i + 1][j]);
					}
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (j < (n - 1)) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
				}
			}
		}
		
		sc.close();
	}

}
