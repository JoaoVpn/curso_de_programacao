package curso_de_programacao;

import java.util.Locale;
import java.util.Scanner;

class exercício_aula36_parte_7 {
    public static void main(String[] args) {
        /*
         * Leia 2 valores com uma casa decimal (x e y), que devem representar as
         * coordenadas de um ponto em um plano.
         * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos
         * eixos cartesianos ou na origem (x = y = 0).
         * Se o ponto estiver na origem, escreva a mensagem “Origem”.
         * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme
         * for a situação.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double valor_x = sc.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double valor_y = sc.nextDouble();
        if (valor_x == 0 && valor_y == 0) {
            System.out.print("O valor de x e y está na origem.");
        } else if (valor_x > 0 && valor_y > 0) {
            System.out.print("O valor de x e y está no Q1.");
        } else if (valor_x < 0 && valor_y > 0) {
            System.out.print("O valor de x e y está no Q2");
        } else if (valor_x < 0 && valor_y < 0) {
            System.out.print("O valor de x e y está no Q3.");
        } else if (valor_x > 0 && valor_y < 0) {
            System.out.print("O valor de x e de y está no Q4.");
        } else {
            System.out.print("Erro. Valores inválidos.");
        }
        sc.close();
    }

}