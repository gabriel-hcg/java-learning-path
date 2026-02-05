package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MainExercise2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, qtdPecas1, peca2, qtdPecas2;
		double valorPeca1, valor1, valorPeca2, valor2, total;
		
		peca1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		peca2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		
		valorPeca1 = sc.nextDouble();
		valor1 = valorPeca1 * qtdPecas1;
		valorPeca2 = sc.nextDouble();
		valor2 = valorPeca2 * qtdPecas2;
		total = valor1 + valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}


/*
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

int cod1, cod2, qte1, qte2;
double preco1, preco2, total;

cod1 = sc.nextInt();
qte1 = sc.nextInt();
preco1 = sc.nextDouble();

cod2 = sc.nextInt();
qte2 = sc.nextInt();
preco2 = sc.nextDouble();

total = preco1 * qte1 + preco2 * qte2;

System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

sc.close();
}
}

*/

