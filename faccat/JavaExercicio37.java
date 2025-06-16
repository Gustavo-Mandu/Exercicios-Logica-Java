package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula o valor de uma compra de morangos e maçãs, aplicando
 * preços diferenciados por peso e um desconto final baseado no valor ou peso
 * total. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio37 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double kgMorango;
		double kgMaca;

		double subtotalMorango = 0.0;
		double subtotalMaca = 0.0;
		double valorTotal;
		double pesoTotal;
		double desconto = 0.0;

		System.out.print("Quantos quilos (Kg) de morango você quer comprar? ");
		kgMorango = entrada.nextDouble();

		System.out.print("Quantos quilos (Kg) de maçã você quer comprar? ");
		kgMaca = entrada.nextDouble();

		if (kgMorango > 0) {
			if (kgMorango <= 5) {
				subtotalMorango = kgMorango * 2.50;
			} else {
				subtotalMorango = kgMorango * 2.20;
			}
		}

		if (kgMaca > 0) {
			if (kgMaca <= 5) {
				subtotalMaca = kgMaca * 1.80;
			} else {
				subtotalMaca = kgMaca * 1.50;
			}
		}

		valorTotal = subtotalMorango + subtotalMaca;
		pesoTotal = kgMorango + kgMaca;

		if (valorTotal > 25.00 || pesoTotal > 8.0) {
			desconto = valorTotal * 0.10;
		}

		double valorFinal = valorTotal - desconto;

		System.out.println("\n--- RECIBO DA COMPRA ---");
		System.out.printf("Subtotal Morangos (%.1f Kg): R$ %.2f\n", kgMorango, subtotalMorango);
		System.out.printf("Subtotal Maçãs (%.1f Kg): R$ %.2f\n", kgMaca, subtotalMaca);
		System.out.printf("Valor Total Bruto: R$ %.2f\n", valorTotal);
		if (desconto > 0) {
			System.out.printf("Desconto (10%): -R$ %.2f\n", desconto);
		}
		System.out.printf("VALOR FINAL A PAGAR: R$ %.2f\n", valorFinal);

		entrada.close();
	}
}