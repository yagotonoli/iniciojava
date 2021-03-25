package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import entidades.*;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Olá! Seja bem-vindo!\n");
		System.out.print("Quantos produtos serão comprados: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Informações do Produto #" + i);
			System.out.print("[C]omum, [U]sado ou [I]mportado: ");
			char t = sc.next().toLowerCase().charAt(0);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: R$ ");
			double preço = sc.nextDouble();
			if (t == 'u') {
				System.out.print("Data de Fabricação: ");
				Date dataFabri = sdf.parse(sc.next());
				Produto prod = new ProdutoUsado(nome, preço, dataFabri);
				lista.add(prod);
			}
			else if (t == 'i') {
				System.out.print("Taxa de Importação: R$ ");
				double taxaImportação = sc.nextDouble();
				Produto prod = new ProdutoImportado(nome, preço, taxaImportação);
				lista.add(prod);
			}
			else {
				Produto prod = new Produto(nome, preço);
				lista.add(prod);
			}
		}
		
		System.out.println();
		for (Produto p : lista) {
			System.out.println(p.etiqueta());
		}

		sc.close();
	}

}
