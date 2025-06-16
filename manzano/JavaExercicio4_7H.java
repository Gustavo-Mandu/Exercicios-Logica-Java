package manzano;

import java.util.Scanner;

/**
 * Descrição: Efetua a leitura de cinco números inteiros e identifica o maior e
 * o menor valores. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7H {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite 5 valores inteiros: ");

		for (int i = 1; i <= 5; i++) {
			System.out.printf("Digite o %dº valor: ", i);
			valor = entrada.nextInt();

			if (valor > maior) {
				maior = valor;
			}

			if (valor < menor) {
				menor = valor;
			}
		}

		System.out.println("\nO MAIOR valor inserido foi: " + maior);
		System.out.println("O MENOR valor inserido foi: " + menor);

		entrada.close();
	}
}