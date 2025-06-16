package manzano;

/**
 * Descrição: Apresenta o total da soma dos cem primeiros números inteiros.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1B {

	public static void main(String[] args) {
		int soma = 0;

		for (int i = 1; i <= 100; i++) {
			soma = soma + i;
		}

		System.out.println("O total da soma dos números de 1 a 100 é: " + soma);

	}
}