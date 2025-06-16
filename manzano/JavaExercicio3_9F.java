package manzano;

import java.util.Scanner;

/**
 * Descrição: Recebe dois valores e troca o conteúdo das variáveis entre si.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9F {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valorA;
		int valorB;
		int valorAuxiliar;

		System.out.print("Digite o valor de A: ");
		valorA = entrada.nextInt();

		System.out.print("Digite o valor de B: ");
		valorB = entrada.nextInt();

		System.out.println("\nValores originais: A = " + valorA + ", B = " + valorB);

		valorAuxiliar = valorA;
		valorA = valorB;
		valorB = valorAuxiliar;

		System.out.println("Valores trocados: A = " + valorA + ", B = " + valorB);

		entrada.close();
	}
}