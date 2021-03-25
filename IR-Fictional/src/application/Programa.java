package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.*;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de pagadores: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Pessoa Física ou Jurídica [F/J]: ");
			char t = sc.next().toUpperCase().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: R$ ");
			Double renda = sc.nextDouble();
			if (t == 'F') {
				System.out.print("Gastos com Saúde: R$ ");
				double gastosSaude = sc.nextDouble();
				Pessoa p = new PessoaFisica(nome, renda, gastosSaude);
				lista.add(p);
			}
			else {
				System.out.print("Número de funcionários: ");
				int nFuncionarios = sc.nextInt();
				Pessoa p = new PessoaJuridica(nome, renda, nFuncionarios);
				lista.add(p);
			}
		}
		double impostoTotal = 0;
		System.out.println("Impostos Pagos:");
		for (Pessoa p : lista) {
			System.out.println(p.getNome() + " - (R$ " + p.getRenda() + ") - Imposto Total: R$ " + p.imposto());
			impostoTotal = impostoTotal + p.imposto();
		}
		System.out.println();
		System.out.println("\nImposto Total: " + impostoTotal);
		sc.close();
	}

}
