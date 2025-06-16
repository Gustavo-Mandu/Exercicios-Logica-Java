package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Efetua a leitura de um valor e o apresenta como um valor positivo.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7B {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor;

		System.out.print("Digite um número (positivo ou negativo): ");
		valor = entrada.nextDouble();

		if (valor < 0) {
			valor = valor * -1;
		}

		System.out.printf("O valor, como um número positivo, é: %.2f\n", valor);

		entrada.close();
	}
}