package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula36_parte_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente */
		int a, b;
		System.out.println("Qual é o valor de A? ");
		a = sc.nextInt();
		System.out.println("Qual é o valor de B?");
		b = sc.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.println("Os dois números são múltiplos!");
		}
		else {
			System.out.println("Os dois números não são múltiplos!");
		}
		sc.close();
		
		
	}

}
