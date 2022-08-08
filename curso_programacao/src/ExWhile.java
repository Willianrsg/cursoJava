import java.util.Scanner;

//EXERCICIO 01 WHILE

public class ExWhile {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002 ) {
			System.out.println("Senha Invalida!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		sc.close();
	}
}
