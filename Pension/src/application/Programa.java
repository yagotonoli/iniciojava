package application;

import java.util.Locale;

import java.util.Scanner;

import entidades.Quarto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Número de quartos que serão alugados: ");
		int alugados = sc.nextInt();
		System.out.println("");
		Quarto[] room = new Quarto[10];

		for (int i = 1; i <= alugados; i++) {

			System.out.println("Aluguel #" + i);
			System.out.print("Nome: ");
			String nome = sc.next();
			sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			sc.nextLine();
			System.out.print("Quarto: ");
			int numQuarto = sc.nextInt() - 1;
			System.out.println("");
			room[numQuarto] = new Quarto(nome, email, numQuarto);
			System.out.println(numQuarto + "     " + room[numQuarto]);

		}

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (room[i] != null) {
				System.out.println(i + 1 + ": " + room[i]);
			}
		}
		sc.close();
	}
}
