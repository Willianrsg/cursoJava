import java.util.Locale;
import java.util.Scanner;

public class Exercio5 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc  = new Scanner(System.in);
		
		int codigo1,codigo2, quantidade1, quantidade2;
		double valorUnitario1,valorUnitario2, valorFinal1,valorFinal2, total;
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorFinal1 = valorUnitario1 * quantidade1;
		valorFinal2 = valorUnitario2 * quantidade2;
		
		total = valorFinal1 + valorFinal2;
		
		System.out.printf("Valor a pagar é: %.2f%n", total);
		
		sc.close();
		
	}

}
