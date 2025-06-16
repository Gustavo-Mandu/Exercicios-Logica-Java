package manzano;

/**
 * Descrição: Apresenta todos os números divisíveis por 4 que sejam menores que
 * 200. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_2_1C {

	public static void main(String[] args) {
		System.out.println("Números divisíveis por 4 e menores que 200:");

		for (int numero = 4; numero < 200; numero += 4) {
			System.out.println(numero);
		}
	}
}
