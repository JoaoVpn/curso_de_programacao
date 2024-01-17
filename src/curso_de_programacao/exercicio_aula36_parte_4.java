package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula36_parte_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		int hora_de_jogo, inicio, fim;
		
		System.out.println("Que horas o jogo começou? ");
		inicio = sc.nextInt();
		System.out.println("Que horas o jogo finalizou? ");
		fim = sc.nextInt();
		if (inicio < fim) {
			hora_de_jogo = fim - inicio;
			System.out.println("Horas jogadas: " + hora_de_jogo + " Hora(s).");
		}
		else {
			hora_de_jogo = 24 - inicio + fim; // O cálculo hora_de_jogo = 24 - inicio + fim é usado para determinar a duração de um jogo que começa em um dia e termina no dia seguinte, levando em conta a passagem da meia-noite. 
			System.out.println("Horas jogadas: " + hora_de_jogo + " Hora(s).");
			
			sc.close();
		}
	}

}
