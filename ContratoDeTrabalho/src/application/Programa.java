package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ContratoPorHora;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.Nivel;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		//O programa consiste em ler os dados de determinado funcionário com N contratos. Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário neste mês.
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insira o departamento: ");
		String departamento = sc.nextLine();
		System.out.println("Insira os dados do funcionário:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível do cargo: ");
		String nivel = sc.next().toUpperCase();
		System.out.print("Salário: R$ ");
		double salario = sc.nextDouble();
		Funcionario func = new Funcionario(nome, Nivel.valueOf(nivel), salario, new Departamento(departamento));
		
		System.out.print("Quantidade de contratos do funcionário: ");
		int contratos = sc.nextInt();
		for (int i = 1; i <= contratos; i++) {
			System.out.println("Dados do contrato " + i + ":");
			System.out.print("Data  dd/MM/AAAA: ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor por hora: R$ ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Horas de contrato: ");
			int horasContrato = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(data, valorPorHora, horasContrato);
			func.addContrato(contrato);
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		System.out.print("Entre com o mês e o ano para calcular quanto o funcionário recebeu (MM/yyyy): ");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Nome: " + func.getNome());
		System.out.println("Departamento: " + func.getDepartamento().getDepartamento());
		System.out.printf("Salário em %s: R$ %.2f", mesEano, func.recebido(ano, mes));
		sc.close();
	}

}
