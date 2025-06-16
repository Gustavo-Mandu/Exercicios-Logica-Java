package faccat;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê três valores e os exibe em ordem crescente. Autor: Gustavo
 * Mandu Ferreira Matori
 */
public class JavaExercicio30 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double[] valores = new double[3];

		System.out.print("Digite o primeiro valor: ");
		valores[0] = entrada.nextDouble();

		System.out.print("Digite o segundo valor: ");
		valores[1] = entrada.nextDouble();

		System.out.print("Digite o terceiro valor: ");
		valores[2] = entrada.nextDouble();

		Arrays.sort(valores);

		System.out.println("\nOs valores em ordem crescente são: ");
		System.out.println(valores[0] + ", " + valores[1] + ", " + valores[2]);

		entrada.close();
	}
}