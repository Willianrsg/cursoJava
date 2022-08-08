package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Digite o nome do Funcionario: ");
		func.nome = sc.next();
		
		System.out.println("Digite o Salario: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.println("Digite o valor das taxas: ");
		func.taxa = sc.nextDouble();
		
		System.out.print(func);
		
		System.out.println();
		
		System.out.println("Digite uma porcentagem para aumento: ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		System.out.println();
		
		System.out.print("Dados atualizados: " + func);
		sc.close();

	}

}
