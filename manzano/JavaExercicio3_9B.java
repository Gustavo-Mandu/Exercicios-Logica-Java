package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Converte uma temperatura de graus Fahrenheit para graus Celsius.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9B {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double fahrenheit;
		double celsius;

		System.out.print("Digite a temperatura em Fahrenheit (°F): ");
		fahrenheit = entrada.nextDouble();

		celsius = (fahrenheit - 32) * 5.0 / 9.0;

		System.out.printf("O valor da temperatura em graus Celsius é: %.1f°C\n", celsius);

		entrada.close();
	}
}