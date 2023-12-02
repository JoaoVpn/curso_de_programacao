package curso_de_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_aula29_parte_5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
		 * o valor unitário de cada peça 1, o código de uma peça 2,
		 * o número de peças 2 e o valor unitário de cada peça 2. 
		 * Calcule e mostre o valor a ser pago. 
		 */
		int cod_peca_1, cod_peca_2, quantidade_de_pecas_1, quantidade_de_pecas_2;
		double valor_peca_1, valor_peca_2, valor_final;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		cod_peca_1 = sc.nextInt();
		quantidade_de_pecas_1 = sc.nextInt();
		valor_peca_1 = sc.nextDouble();
		
		cod_peca_2 = sc.nextInt();
		quantidade_de_pecas_2 = sc.nextInt();
		valor_peca_2 = sc.nextDouble();
		
		valor_final = valor_peca_1 * quantidade_de_pecas_1 + valor_peca_2 * quantidade_de_pecas_2;
		
		System.out.println("Codigo da primeira peça: " + cod_peca_1);
		System.out.println("Codigo da primeira peça: " + cod_peca_2);
		System.out.printf("Valor a pagar: %.2f%n", valor_final);
		
		sc.close();
	}

}
