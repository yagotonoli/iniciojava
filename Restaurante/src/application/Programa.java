package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.*;
import entidades.enums.*;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento (dd/mm/aaaa): ");
		Date dataNascimento = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		System.out.println();
		
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens deseja adicionar ao pedido: ");
		int quantidadeItens = sc.nextInt();
		
		for (int i = 1; i<= quantidadeItens; i++) {
			System.out.println("Pedido #" + i + ":");
			System.out.print("Nome do item: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Valor do item: R$ ");
			double valorProduto = sc.nextDouble();
			System.out.print("Quantidade desejada: ");
			int quantidadeDoItem = sc.nextInt();
			Produto prod = new Produto(nomeProduto, valorProduto);
			ItemPedido item = new ItemPedido(quantidadeDoItem, valorProduto, prod);
			pedido.addItem(item);
			}
		System.out.println();
		System.out.println("Detalhes do Pedido:");
		System.out.println(pedido);
		
		
		sc.close();
	}

}
