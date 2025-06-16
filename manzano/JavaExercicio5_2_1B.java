package manzano;

/**
 * Descrição: Apresenta o somatório dos valores pares na faixa de 1 até 500.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_2_1B {

	public static void main(String[] args) {
		int somatorio = 0;
		int numero = 1;

		do {
			if (numero % 2 == 0) {
				somatorio += numero;
			}
			numero++;
		} while (numero <= 500);

		System.out.println("O somatório dos números pares de 1 a 500 é: " + somatorio);
	}
}