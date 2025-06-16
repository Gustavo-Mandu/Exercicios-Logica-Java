package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula e apresenta o valor do volume de uma lata de óleo. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9C {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double raio;
		double altura;
		double volume;

		System.out.print("Digite o raio da base da lata (em cm): ");
		raio = entrada.nextDouble();

		System.out.print("Digite a altura da lata (em cm): ");
		altura = entrada.nextDouble();

		volume = Math.PI * Math.pow(raio, 2) * altura;

		System.out.printf("\nO volume dessa lata de óleo é de: %.2f cm³\n", volume);

		entrada.close();
	}
}