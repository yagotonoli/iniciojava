package lista10_08_2020;

import java.util.Scanner;

public class QuantosSaoParOuImpar {

	public static void main(String[] args) {
		// Exercício: Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		String listaPares = "", listaImpares = "";
		
		for (int x = 1; x <= 10; x++) {
			
			System.out.print("Digite o "+(x)+"o número: ");
			n = leia.nextInt();
			
			if (n%2 == 0 && x < 10) {
				 
			listaPares = listaPares + n + ", ";
			
			}
			
			else if (n%2 == 1 && x < 10) {
			
				listaImpares = listaImpares + n + ", ";
			}
			
			if (n%2 == 0 && x == 10) {
				 
				listaPares = listaPares + n;
				
				}
				
			else if (n%2 == 1 && x == 10) {
				
					listaImpares = listaImpares + n;
				}
		
		}
		System.out.println();
		System.out.println("Lista Pares: " + listaPares + ".");
		System.out.println("Lista Ímpares: " + listaImpares + ".");
	}
}	