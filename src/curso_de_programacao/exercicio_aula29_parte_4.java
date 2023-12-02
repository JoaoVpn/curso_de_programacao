package curso_de_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_aula29_parte_4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas 
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
		 *  A seguir, mostre o número e o salário do funcionário, com duas casas decimais. 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_do_funcionario;
		double valor_da_hora, resultado_hora_trabalhada, horas_trabalhadas;
		
		numero_do_funcionario = sc.nextInt();
		horas_trabalhadas = sc.nextInt();
		valor_da_hora = sc.nextDouble();
		
		resultado_hora_trabalhada = horas_trabalhadas * valor_da_hora;
		
		System.out.println("Numero do funcionário: " + numero_do_funcionario);
		System.out.printf("Salário do funcionário: R$ %.2f%n", resultado_hora_trabalhada);
		
		sc.close();
	}

}
