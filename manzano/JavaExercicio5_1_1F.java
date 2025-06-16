package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula o valor de uma potência com base e expoente definidos pelo
 * usuário. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_1_1F {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double base;
		int expoente;
		double resultado = 1.0;

		System.out.print("Digite o valor da base: ");
		base = entrada.nextDouble();

		System.out.print("Digite o valor do expoente (inteiro e positivo): ");
		expoente = entrada.nextInt();

		for (int i = 1; i <= expoente; i++) {
			resultado = resultado * base;
		}

		System.out.printf("\nO resultado de %.2f elevado a %d é: %.2f\n", base, expoente, resultado);

		entrada.close();
	}
}