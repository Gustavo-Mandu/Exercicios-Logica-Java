package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê dois valores e apresenta o resultado da diferença do maior pelo
 * menor. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7A {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor1, valor2, resultado;

		System.out.print("Digite o primeiro valor: ");
		valor1 = entrada.nextDouble();

		System.out.print("Digite o segundo valor: ");
		valor2 = entrada.nextDouble();

		if (valor1 >= valor2) {
			resultado = valor1 - valor2;
		} else {
			resultado = valor2 - valor1;
		}

		System.out.printf("A diferença do maior pelo menor valor é: %.2f\n", resultado);

		entrada.close();
	}
}