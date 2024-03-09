package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula48_parte_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
         * preferência de seus clientes. Escreva
         * um algoritmo para ler o tipo de combustível abastecido (codificado da
         * seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
         * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
         * deve ser solicitado um novo código (até
         * que seja válido). O programa será encerrado quando o código informado for o
         * número 4. Deve ser escrito a
         * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
         * tipo de combustível, conforme
         * exemplo.
         */

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        System.out.println("Produto de preferência: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        int numero = sc.nextInt();
        
        while (numero != 4672) { // O número 4672 foi escolhido com o objetivo de prevenir que um cliente, indevidamente, pressione uma tecla de fácil acesso e, assim, evite a conclusão prematura do código.
            if (numero == 1) {
                alcool = alcool + 1;
                System.out.println("Muito obrigado! \nVolte sempre!");
            }
            else if (numero == 2) {
                gasolina = gasolina + 1;
                System.out.println("Muito obrigado! \nVolte sempre!");
            }
            else if (numero==3) {
                diesel = diesel + 1;
                System.out.println("Muito obrigado! \nVolte sempre!");
            }
            else {
                System.out.println("Número inválido. \nTente novamente.");
            }
            numero = sc.nextInt();
        }
        System.out.printf("Quantidade de clientes que abasteceram cada tipo de combustível:\n1.Álcool: %d\n2.Gasolina: %d\n3.Diesel: %d\n", alcool, gasolina, diesel);
        int total = alcool + gasolina + diesel;
        System.out.printf("Total de clientes que abasteceram: %d clientes.", total);
        sc.close();
    }
}
