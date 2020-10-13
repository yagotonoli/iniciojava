package lista10_09_2020;

import java.util.Scanner;

public class PontosPorRodada {

	public static void main(String[] args) {
		
		// Vetor com os 4 times de São Paulo, com Vitória - 3 pts; Empate - 1 pt; Derrota 0 pts. Três Rodadas.

		Scanner leia = new Scanner (System.in);
		
		String [] time = {"Corinthians", "Palmeiras", "Santos", "São Paulo"};
		
		int [] pontosTime = new int [4];
		char pontos;
		
		System.out.println("--CAMPEONATO PAULISTA--");
		
		for (int rodada = 1; rodada <= 3; rodada++) {
			
			System.out.println();
			System.out.println((rodada)+"a RODADA:");
			System.out.println();
			
			for (int x = 0; x < time.length; x++) {
				
				System.out.print("Qual foi o resultado do " + time[x] + "? Vitória (3 pts); Empate (1 pt.); Derrota (0 pts): ");
				pontos = leia.next().toUpperCase().charAt(0);
				System.out.print("");
								
				if (pontos == 'V') {
					pontosTime[x] = pontosTime[x] + 3;
				}
				else if (pontos == 'E'){
					pontosTime[x] = pontosTime[x] + 1;
				}
				else if (pontos == 'D') {
					pontosTime[x] = pontosTime[x] + 0;
				}
			}
			System.out.println();
			System.out.println(" ---------TABELA----------");
			System.out.println("|-----TIME-----|--PONTOS--|");
			System.out.println("|"+time[0]+"   | "+pontosTime[0]+" pontos.|");
			System.out.println("|"+time[1]+"     | "+pontosTime[1]+" pontos.|");
			System.out.println("|"+time[2]+"        | "+pontosTime[2]+" pontos.|");
			System.out.println("|"+time[3]+"     | "+pontosTime[3]+" pontos.|");
			System.out.println("|-------------------------|");
		}
	}

};
