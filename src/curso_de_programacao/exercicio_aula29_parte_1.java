package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula29_parte_1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
		 * desses números com uma mensagem explicativa, conforme exemplos. 
		 */

		Scanner sc = new Scanner(System.in);
		
		int numero_1 = sc.nextInt();
		int numero_2 = sc.nextInt();
		int resultado = numero_1 + numero_2;
		System.out.println("Soma = " + resultado);
		
		sc.close();
	}

}
