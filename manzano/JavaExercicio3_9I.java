package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê dois valores e apresenta o resultado do quadrado da diferença
 * do primeiro pelo segundo. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9I {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valorA, valorB, diferenca, resultado;

		System.out.print("Escreva o primeiro valor: ");
		valorA = entrada.nextDouble();

		System.out.print("Escreva o segundo valor: ");
		valorB = entrada.nextDouble();

		diferenca = valorA - valorB;

		resultado = Math.pow(diferenca, 2);

		System.out.printf("\nO quadrado da diferença (%.2f - %.2f) é: %.2f\n", valorA, valorB, resultado);

		entrada.close();
	}
}