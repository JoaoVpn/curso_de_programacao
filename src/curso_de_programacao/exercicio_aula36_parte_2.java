package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula36_parte_2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		int resultado = numero % 2;
		if (numero == 0) {
			System.out.println("Esse numero é nulo.");
		}
		else if (resultado == 0) {
			System.out.println("Esse número é par.");
		} 
		else if (resultado == 1 || resultado == -1){
			System.out.println("Esse número é impar.");
		}
		else {
			System.out.println("Erro. Favor inserir um número par ou impar e comunicar acerca do erro para o programador responsável pelo código.");
		}
		
		sc.close();

	}

}
