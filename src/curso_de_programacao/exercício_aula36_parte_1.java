package curso_de_programacao;

import java.util.Scanner;

public class exercício_aula36_parte_1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.printf("O número %d é negativo.", numero);
		}
		else if (numero > 0) {
			System.out.printf("O número %d é positivo.", numero);
		}
		else {
			System.out.printf("O número %d não é nem positivo e nem negativo.", numero);
		}
		sc.close();
		
	}

}
