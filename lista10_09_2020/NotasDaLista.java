package lista10_09_2020;

import java.util.Scanner;

public class NotasDaLista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome[] = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington Pereira dos Santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int cod [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37};
		int notaFinal[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int nota, fator, x = 0;
		char opc = 'S';
		
		while (opc == 'S') {
			
			x = 0;
			while (x < 37){
				
				System.out.println(cod[x]+"- " + nome[x]+" - "+ notaFinal[x]+".");
				x = x +1;		
			}
			
			System.out.println();
			System.out.print("Escolha o código de um aluno para atribuir a nota: ");
			fator = leia.nextInt();
				
			if (fator  >=0 && fator <= 37) {
				System.out.print(cod[fator-1]+"- " + nome[fator-1]+" - "+ notaFinal[fator-1] + " - Adicione a nota: ");
				notaFinal[fator-1] = leia.nextInt();		
				}	
			System.out.println();
			System.out.print("Continuar? ");
			opc = leia.next().toUpperCase().charAt(0);
		}
	}

}
