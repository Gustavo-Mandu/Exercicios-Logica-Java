package manzano;

import java.util.Locale;

/**
 * Descrição: Apresenta a soma e a média aritmética dos valores pares situados
 * na faixa numérica de 50 a 70. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1J {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int soma = 0;
		int contadorDePares = 0;

		for (int i = 50; i <= 70; i++) {
			if (i % 2 == 0) {
				soma += i;
				contadorDePares++;
			}
		}

		double media = (double) soma / contadorDePares;

		System.out.println("--- Análise dos Pares de 50 a 70 ---");
		System.out.println("Soma dos números pares: " + soma);
		System.out.printf("Média aritmética dos pares: %.2f\n", media);
	}
}