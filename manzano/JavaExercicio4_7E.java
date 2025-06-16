package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula as raízes de uma equação de segundo grau, validando as
 * condições de existência (A != 0 e Delta >= 0). Autor: Gustavo Mandu Ferreira
 * Matori
 */
public class JavaExercicio4_7E {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double a, b, c;

		System.out.print("Digite o valor de A: ");
		a = entrada.nextDouble();

		while (a == 0) {
			System.out.println("O valor de A não pode ser zero!");
			System.out.print("Digite um novo valor para A: ");
			a = entrada.nextDouble();
		}

		System.out.print("Digite o valor de B: ");
		b = entrada.nextDouble();

		System.out.print("Digite o valor de C: ");
		c = entrada.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		System.out.printf("\nDelta (Δ) = %.2f\n", delta);

		if (delta > 0) {
			double raizX1 = (-b + Math.sqrt(delta)) / (2 * a);
			double raizX2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("A equação possui duas raízes reais e distintas:");
			System.out.printf("Raiz x1: %.2f\n", raizX1);
			System.out.printf("Raiz x2: %.2f\n", raizX2);
		} else if (delta == 0) {
			double raizX1 = -b / (2 * a);
			System.out.println("A equação possui uma raiz real:");
			System.out.printf("Raiz: %.2f\n", raizX1);
		} else {
			System.out.println("A equação não possui raízes reais.");
		}

		entrada.close();
	}
}