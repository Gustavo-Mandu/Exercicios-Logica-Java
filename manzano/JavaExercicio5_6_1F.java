package manzano;

/**
 * Descrição: Apresenta todos os números divisíveis por 4 que sejam menores que
 * 200. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_6_1F {

	public static void main(String[] args) {
		System.out.println("Números divisíveis por 4 (de 1 a 200):");

		for (int numero = 1; numero <= 200; numero++) {
			if (numero % 4 == 0) {
				System.out.println(numero);
			}
		}
	}
}
