package lista10_07;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a = 0, b = 0 , c = 0, pri = 0, seg = 0, ter = 0;
		
		System.out.println("Vou colocar os tr�s n�meros que me informar em ordem crescente. Vamos come�ar?");
		System.out.println();
		System.out.print("Digite um n�mero inteiro: ");
		a = leia.nextInt();
		System.out.print("Digite mais um n�mero inteiro: ");
		b = leia.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		c = leia.nextInt();
		System.out.println();
		
		if (a >= b && a >= c) {
			pri = a;
			if (b >= c) {
				seg = b;
				ter = c;
			}
			else {
				c = seg;
				b = ter;					
			}	
		System.out.println("A ordem dos n�meros ser� "+ ter +", "+ seg + ", " + pri + ".");
		
		}
		if (b >= a && b >= c) {
			pri = b;
			if (a >= c) {
				seg = a;
				ter = c;
			}
			else {
				seg = c;
				ter = a;					
			}
		System.out.println("A ordem dos n�meros ser� "+ ter +", "+ seg+ ", " + pri + ".");	
		}
		if (c >= b && c >= a) {
			pri = c;
			if (b >= a) {
				seg = b;
				ter = a;
			}
			else {
				seg = a;
				ter = b;					
			}
		System.out.println("A ordem dos n�meros ser� "+ ter +", "+ seg+ ", " + pri + ".");	
		}
		
	}
}