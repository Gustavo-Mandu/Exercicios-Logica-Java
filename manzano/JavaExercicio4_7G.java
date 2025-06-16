package manzano;

import java.util.Scanner;

/**
 * Descrição: Lê quatro números inteiros e apresenta os que são divisíveis por 2
 * e por 3 simultaneamente. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7G {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite o %dº número inteiro: ", i + 1);
			numeros[i] = entrada.nextInt();
		}

		System.out.println("\n--- Verificação ---");

		for (int i = 0; i < 4; i++) {
			if (numeros[i] % 2 == 0 && numeros[i] % 3 == 0) {
				System.out.println("O número " + numeros[i] + " é divisível por 2 e 3.");
			}
		}

		entrada.close();
	}
}