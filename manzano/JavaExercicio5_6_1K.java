package manzano;

import java.math.BigInteger;

/**
 * Descrição: Apresenta o fatorial dos valores ímpares na faixa de 1 a 10.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_6_1K {

	public static void main(String[] args) {
		System.out.println("--- Fatorial dos Ímpares de 1 a 10 ---");

		for (int i = 1; i < 10; i += 2) {
			BigInteger fatorial = BigInteger.ONE;

			for (int j = 1; j <= i; j++) {
				fatorial = fatorial.multiply(BigInteger.valueOf(j));
			}
			System.out.println("Fatorial de " + i + " é: " + fatorial);
		}
	}
}