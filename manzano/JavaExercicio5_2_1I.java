package manzano;

import java.util.Scanner;

/**
 * Descrição: Lê valores positivos inteiros e, ao final, apresenta o maior e o
 * menor dos valores informados. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_2_1I {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor;
		int maior = 0;
		int menor = 0;
		boolean primeiroValor = true;

		System.out.println("Digite valores inteiros positivos (ou um negativo para sair).");

		while (true) {
			System.out.print("Digite um valor: ");
			valor = entrada.nextInt();

			if (valor < 0) {
				break;
			}

			if (primeiroValor) {
				maior = valor;
				menor = valor;
				primeiroValor = false;
			} else {
				if (valor > maior) {
					maior = valor;
				}
				if (valor < menor) {
					menor = valor;
				}
			}
		}

		System.out.println("\n--- Resultado Final ---");
		if (primeiroValor) {
			System.out.println("Nenhum valor positivo foi informado.");
		} else {
			System.out.println("Maior valor informado: " + maior);
			System.out.println("Menor valor informado: " + menor);
		}

		entrada.close();
	}
}