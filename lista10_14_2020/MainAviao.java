package lista10_14_2020;

import java.util.Scanner;

import poo_classes.Aviao;

public class MainAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Aviao aviao1 = new Aviao("");
		System.out.print("Digite o modelo do Avião: ");
		aviao1.modelo = leia.next();
		System.out.print("Digite a cor do "+ aviao1.modelo + ": ");
		aviao1.cor = leia.next();
		System.out.print("Digite a quantidade de rodas: ");
		aviao1.númeroDeRodas = leia.nextInt();
		System.out.print("Digite estado: ");
		aviao1.status = leia.next().toUpperCase().charAt(0);
		aviao1.estado();
		
		System.out.println(aviao1.modelo + " " + aviao1.cor + " de " + aviao1.númeroDeRodas + " rodas. " + aviao1.estado());
	}

}
/* CLASSE CRIADA SEPARADAMENTE:
package poo_classes;

public class Aviao {
	
	public String cor;
	public String modelo;
	public int númeroDeRodas;
	public char status;
	public String estado;
	
	public Aviao (String modelo) {
		
		this.modelo = modelo;
	
	}
	
	//Métodos
	
	public String estado () {
		
		if (this.status == 'V') {
		
			return "Voando"; 
		}
		
		if (this.status == 'P') {
			
			return "Pousando"; 
		}
		
		return estado;
	}
}
*/