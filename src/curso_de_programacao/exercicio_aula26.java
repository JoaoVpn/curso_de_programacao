package curso_de_programacao;

import java.util.Scanner;

public class exercicio_aula26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine(); // Esse nextLine() serve para limpar o buffer de leitura e impedir o erro daquebra se linha que ocupara o espaço do nextLine de baixo. (Quando tiver dúvida, experimente retirar essa linha de cógigo para ver o erro que aparecerá.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		/*
		 * O método next() lê apenas a primeira palavra da entrada, enquanto o método
		 * nextLine() lê toda a linha, incluindo espaços entre as palavras.
		 */

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
