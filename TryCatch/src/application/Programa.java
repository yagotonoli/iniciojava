package application;

import java.util.Scanner;
import model.entidades.Conta;
import model.exceptions.Tratamento;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		try {
		System.out.println("Entre com os dados da conta:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo inicial: R$ ");
		double saldoInicial = sc.nextDouble();
		System.out.print("Limite de Saque: R$ ");
		double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero, nome, null, limiteSaque);
		conta.deposito(saldoInicial);
		System.out.println();
		System.out.println(conta);
		
		System.out.print("\nQuanto deseja sacar: R$ ");
		double valor = sc.nextDouble();
		conta.saque(valor);
		System.out.println("\n");
		System.out.println(conta);
		}
		
		catch (Tratamento t) {
			System.out.println("\nErro! " + t.getMessage());
		}

		catch (RuntimeException t) {
			System.out.println("\nErro inesperado!");
		}
		
		sc.close();
	}

}