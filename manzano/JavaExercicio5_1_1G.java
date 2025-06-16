package manzano;

/**
 * Descrição: Apresenta a série de Fibonacci até o décimo quinto termo. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1G {

	public static void main(String[] args) {
		long anterior = 0;
		long atual = 1;

		System.out.println("--- 15 Primeiros Termos da Série de Fibonacci ---");
		System.out.println("1º termo: " + atual);

		for (int i = 2; i <= 15; i++) {
			long proximo = anterior + atual;
			System.out.println(i + "º termo: " + proximo);
			anterior = atual;
			atual = proximo;
		}
	}
}