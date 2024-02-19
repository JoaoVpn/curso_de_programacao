package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1-Domingo\n2-Segunda\n3-Terça\n4-Quarta\n5-Quinta\n6-Sexta\n7-Sábado\nDigite um número: ");
        int dia = sc.nextInt();
        if (dia == 1) {
            System.out.println("Hoje é Domingo!");
        } else if (dia == 2) {
            System.out.println("Hoje é Segunda-feira!");
        } else if (dia == 3) {
            System.out.println("Hoje é Terça-feira!");
        } else if (dia == 4) {
            System.out.println("Hoje é Quarta-feira!");
        } else if (dia == 5) {
            System.out.println("Hoje é Quinta-feira!");
        } else if (dia == 6) {
            System.out.println("Hoje é Sexta-feira!");
        } else if (dia == 7) {
            System.out.println("Hoje é Sábado!");
        }
        sc.close();
    }
}
