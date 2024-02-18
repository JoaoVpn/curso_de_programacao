package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula36_parte_8 {
    public static void main(String[] args) {
        /*
         * Em um país imaginário denominado banania, todos os habitantes ficam felizes
         * em
         * pagar seus impostos (haja muita imaginação), pois sabem
         * que nele não existem políticos corruptos e os recursos arrecadados são
         * utilizados em benefício da população, sem
         * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
         * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
         * de Lisarb. Em seguida, calcule e
         * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a
         * tabela abaixo.
         * 
         * Imposto de Renda:
         * de 0.00 a R$ 2000.00 -------------- Isento
         * de R$ 2000.01 até R$ 3000.00 ------ 8 %
         * de R$ 3000.01 até R$ 4500.00 ------ 18 %
         * acima de R$ 4500.00 --------------- 28 %
         * 
         * Lembre-se que o valor deve ser impresso com duas casas decimais.
         * 
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga o salário para cálculo: ");
        double salario = sc.nextDouble();
        double valor_do_imposto;
        if (salario >= 0.00 && salario <=2000.00) {
            System.out.print("O usuário está isento de imposto de renda.");
        } else if (salario > 2000.00 && salario <= 3000.00) {
            valor_do_imposto = 8.00/100 * salario;
            System.out.printf("O usuário terá que pagar R$ %.2f de imposto de renda.", valor_do_imposto);
        } else if (salario > 3000.00 && salario <= 4500.00) {
            valor_do_imposto = 18.00/100 * salario;
            System.out.printf("O usuário terá que pagar R$ %.2f de imposto de renda.", valor_do_imposto);
        } else if (salario > 4500.00) {
            valor_do_imposto = 28.00/100 * salario;
            System.out.printf("O usuário terá que pagar R$ %.2f de imposto de renda.", valor_do_imposto);
        } else {
            System.out.println("Erro. Valor inválido.");
        }

         sc.close();
    }
}