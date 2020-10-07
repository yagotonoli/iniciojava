package portugol;

import java.util.Scanner;

public class SistemaFabrica {

	public static void main(String[] args) {
		
		// Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		Scanner leia = new Scanner (System.in);
		int segTotal, seg, min, hr;
		System.out.println("Para saber quanto tempo em horas, minutos e segundos o evento durou, informe os segundos totais: ");
		segTotal = leia.nextInt();
		
		hr = (segTotal / 3600);
		min = (segTotal % 3600) / 60;
		seg = ((segTotal % 3600) % 60);
		
		System.out.println("O evento durou "+hr+"hora(s), "+min+" minuto(s) e "+seg+" segundo(s)");
		
		leia.close();
		
	}

}
