package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Numero da conta: ");
		int number = sc.nextInt();
		
		System.out.print("Titular da conta: ");
		sc.nextLine();
		
		String titular = sc.nextLine();
		System.out.print("Tem deposito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if  (resposta == 'y') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(number, titular, depositoInicial);
		}
		else {
			conta = new Conta(number, titular);
		}
		
		System.out.println();
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para dep?sito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println(conta);
		
		
		sc.close();

	}

}







