package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quantas pessoas serão digitadas?" );
			int n = sc.nextInt();
			People[] vect = new People[n];
			
			
			for (int i=0; i<n; i++) {
				System.out.println("Dados da " + (i + 1) +"a pessoa:");
				sc.nextLine();
				System.out.println("Nome: ");
				String name = sc.nextLine();
				System.out.println("Idade: ");
				int age = sc.nextInt();
				System.out.println("Altura: ");
				double height = sc.nextDouble();
				vect[i] = new People(name, age, height);
				}
			
			int underSixteen = 0;
			
			for (int i=0; i<n; i++) {
			
			if (vect[i].getAge() < 16) {
				underSixteen++;
				}
			}
			
			double percentage = underSixteen * 100.0 / n;
			
			double sum = 0.0;
			for (int i=0; i<n; i++) {
				sum += vect[i].getHeight();
			}
			
			double avg = sum / n;
			
			System.out.printf("Altura média: %.2f\n", avg);
			System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentage);
			
			for (int i = 0; i < n; i++) {
			    if (vect[i].getAge() < 16) {
			        System.out.println(vect[i].getName());
			    }
			}
			
			sc.close();
			
	}
}

