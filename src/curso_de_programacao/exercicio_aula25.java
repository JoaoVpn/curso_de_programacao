package curso_de_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_aula25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Transforma o Double com vírgula em ponto.
		Scanner sc = new Scanner(System.in);
		String x;
		int y; // Caso eu necessite digitar um valor inteiro, basta mudar para "int x;"
		double z;
		char s;

		x = sc.next();
		y = sc.nextInt(); // Caso seja necessário digitar um valor inteiro.
		z = sc.nextDouble(); // Caso necessite inserir dado de um número flutuante.
		s = sc.next().charAt(0);

		System.out.println("Você digitou em String: " + x);
		System.out.println("Você digitou em int: " + y);
		System.out.println("Você digitou em double: " + z);
		System.out.println("Você digitou em char: " + s);
		/*
		 * Importante: Para inserir o comando System.out.println(); Basta escrever
		 * "sysout" e clicar ctrl + Espaço.
		 */
		sc.close();
	}

}
