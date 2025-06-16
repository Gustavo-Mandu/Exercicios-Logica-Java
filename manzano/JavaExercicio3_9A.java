package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Converte uma temperatura de graus Celsius para graus Fahrenheit.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9A {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double celsius;
		double fahrenheit;

		System.out.print("Digite a temperatura em Celsius (°C): ");
		celsius = entrada.nextDouble();

		fahrenheit = (9 * celsius + 160) / 5.0;

		System.out.printf("A temperatura em graus Fahrenheit é: %.1f°F\n", fahrenheit);

		entrada.close();
	}
}