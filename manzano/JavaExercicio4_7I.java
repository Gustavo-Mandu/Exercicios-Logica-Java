package manzano;

import java.util.Scanner;

/**
 * Descrição: Lê um número inteiro e informa se ele é par ou ímpar. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7I {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero;

		System.out.print("Insira um número inteiro: ");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR.");
		} else {
			System.out.println("O número " + numero + " é ÍMPAR.");
		}

		entrada.close();
	}
}