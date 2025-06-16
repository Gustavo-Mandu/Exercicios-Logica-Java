package manzano;

/**
 * Descrição: Apresenta o somatório dos valores pares existentes na faixa de 1
 * até 500. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_6_1D {

	public static void main(String[] args) {
		int somaDosPares = 0;

		for (int i = 2; i <= 500; i += 2) {
			somaDosPares += i;
		}

		System.out.println("O somatório dos valores pares de 1 a 500 é: " + somaDosPares);
	}
}
