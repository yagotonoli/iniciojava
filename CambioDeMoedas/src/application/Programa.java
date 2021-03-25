package application;

import java.util.Scanner;
import calculadora.Conversor;

public class Programa {

	//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
	//Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
	//sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o valor do dólar hoje: R$ ");
		double valorDolar = sc.nextDouble();
		System.out.print("\nValor em dólares que deseja comprar: U$ ");
		double qtdDolar = sc.nextDouble();
		pula();
		System.out.printf("Valor a ser pago em reais: R$ %.2f.", Conversor.valorFinal(valorDolar, qtdDolar));
		sc.close();
	}
	
	public static void pula() {
		System.out.println("\n");
	}

}
