package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Converte um valor de Dólar para Real com base na cotação. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9K {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double cotacaoDoDolar;
		double quantidadeDeDolares;
		double valorEmReais;

		System.out.print("Digite a cotação do dólar (quantos Reais para 1 Dólar): ");
		cotacaoDoDolar = entrada.nextDouble();

		System.out.print("Quantos Dólares (US$) você quer converter? ");
		quantidadeDeDolares = entrada.nextDouble();

		valorEmReais = quantidadeDeDolares * cotacaoDoDolar;

		System.out.printf("\nUS$ %.2f equivalem a R$ %.2f\n", quantidadeDeDolares, valorEmReais);

		entrada.close();
	}
}