package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê 3 valores e apresenta a soma dos 2 maiores. Autor: Gustavo
 * Mandu Ferreira Matori
 */
public class JavaExercicio29 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor1, valor2, valor3;

		System.out.print("Digite o primeiro valor: ");
		valor1 = entrada.nextDouble();

		System.out.print("Digite o segundo valor: ");
		valor2 = entrada.nextDouble();

		System.out.print("Digite o terceiro valor: ");
		valor3 = entrada.nextDouble();

		double menorValor = Math.min(valor1, Math.min(valor2, valor3));

		double somaTotal = valor1 + valor2 + valor3;

		double somaDosMaiores = somaTotal - menorValor;

		System.out.printf("\nA soma dos dois maiores valores é: %.2f +\n", somaDosMaiores);

		entrada.close();
	}
}