package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê 3 valores e informa qual deles é o maior. Autor: Gustavo Mandu
 * Ferreira Matori
 */
public class JavaExercicio28 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor1, valor2, valor3;

		System.out.print("Digite o primeiro valor: ");
		valor1 = entrada.nextDouble();

		System.out.print("Digite o segundo valor: ");
		valor2 = entrada.nextDouble();

		System.out.print("Digite o terceiro valor: ");
		valor3 = entrada.nextDouble();

		if (valor1 >= valor2 && valor1 >= valor3) {
			System.out.println("O maior valor é: " + valor1 + " (Primeiro valor)");
		} else if (valor2 >= valor1 && valor2 >= valor3) {
			System.out.println("O maior valor é: " + valor2 + " (Segundo valor)");
		} else {
			System.out.println("O maior valor é: " + valor3 + " (Terceiro valor)");
		}

		entrada.close();
	}
}