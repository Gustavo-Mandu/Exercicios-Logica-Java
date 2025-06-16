package faccat;

import java.util.Scanner;
import java.util.Locale;

/**
 * Descrição: Recebe dois valores e os multiplica para gerar a área de um
 * retângulo. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double base;
		double altura;
		double area;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a base do retângulo:");
		base = entrada.nextDouble();

		System.out.print("Insira a altura do retângulo: ");
		altura = entrada.nextDouble();

		area = base * altura;

		System.out.printf("A área do retângulo é: %.2fcm².\n", area);

		entrada.close();
	}
}