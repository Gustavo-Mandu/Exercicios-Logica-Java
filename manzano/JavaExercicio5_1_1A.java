package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Apresenta a tabuada de multiplicar (de 1 a 10) de um número
 * qualquer. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1A {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double numero;

		System.out.print("Digite um número para ver sua tabuada: ");
		numero = entrada.nextDouble();

		System.out.println("\n--- Tabuada do " + numero + " ---");

		for (int i = 1; i <= 10; i++) {
			double resultado = numero * i;
			System.out.printf("%.1f x %d = %.1f\n", numero, i, resultado);
		}

		entrada.close();
	}
}