package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula36_parte_5 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A
		 * seguir, calcule e mostre o valor da conta a pagar.
		 * CODIGO,ESPECIFICAÇÃO,PREÇO
		 * 1,Cachorro Quente,R$ 4.00
		 * 2,X-Salada,R$ 4.50
		 * 3,X-Bacon,R$ 5.00
		 * 4,Torrada simples,R$ 2.00
		 * 5,Refrigerante,R$ 1.50
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Código do produto: ");
		int codigo = sc.nextInt();
		System.out.println("Quantidade do produto: ");
		int quantidade = sc.nextInt();

		double total = 0.0;
		if (codigo == 1) {
				total = quantidade * 4.0;
		} 
		else if (codigo == 2) {
				total = quantidade * 4.5;
		} 
		else if (codigo == 3) {
				total = quantidade * 5.0;
		} 
		else if (codigo == 4) {
				total = quantidade * 2.0;
		} 
		else if (codigo == 5) {
				total = quantidade * 1.5;
		}
		else if (codigo != 1 || codigo != 2 || codigo != 3 || codigo != 4 || codigo != 5) {
			System.out.println("Erro: Código inválido.");
		}

		System.out.printf("O valor final é %.2f%n", total);
		sc.close();
	}

}