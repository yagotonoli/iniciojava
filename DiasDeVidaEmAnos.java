package portugol;

import java.util.Scanner;

public class DiasDeVidaEmAnos {
	
	public static void main (String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	int anos = 0, meses = 0, dias = 0;
	System.out.print("Digite quantos dias de idade você tem: ");
	dias = leia.nextInt();
	anos = (dias/365);
	meses = ((dias%365)/30);
	dias = ((dias%365)%30);
	
	System.out.println("Você tem "+anos+" anos, "+meses+" meses e "+dias+" dias.");

}
}