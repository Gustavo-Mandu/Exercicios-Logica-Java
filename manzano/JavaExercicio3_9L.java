package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê três valores (A, B e C) e apresenta a soma dos quadrados dos
 * três valores. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9L {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valorA, valorB, valorC, somaDosQuadrados;

		System.out.print("Digite o valor A: ");
		valorA = entrada.nextDouble();
		System.out.print("Digite o valor B: ");
		valorB = entrada.nextDouble();
		System.out.print("Digite o valor C: ");
		valorC = entrada.nextDouble();

		somaDosQuadrados = Math.pow(valorA, 2) + Math.pow(valorB, 2) + Math.pow(valorC, 2);

		System.out.printf("\nA soma dos quadrados (%.1f² + %.1f² + %.1f²) é: %.2f\n", valorA, valorB, valorC,
				somaDosQuadrados);

		entrada.close();
	}
}