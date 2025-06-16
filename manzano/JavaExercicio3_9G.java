package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê quatro números e calcula todas as combinações de soma e
 * multiplicação entre pares de números. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9G {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double a, b, c, d;

		System.out.print("Digite o valor de A: ");
		a = entrada.nextDouble();

		System.out.print("Digite o valor de B: ");
		b = entrada.nextDouble();

		System.out.print("Digite o valor de C: ");
		c = entrada.nextDouble();

		System.out.print("Digite o valor de D: ");
		d = entrada.nextDouble();

		System.out.println("\n--- Resultados das Operações Entre Pares ---");

		System.out.printf("A + B = %.2f\n", (a + b));
		System.out.printf("A * B = %.2f\n", (a * b));
		System.out.printf("A + C = %.2f\n", (a + c));
		System.out.printf("A * C = %.2f\n", (a * c));
		System.out.printf("A + D = %.2f\n", (a + d));
		System.out.printf("A * D = %.2f\n", (a * d));

		System.out.println("----------------------------------------");

		System.out.printf("B + C = %.2f\n", (b + c));
		System.out.printf("B * C = %.2f\n", (b * c));
		System.out.printf("B + D = %.2f\n", (b + d));
		System.out.printf("B * D = %.2f\n", (b * d));

		System.out.println("----------------------------------------");

		System.out.printf("C + D = %.2f\n", (c + d));
		System.out.printf("C * D = %.2f\n", (c * d));

		entrada.close();
	}
}