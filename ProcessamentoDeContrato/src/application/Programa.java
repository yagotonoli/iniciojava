package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import services.ContratoService;
import services.PaypalService;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com as informações do Contrato:");
		System.out.print("Número do contrato: ");
		long numero = sc.nextInt();
		System.out.print("Data do Contrato: ");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Valor do Contrato: ");
		double valorContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, dataContrato, valorContrato);
		
		System.out.print("Número de parcelas em que deseja dividir: ");
		int n = sc.nextInt();
		
		ContratoService cs = new ContratoService(new PaypalService());
		
		cs.processoContrato(contrato, n);
		
		System.out.println("Parcelas: ");
		for (Parcela p : contrato.getListaParcelas()) {
			System.out.println(p.toString());
		}
		
		sc.close();
	}

}
