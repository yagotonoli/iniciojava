package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidade.Aluno;

public class Programa {
	
	//Neste exercício, cada aluno possui um código único, representado por um número inteiro. 
	//O aluno pode se inscrever em mais de um curso, porém no final é preciso saber quantos alunos se inscreveram em pelo menos um curso na plataforma.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> lista = new HashSet<>();
		
		System.out.print("Quantos alunos no curso A: ");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.print("Matrícula do # " + i + ": ");
			int matricula = sc.nextInt();
			Aluno aluno = new Aluno(matricula);
			lista.add(aluno);
		}
		
		System.out.print("Quantos alunos no curso B: ");
		int y = sc.nextInt();
		for (int i = 1; i <= y; i++) {
			System.out.print("Matrícula do # " + i + ": ");
			int matricula = sc.nextInt();
			Aluno aluno = new Aluno(matricula);
			lista.add(aluno);
		}
		
		System.out.print("Quantos alunos no curso C: ");
		int z = sc.nextInt();
		for (int i = 1; i <= z; i++) {
			System.out.print("Matrícula do # " + i + ": ");
			int matricula = sc.nextInt();
			Aluno aluno = new Aluno(matricula);
			lista.add(aluno);
		}
		
		System.out.println();
		System.out.println("Total de Alunos: " + lista.size());
		
		sc.close();
	}

}
