package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê dois valores e os exibe em ordem crescente. Autor: Gustavo
 * Mandu Ferreira Matori
 */
public class JavaExercicio20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor1;
		double valor2;

		System.out.print("Digite o primeiro valor: ");
		valor1 = entrada.nextDouble();

		System.out.print("Digite o segundo valor: ");
		valor2 = entrada.nextDouble();

		System.out.println("\nOs valores em ordem crescente são:");

		if (valor1 < valor2) {
			System.out.println(valor1 + " e " + valor2);
		} else if (valor2 < valor1) {
			System.out.println(valor2 + " e " + valor1);
		} else {
			System.out.println("Os valores são iguais: " + valor1 + " e " + valor2);
		}

		entrada.close();
	}
}