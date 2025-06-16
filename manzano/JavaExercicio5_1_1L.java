package manzano;

import java.util.Scanner;

/**
 * Descrição: Lê valores positivos inteiros e, ao final, apresenta o maior e o
 * menor dos valores informados. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1L {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor;
		int maior = 0;
		int menor = 0;
		int contador = 0;

		System.out.println("Digite valores inteiros positivos (ou um negativo para sair).");

		while (true) {
			System.out.print("Digite um valor: ");
			valor = entrada.nextInt();

			if (valor < 0) {
				break;
			}

			if (contador == 0) {
				maior = valor;
				menor = valor;
			} else {
				if (valor > maior) {
					maior = valor;
				}
				if (valor < menor) {
					menor = valor;
				}
			}
			contador++;
		}

		System.out.println("\n--- Resultado Final ---");
		if (contador > 0) {
			System.out.println("Maior valor informado: " + maior);
			System.out.println("Menor valor informado: " + menor);
		} else {
			System.out.println("Nenhum valor positivo foi informado.");
		}

		entrada.close();
	}
}