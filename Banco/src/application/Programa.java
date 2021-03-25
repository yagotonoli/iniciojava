package application;

import java.util.Scanner;
import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Conta conta = new Conta();
		
		System.out.print("Olá! Deseja abrir uma nova conta? [s/n] ");
		char inicio = sc.next().toLowerCase().charAt(0);
		limpa();
		if (inicio == 's') {
			System.out.print("Por favor, informe seu primeiro nome para começarmos: ");
			sc.nextLine();
			String nome = sc.nextLine();
			//System.out.print("Por favor, informe seu sobrenome para começarmos: ");
			//String sobrenome = sc.next();
			conta.setNome(nome);
			limpa();
			System.out.print("Olá, " + conta.getNome() + "! Essa é a primeira conta de nosso banco! Por favor, escolha quatro dígitos para definir o número de sua conta: ");
			int nConta = sc.nextInt();
			conta.definirNConta(nConta);
			pula();
			System.out.print("Gostaria de fazer o primeiro depósito já na abertura da conta? [s/n]");
			char primeiroDeposito = sc.next().toLowerCase().charAt(0);
			if (primeiroDeposito == 's') {
				pula();
				System.out.print("Informe o valor a ser depositado: R$ ");
				double capitalInicial = sc.nextDouble();
				conta.capitalInicial(capitalInicial);
				limpa();
			}
			else {
				limpa();
			}
			
			
			boolean verSaldo = true;
			
			while (verSaldo == true) {
				limpa();
				System.out.println(conta);
				pula();
				System.out.print("Deseja depositar [d], sacar [s] ou encerrar a sessão [e]? ");
				char acao = sc.next().charAt(0);
				if (acao == 'd') {
					limpa();
					System.out.print("Digite o valor a ser depositado: R$ ");
					double add = sc.nextDouble();
					conta.deposito(add);
					pula();
					pula();
					System.out.println("Depósito efetuado com sucesso!");
				}
				else if (acao == 's') {
					limpa();
					System.out.print("*É cobrada uma taxa de R$ 5,00 por saque\n\n\n\nDigite o valor que deseja sacar: R$ ");
					double sub = sc.nextDouble();
					conta.saque(sub);
					pula();
					pula();
					System.out.println("Saque efetuado com sucesso!");
				}
				else {
					verSaldo = false;
				}
			}
			
			limpa();
			System.out.println("Aguardaremos seu retorno!");
			
		}
		
		else {
			limpa();
			System.out.println("Estaremos aguardando seu retorno!");
		}
		sc.close();
	}

	public static void pula() {
		System.out.println("\n");
	}
	
	public static void limpa() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
}
