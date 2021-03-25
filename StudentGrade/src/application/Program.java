package application;

import java.util.Scanner;
import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		
		//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (o primeiro  vale 30 e os dois últimos 35).
		//Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está APROVADO ou REPROVADO e, em caso negativo, quantos pontos faltam
		//para o aluno obter o mímino para ser aprovado (que é 60% da nota). Você deve criar uma classe Estudante para resolver o problema.
		
		Scanner sc = new Scanner (System.in);
		Estudante aluno = new Estudante();
		
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = sc.next();
		System.out.print("Insira a N1: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("Insira a N2: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("Insira a N3: ");
		aluno.n3 = sc.nextDouble();
		System.out.print("\n" + aluno.toString());
		
		sc.close();

	}

}
