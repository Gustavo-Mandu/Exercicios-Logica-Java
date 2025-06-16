package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê 10 valores numéricos e apresenta o somatório e a média
 * aritmética. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1I {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº valor de 10: ", i);
			double valor = entrada.nextDouble();
			soma += valor;
		}

		double media = soma / 10.0;

		System.out.println("\n--- Resultado Final ---");
		System.out.printf("Somatório dos valores: %.2f\n", soma);
		System.out.printf("Média aritmética: %.2f\n", media);

		entrada.close();
	}
}