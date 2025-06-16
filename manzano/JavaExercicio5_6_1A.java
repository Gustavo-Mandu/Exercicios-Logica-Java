package manzano;

/**
 * Descrição: Apresenta os quadrados dos números inteiros de 15 a 200. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_6_1A {

	public static void main(String[] args) {
		System.out.println("--- Quadrado dos números de 15 a 200 ---");

		for (int numero = 15; numero <= 200; numero++) {
			long quadrado = (long) numero * numero;
			System.out.println("O quadrado de " + numero + " é " + quadrado);
		}
	}
}