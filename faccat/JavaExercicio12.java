package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Converte uma temperatura em graus Fahrenheit para graus Celsius.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double grausF;
		double grausC;

		System.out.print("Digite a temperatura em graus Fahrenheit (°F): ");
		grausF = entrada.nextDouble();

		grausC = (grausF - 32) * 5.0 / 9.0;

		System.out.printf("O valor da temperatura em graus Celsius é: %.1f°C\n", grausC);

		entrada.close();
	}
}