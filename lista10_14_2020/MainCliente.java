package lista10_14_2020;

import java.util.Scanner;

import poo_classes.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//Instanciamento
		
		Cliente cliente1 = new Cliente ("");
		Cliente cliente2 = new Cliente ("");

		System.out.print("Digite o nome do cliente: ");
		cliente1.nome = leia.next();
		System.out.print("Digite o ano de nascimento do cliente: ");
		cliente1.anoNascimento = leia.nextInt();
		cliente1.tipo();
		System.out.println();
		System.out.println(cliente1.nome + ", " + cliente1.idade() + ", nível " + cliente1.tipo);
		
		System.out.println();
		System.out.print("Digite o nome do cliente: ");
		cliente2.nome = leia.next();
		System.out.print("Digite o ano de nascimento do cliente: ");
		cliente2.anoNascimento = leia.nextInt();
		cliente2.tipo();
		System.out.println();
		System.out.println(cliente2.nome + ", " + cliente2.idade() + ", nível " + cliente2.tipo);

	}

}
// Abaixo a classe Cliente que foi criada. Tipo
/*package poo_classes;

public class Cliente {

	// Atributos
	public String nome;
	public int registro = 1;
	public int anoNascimento;
	public char tipo;

	// Construtores - aqui está o mínimo necessário a ser preenchido.

	public Cliente (String nome) {

		this.nome = nome;

	}

	// Sobrecarga

	public Cliente (String nome, int anoNascimento) {

		this.nome = nome;
		this.anoNascimento = anoNascimento;

	}
	
	//Método
	
	public int idade () {
		
		return 2020 - anoNascimento;
	}
	
	public char tipo () {
		
		if (this.idade() > 60) {
			
			return tipo = 'S';
		}
		
		else if (this.idade() < 18) {
			
			return tipo = 'J';
		}
		
		else {
			
			return tipo = 'R';
		}
		
	}
	
}*/
