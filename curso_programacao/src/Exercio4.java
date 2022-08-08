import java.util.Locale;
import java.util.Scanner;

public class Exercio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int  numero, hora;
		double  valorHora, salario;
		
		numero = sc.nextInt();
		hora = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario =  valorHora * hora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		
		sc.close();
		
	}

}
