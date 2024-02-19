package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1-Domingo\n2-Segunda\n3-Terça\n4-Quarta\n5-Quinta\n6-Sexta\n7-Sábado\nDigite um número: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.print("Hoje é domingo!");
                break;
            case 2:
                System.out.print("Hoje é segunda-feira!");
                break;
            case 3:
                System.out.print("Hoje é terça-feira!");
                break;
            case 4:
                System.out.print("Hoje é quarta-feira!");
                break;
            case 5:
                System.out.print("Hoje é quinta-feira!");
                break;
            case 6:
                System.out.print("Hoje é sexta-feira!");
                break;
            case 7:
            System.out.print("Hoje é sábado!");
            break;
            
            default:
                System.out.print("Valor inválido.");
                break;
        }
        sc.close();
    }
}
