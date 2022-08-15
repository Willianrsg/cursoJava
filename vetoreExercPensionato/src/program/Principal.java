package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.println("Quantos quartos vão ser alugados? ");
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #"+ i +": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quartoNumero = sc.nextInt();
			
			
			
			vect[quartoNumero] = new Aluguel(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for(int i = 1; i < 10; i++) {
			if (vect [i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		
		
		sc.close();
	}

}
