package lista10_08_2020;

import java.util.Scanner;

public class PerfilPsicologico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 *era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		 *Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.
		 */
		
		int LIMITE = 3, idade, x = 1;
		char gen, perfil;
		int totalC = 0, totalFN = 0, totalMA = 0, totalOC = 0, totalNQ = 0, totalC18 = 0;
		
		System.out.println("Responda as perguntas a seguir utilizando 1, 2 ou 3: ");
		
		while (x <= 150) {
			
			System.out.print("Você se identifica com o gênero: [F]eminino; [M]asculino; [O]utro: ");
			gen = leia.next().toUpperCase().charAt(0);
			System.out.print("Você se considera uma pessoa: [C]alma; [N]ervosa; [A]gressiva: ");
			perfil = leia.next().toUpperCase().charAt(0);
			System.out.print("Informe sua idade: ");
			idade = leia.nextInt();
			
			if (perfil == 'C') {
				totalC = totalC + 1;
			}
			if (gen == 'F' && perfil == 'N') {
				totalFN = totalFN + 1;
			}
			if (gen == 'M' && perfil == 'A') {
				totalMA = totalMA + 1;
			}
			if (gen == 'O' && perfil == 'C') {
				totalOC = totalOC + 1;
			}
			if (idade > 40 && perfil == 'N') {
				totalNQ = totalNQ + 1;
			}
			if (idade < 18 && perfil == 'C') {
				totalC18 = totalC18 + 1;
			}
			x = x + 1;
		}
		
		System.out.println();
		System.out.println("Total de pessoas que se consideram calmas: "+totalC);
		System.out.println("Total de mulheres que se consideram nervosas: "+totalFN);
		System.out.println("Total de homens que se consideram agressivos: "+totalMA);
		System.out.println("Total de pessoas não identificadas com um gênero que sque se consideram calmas: "+totalOC);
		System.out.println("Total de pessoas com mais de 40 anos que se consideram nervosas: "+totalNQ);
		System.out.println("Total de pessoas com menos de 18 anos que se consideram calmas: "+totalC18);
	}

}
