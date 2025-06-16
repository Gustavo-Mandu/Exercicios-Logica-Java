package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Realiza um cálculo com base em duas entradas (x, y) e classifica o
 * resultado (z) em uma das três categorias: A, B ou C. Autor: Gustavo Mandu
 * Ferreira Matori
 */
public class JavaExercicio34 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double x;
		double y;
		double z;
		String resposta;

		System.out.print("Digite o valor de X: ");
		x = entrada.nextDouble();

		System.out.print("Digite o valor de Y: ");
		y = entrada.nextDouble();

		z = (x * y) + 5;

		if (z <= 0) {
			resposta = "A";
		} else if (z <= 100) {
			resposta = "B";
		} else {
			resposta = "C";
		}

		System.out.println("\n--- Resultado do Teste ---");
		System.out.printf("Valor de Z: %.2f\n", z);
		System.out.println("Resposta: " + resposta);

		entrada.close();
	}
}