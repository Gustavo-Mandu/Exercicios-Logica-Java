package manzano;

/**
 * Descrição: Apresenta todos os valores numéricos inteiros ímpares na faixa de
 * 0 a 20. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_6_1E {

	public static void main(String[] args) {
		System.out.println("Números ímpares de 0 a 20:");

		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}