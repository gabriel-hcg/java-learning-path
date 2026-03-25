package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Artist;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the artist? ");
		String name = sc.nextLine();
		System.out.print("What is the year? ");
		int year = sc.nextInt();
		
		Artist artist = new Artist(name, year);
		
		System.out.println(artist);
		
		
		sc.close();

	}

}
