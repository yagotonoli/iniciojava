package lista10_16_2020;

import java.util.Scanner;

public class MainHeranca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Cachorro cachorro1 = new Cachorro("Dogo", 10, "E", "corre");
		Cavalo cavalo1 = new Cavalo("Pégasus", 15, "E", "corre");
		Preguica preguica1 = new Preguica("Ligeirinha", 7, "E", "sobe em árvores");
		
		System.out.println(cachorro1.getNome() + " tem " + cachorro1.getIdade() + " anos, " + cachorro1.som() + " e como característica " + cachorro1.getCorre() + ".");
		System.out.println(cavalo1.getNome() + " tem " + cavalo1.getIdade() + " anos, " + cavalo1.som() + " e como característica " + cavalo1.getCorre() + ".");
		System.out.println(preguica1.getNome() + " tem " + preguica1.getIdade() + " anos, " + preguica1.som() + " e como característica " + preguica1.getSobeEmArvore() + ".");
	
		leia.close();
	}

}
