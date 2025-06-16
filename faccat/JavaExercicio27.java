package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê um valor e escreve se ele é positivo, negativo ou zero. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio27 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor;

		System.out.print("Digite um valor numérico: ");
		valor = entrada.nextDouble();

		if (valor > 0) {
			System.out.println("O valor é positivo.");
		} else if (valor < 0) {
			System.out.println("O valor é negativo.");
		} else {
			System.out.println("O valor é zero.");
		}

		entrada.close();
	}
}