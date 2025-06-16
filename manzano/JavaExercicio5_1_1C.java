package manzano;

/**
 * Descrição: Apresenta o somatório dos valores pares existentes na faixa de 1
 * até 500. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1C {

	public static void main(String[] args) {
		int soma = 0;

		for (int i = 2; i <= 500; i += 2) {
			soma = soma + i;
		}

		System.out.println("O somatório dos números pares de 1 até 500 é: " + soma);
	}
}
