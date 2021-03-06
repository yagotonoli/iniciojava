package application;

import java.util.*;

import entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		List<Funcionarios> lista = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão adicionados: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Funcionário #" + (i+1));
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: R$ ");
			Double salario = sc.nextDouble();
			Funcionarios func = new Funcionarios(id, nome, salario);
			lista.add(i, func);
		}
		
		System.out.println("\nDigite o ID do funcionário que terá o salário aumentado: ");
		int idAumento = sc.nextInt();
		Integer pos = position(lista, idAumento);
		if (pos == null) {
			System.out.println("ID não encontrado.");
		}
		
		else {
			System.out.print("Em quanto deseja aumentar o salario: %");
			double porc = sc.nextDouble();
			lista.get(pos).aumento(porc);
		}
		
		for (Funcionarios x : lista) {
			System.out.println("");
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Funcionarios> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
