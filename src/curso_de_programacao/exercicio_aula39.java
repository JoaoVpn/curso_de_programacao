package curso_de_programacao;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_aula39 {
    public static void main(String[] args) {
        // Aprendendo a fazer expressão condicional ternária.
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
        System.out.printf("O valor do produto com desconto é: %.2f", desconto);
        sc.close();
    }
}
