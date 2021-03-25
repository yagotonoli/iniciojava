package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow, that is awesome!");
		Post p1 = new Post(sdf.parse("20/03/2021 14:30:05"), "Traveling to New Zealand", "I'm going to visit this amazing country!", 12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Good night");
		Comentario c4 = new Comentario("May the force be with you");
		Post p2 = new Post(sdf.parse("20/03/2021 23:03:05"), "Good Night Guys!", "See you tomorrow!", 5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		sc.close();
	}

}
