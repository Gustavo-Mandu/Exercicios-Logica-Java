package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Efetua o cálculo e a apresentação do valor de uma prestação em
 * atraso. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9E {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valorOriginal;
		double taxaJurosDiaria;
		int tempoAtrasoDias;
		double valorFinal;

		System.out.print("Insira o valor original da prestação: R$ ");
		valorOriginal = entrada.nextDouble();

		System.out.print("Insira a taxa de juros ao dia (%): ");
		taxaJurosDiaria = entrada.nextDouble();

		System.out.print("Insira o tempo de atraso (em dias): ");
		tempoAtrasoDias = entrada.nextInt();

		valorFinal = valorOriginal + (valorOriginal * taxaJurosDiaria / 100) * tempoAtrasoDias;

		System.out.printf("\nO valor da prestação em atraso é: R$ %.2f\n", valorFinal);

		entrada.close();
	}
}