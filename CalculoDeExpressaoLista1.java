package portugol;

import java.util.Scanner;

public class CalculoDeExpressaoLista1 {

	public static void main(String[] args) {
		
		/*
		 * Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:
		 * D = (R + S) / 2 onde R = (A + B)� e S = (B + C)�
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int d = 0, r = 0, s = 0, a = 0, b = 0, c = 0;
		
		System.out.print("Digite A: ");
		a = leia.nextInt();
		System.out.print("Digite B: ");
		b = leia.nextInt();
		System.out.print("Digite C: ");
		c = leia.nextInt();
		System.out.println();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println("Nessa express�o, R � igual a "+ r +", S � igual a "+ s +", e ent�o D ser� "+ d +".");
		
		leia.close();
	}

}