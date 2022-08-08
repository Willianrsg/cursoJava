package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do produto");
		
		System.out.print("Nome: ");
		produto.nome = sc.next();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produto para ser adicionado ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizado: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produto para ser removido ao estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizado: " + produto);
		
		sc.close();
		
	}

}
