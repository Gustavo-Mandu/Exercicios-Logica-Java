package manzano;

/**
 * Descrição: Apresenta os resultados das potências de 3, do expoente 0 ao 15.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1E {

	public static void main(String[] args) {
		long resultado = 1;

		System.out.println("--- Potências de 3 ---");

		for (int expoente = 0; expoente <= 15; expoente++) {
			if (expoente == 0) {
				resultado = 1;
			} else {
				resultado = resultado * 3;
			}
			System.out.println("3 ^ " + expoente + " = " + resultado);
		}
	}
}