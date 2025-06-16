package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê dois valores e mostra qual deles é o maior. Autor: Gustavo
 * Mandu Ferreira Matori
 */
public class JavaExercicio19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor1;
		double valor2;

		System.out.print("Digite o primeiro valor: ");
		valor1 = entrada.nextDouble();

		System.out.print("Digite o segundo valor: ");
		valor2 = entrada.nextDouble();

		if (valor1 > valor2) {
			System.out.println("O primeiro valor (" + valor1 + ") é maior que o segundo valor (" + valor2 + ").");
		} else if (valor2 > valor1) {
			System.out.println("O segundo valor (" + valor2 + ") é maior que o primeiro valor (" + valor1 + ").");
		} else {
			System.out.println("Os dois valores são iguais! ");
		}

		entrada.close();
	}
}