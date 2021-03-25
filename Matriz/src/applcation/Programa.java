package applcation;

import java.util.*;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas linhas e colunas terão a matriz: ");
		int n = sc.nextInt();
		System.out.println();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print("Número a ser adicionado na linha (" + (i + 1) + "), coluna (" + (j + 1) + "): ");
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {

			System.out.println();

			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		System.out.print("\n\nNúmeros da diagonal principal: ");
		for (int k = 0; k < n; k++)
			System.out.print(matriz[k][k] + " ");

		int negativos = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					negativos += 1;
				}
			}
		}
		
		System.out.println("\nNúmero de negativos: " + negativos);

		sc.close();
	}

}
