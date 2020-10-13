package lista10_09_2020;

import java.util.Scanner;

public class ArrayVetorA {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int A[] = { 1, 0, 5, -2, -5, 7 };

		int B = A[0] + A[1] + A[5];

		System.out.println("Soma entre os valores das posições A[0], A[1] e A[5]: " + B);
		System.out.println();

		if (A[4] == A[4]) {
			A[4] = 100;
		}

		for (int i = 0; i < A.length; i++) {

			System.out.println("Valor do Vertor A[" + i + "]: " + A[i]);

		}

	}

}
