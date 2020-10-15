package lista10_14_2020;

import java.util.Scanner;

import lista10_14_2020.Aluno;

public class ProjetoAlunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Aluno primeiro = new Aluno();
		
		int ano = 2020;
		
		System.out.print("Digite seu nome: ");
		primeiro.nomeAluno = leia.next();
		System.out.print("Digite como se identifica M/F: ");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Qual curso você frequenta: ");
		primeiro.curso = leia.next();
		System.out.print("Digite seu ano de nascimento: ");
		primeiro.anoNascimento = leia.nextInt();
		System.out.println("Digite sua nota: ");
		primeiro.nota = leia.nextDouble();
		System.out.println();
		
		
		System.out.println("Nome: " + primeiro.nomeAluno);
		System.out.println("Gênero: " + primeiro.sexo);
		System.out.println("Curso: " + primeiro.curso);
		System.out.println("Idade: " + (2020 - primeiro.anoNascimento));
		if (primeiro.nota < 5) {
			
			System.out.println("Situação: Reprovado");
		}
		
		else {
			
			System.out.println("Situação: Aprovado");
		}
		
	}

}
