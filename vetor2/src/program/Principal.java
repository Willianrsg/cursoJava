package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPreco();
		}
		double avg = sum / vect.length;
		System.out.printf("A média de preço = %.2f%n", avg);
		
		sc.close();

	}

}
