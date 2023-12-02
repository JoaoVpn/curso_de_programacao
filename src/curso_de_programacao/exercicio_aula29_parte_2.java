package curso_de_programacao;

import java.util.Locale;
import java.util.Scanner;
// import Locale.setDefault();

public class exercicio_aula29_parte_2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da 
		 * área deste círculo com quatro casas decimais conforme exemplos. 
		 * 
		 * Fórmula da área: area = π . raio2 
		 * Considere o valor de π = 3.14159
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, pi, area, raio;
		
		x = sc.nextDouble();
		raio = Math.pow(x , 2.0);
		pi = 3.14159;
		area = pi * raio;
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}
