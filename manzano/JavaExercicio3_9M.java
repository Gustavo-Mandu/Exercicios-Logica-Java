package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê três valores (A, B e C) e apresenta o quadrado da soma dos três
 * valores. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9M {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valorA, valorB, valorC, soma, quadradoDaSoma;

		System.out.print("Digite o valor A: ");
		valorA = entrada.nextDouble();
		System.out.print("Digite o valor B: ");
		valorB = entrada.nextDouble();
		System.out.print("Digite o valor C: ");
		valorC = entrada.nextDouble();

		soma = valorA + valorB + valorC;
		quadradoDaSoma = Math.pow(soma, 2);

		System.out.printf("\nO quadrado da soma (%.1f + %.1f + %.1f)² é: %.2f\n", valorA, valorB, valorC,
				quadradoDaSoma);

		entrada.close();
	}
}