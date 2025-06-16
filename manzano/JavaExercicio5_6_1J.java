package manzano;

import java.util.Locale;

/**
 * Descrição: Apresenta os valores de conversão de graus Celsius para Fahrenheit
 * de 10 em 10 graus, de 10°C até 100°C. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_6_1J {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		System.out.println("--- Tabela de Conversão: Celsius para Fahrenheit ---");

		for (int celsius = 10; celsius <= 100; celsius += 10) {
			double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
			System.out.printf("%d°C  =  %.1f°F\n", celsius, fahrenheit);
		}
	}
}