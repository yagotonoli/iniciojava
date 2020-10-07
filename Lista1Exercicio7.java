package portugol;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int a, b, c, d, e, f, g, h;
		double x=0, y=0;
		
		System.out.print("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de c: ");
		c = leia.nextInt();
		System.out.print("Digite o valor de d: ");
		d = leia.nextInt();
		System.out.print("Digite o valor de e: ");
		e = leia.nextInt();
		System.out.print("Digite o valor de f: ");
		f= leia.nextInt();
		System.out.print("Digite o valor de g: ");
		g = leia.nextInt();
		System.out.print("Digite o valor de h: ");
		h = leia.nextInt();
		
		x = ((c*e)-(b*f))/(((a*e)-(b*d)));
		f = ((a*f)-(c*d))/(((a*e)-(b*d)));
		
		System.out.printf("\nO valor de x é: %.2f\n", x, "\n");
		System.out.printf("\nO valor de y é: %.2f\n", y, "\n");
	}

}