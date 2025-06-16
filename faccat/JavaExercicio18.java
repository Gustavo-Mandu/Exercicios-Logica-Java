package faccat;

import java.util.Scanner;
import java.time.Year;

/**
 * Descrição: Recebe o ano de nascimento de uma pessoa, calcula a idade e
 * informa se ela pode votar no ano atual. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int anoAtual = Year.now().getValue();

		int anoDeNascimento;
		int idade;

		System.out.println("O ano atual é " + anoAtual + ".");
		System.out.print("Digite seu ano de nascimento: ");
		anoDeNascimento = entrada.nextInt();

		idade = anoAtual - anoDeNascimento;

		if (idade >= 16) {
			System.out.println("Com " + idade + " anos, você pode votar este ano! ");
		} else {
			System.out.println("Com " + idade + " anos, você ainda não pode votar este ano.");
		}

		entrada.close();
	}
}