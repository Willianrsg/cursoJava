package program;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
			tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
			bem como os nomes dessas pessoas caso houver. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double somaAltura = 0.0;
		for(int i = 0; i<n; i++) {
			somaAltura += altura[i]; 
		}
		double alturaMedia = somaAltura / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		int cont =0;
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				cont = cont +1;
			}
		}
		double porc = cont * 100.0 /n;
		
		System.out.printf("Pessoas com menos de 16 anos %.1f%%%n", porc);
		
		for (int i= 0; i < n; i++) {
			if (idade[i]< 16) {
				System.out.println(nomes[i]);
			}
		}
		
		
		sc.close();
				

	}

}
