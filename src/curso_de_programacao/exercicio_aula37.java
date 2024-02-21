package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de minutos gastos: ");
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos <= 100) {
            System.out.println("Valor a pagar: R$ 50,00");
        } else if (minutos > 100) {
            conta += (minutos - 100) * 2.0; // utiliza-se também o comando conta = conta + (minutos - 100) * 2.0
            System.out.printf("Valor a pagar: R$ %.2f", conta);    
        }
        
        sc.close();
    }
}