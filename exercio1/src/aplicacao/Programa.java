package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura do retangulo");
		retangulo.altura = sc.nextDouble();
		System.out.println("Digite a largura do retangulo");
		retangulo.largura = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("A area o retangulo ?: " + retangulo.area());
		System.out.println("O perimetro do retangulo ?: " + retangulo.perimetro());
		System.out.println("A diagonal ?: " + retangulo.diagonal());
		
		
		sc.close();
	}

}
