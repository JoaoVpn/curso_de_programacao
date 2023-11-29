package curso_de_programacao;

import java.util.Locale;

public class exercicio_aula23 {

	public static void main(String[] args) {
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double mensuracao = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, whitch price is $ %.2f. %n", produto1, preco1);
		System.out.printf("%s, witch price is $ %.2f. %n %n", produto2, preco2);
		System.out.printf("Record: %d years old, code %d and gender: %c. %n %n", idade, codigo, sexo);
		System.out.printf("Measue with eight decimal places: %.8f. %n", mensuracao);
		System.out.printf("Rouded (three decimal places): %.3f. %n", mensuracao);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f. %n", mensuracao);
	}

}
