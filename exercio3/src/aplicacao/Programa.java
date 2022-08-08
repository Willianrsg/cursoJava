package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
				
		
		System.out.println("Nome: ");
		aluno.nome = sc.next();
		System.out.println("Nota primeiro trimestre: ");
		aluno.primeiro = sc.nextDouble();
		System.out.println("Nota segundo trimestre: ");
		aluno.segundo = sc.nextDouble();
		System.out.println("Nota terceiro trimestre: ");
		aluno.terceiro = sc.nextDouble();
		
		System.out.println(aluno.notaFinal());
		if (aluno.notaFinal() < 60.0) {
			System.out.println("Reprovado!");
			System.out.printf("Precisa %.2f Pontos%n", aluno.mediaPontos());
		}
		else {
			System.out.println("Aprovado!");
		}
		
		sc.close();
	}

}
