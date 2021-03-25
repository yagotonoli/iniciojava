package application;

import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Produto prod = new Produto();
		System.out.println("Insira os dados do produto");
		pula();
		System.out.print("Insira o nome do produto: ");
		String nome = sc.next();
		prod.setNome(nome);
		System.out.print("Insira o valor: R$ ");
		double preco = sc.nextDouble();
		prod.setPrec(preco);
		pula();
		
		System.out.println(prod);
		pula();
		System.out.print("Quantas unidades deseja adicionar: ");
		int x = sc.nextInt();
		prod.addQnt(x);
		pula();
		System.out.println(prod);
		pula();
		System.out.print("Quantas unidades deseja descartar: ");
		int y = sc.nextInt();
		prod.subQnt(y);
		pula();
		System.out.println(prod);
		
		sc.close();
	}
	
	public static void pula() {
		System.out.print("\n");;
	}

}
