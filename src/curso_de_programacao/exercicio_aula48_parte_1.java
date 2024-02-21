package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula48_parte_1 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que repita a leitura de uma senha até que ela seja
         * válida. Para cada leitura de senha
         * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
         * informada corretamente deve ser
         * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
         * a senha correta é o valor 2002.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha inválida.");
            senha = sc.nextInt();
        }
        System.out.println("Acesso concedido.");
        sc.close();
    }
}