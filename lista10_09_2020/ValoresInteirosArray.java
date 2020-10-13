package lista10_09_2020;

import java.util.Scanner;

public class ValoresInteirosArray {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int valor[] = { 0, 0, 0, 0, 0, 0 };
		int pares[] = { 0, 0, 0, 0, 0, 0 };
		int impares[] = { 0, 0, 0, 0, 0, 0 };
		String nimpares = "";
		String npares = "";
		int simpares = 0;
		int spares = 0;

		for (int i = 0; i < 6; i++) {

			System.out.print("Digite o " + (i + 1) + "o valor para ser armazenado: ");
			valor[i] = leia.nextInt();

			if ((valor[i] % 2) == 0 && valor[i] >= 0) {

				pares[i] = valor[i];
			} else if ((valor[i] % 2) == 1 && valor[i] >= 0) {

				impares[i] = valor[i];
			}

		}

		for (int x = 0; x < 6; x++) {

			if (impares[x] != 0) {

				nimpares = nimpares + " " + impares[x];
				simpares = (simpares + impares[x]);

			}

			else if (pares[x] != 0) {

				npares = npares + " " + pares[x];
				spares = (spares + pares[x]);
			}

		}

		System.out.println();
		System.out.println("Números pares: " + npares + ".");
		System.out.println("Soma dos números impares: " + spares + ".");
		System.out.println("Números impares: " + nimpares + ".");
		System.out.println("Soma dos números impares: " + simpares + ".");

		leia.close();

	}

}
