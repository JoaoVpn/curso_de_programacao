package curso_de_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_aula36_parte_6 {

    public static void main(String[] args) {
        /*
         * Você deve fazer um programa que leia um valor qualquer e apresente uma
         * mensagem dizendo em qual dos
         * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se
         * encontra. Obviamente se o valor não estiver em
         * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();
        if (valor >= 0 && valor < 25) {
            System.out.printf("O valor %.2f digitado está dentro do intervalo [0, 25]", valor);
        } else if (valor == 25) {
            System.out.printf("O valor %.2f digitado está dentro de dois intervalos [0, 25] e [25, 50]", valor);
        } else if (valor > 25 && valor < 50) {
            System.out.printf("O valor %.2f digitado está dentro do intervalo [25, 50]", valor);
        } else if (valor == 50) {
            System.out.printf("O valor %.2f digitado está dentro de dois intervalos [25, 50] e [50, 75]", valor);
        } else if (valor > 50 && valor < 75) {
            System.out.printf("O valor %.2f digitado está dentro do intervalo [50, 75]", valor);
        } else if (valor == 75) {
            System.out.printf("O valor %.2f digitado está dentro de dois intervalos [50, 75] e [75, 100]", valor);
        } else if (valor > 75 && valor <= 100) {
            System.out.printf("O valor %.2f digitado está dentro do intervalo [75, 100]", valor);
        } else {
            System.out.println("Erro: Fora do intervalo");
        }

        sc.close();
    }
}
