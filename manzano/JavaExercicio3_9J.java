package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Converte um valor de Real para Dólar com base na cotação. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9J {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double cotacaoDoDolar;
		double quantidadeDeReais;
		double valorEmDolares;

		System.out.print("Digite a cotação do dólar (quantos Reais para 1 Dólar): ");
		cotacaoDoDolar = entrada.nextDouble();

		System.out.print("Quantos Reais (R$) você quer converter? ");
		quantidadeDeReais = entrada.nextDouble();

		valorEmDolares = quantidadeDeReais / cotacaoDoDolar;

		System.out.printf("\nR$ %.2f equivalem a US$ %.2f\n", quantidadeDeReais, valorEmDolares);

		entrada.close();
	}
}