package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Funcionário #" + i + ":\n");
			System.out.print("O funcionário é tercerizado s/n: ");
			char t = sc.next().charAt(0);
			System.out.print("Nome do funcionário: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Número de horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: R$ ");
			double valorHora = sc.nextDouble();

			if (t == 's') {
				System.out.print("Valor adicional: R$ ");
				double adicional = sc.nextDouble();
				Funcionario func = new Terceiro(nome, horas, valorHora, adicional);
				lista.add(func);
			}

			else if (t == 'n') {
				Funcionario func = new Funcionario(nome, horas, valorHora);
				lista.add(func);
			}
		}
		System.out.println();
		System.out.println("Lista de Salários do Mês:");
		for (Funcionario f : lista) {
			System.out.println(f.getNome() + " = R$ " + String.format("%.2f", f.pagamento()));
		}

		sc.close();
	}

}
