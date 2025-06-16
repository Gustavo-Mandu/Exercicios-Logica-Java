package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Efetua a leitura de valores positivos e apresenta no final o
 * somatório, a média e o total de valores lidos. Autor: Gustavo Mandu Ferreira
 * Matori
 */
public class JavaExercicio5_2_1F {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double somatorio = 0;
		int totalDeValoresLidos = 0;

		System.out.println("Digite valores positivos (um negativo para encerrar).");

		while (true) {
			System.out.print("Digite um valor: ");
			double valor = entrada.nextDouble();

			if (valor < 0) {
				break;
			}

			somatorio += valor;
			totalDeValoresLidos++;
		}

		System.out.println("\n--- Resultado ---");

		if (totalDeValoresLidos > 0) {
			double media = somatorio / totalDeValoresLidos;
			System.out.printf("Total do somatório: %.2f\n", somatorio);
			System.out.printf("Média aritmética: %.2f\n", media);
			System.out.println("Total de valores lidos: " + totalDeValoresLidos);
		} else {
			System.out.println("Nenhum valor positivo foi digitado.");
		}

		entrada.close();
	}
}