package manzano;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Efetua a leitura de três valores e os apresenta em ordem
 * crescente. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7F {

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

		System.out.println("\nValores em ordem crescente: " + valores[0] + ", " + valores[1] + ", " + valores[2]);

		entrada.close();
	}
}