package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula o salário final de um vendedor, adicionando um bônus
 * progressivo com base no valor de suas vendas. Autor: Gustavo Mandu Ferreira
 * Matori
 */
public class JavaExercicio24 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		final double LIMITE_FAIXA_BONUS = 1500.00;
		final double PERCENTUAL_FAIXA_1 = 0.03; // 3%
		final double PERCENTUAL_FAIXA_2 = 0.05; // 5%

		double salarioFixo;
		double valorVendas;
		double bonusTotal;
		double salarioFinal;

		System.out.print("Digite o salário fixo do vendedor: R$ ");
		salarioFixo = entrada.nextDouble();

		System.out.print("Digite o valor total das vendas efetuadas: R$ ");
		valorVendas = entrada.nextDouble();

		if (valorVendas > LIMITE_FAIXA_BONUS) {
			double bonusFaixa1 = LIMITE_FAIXA_BONUS * PERCENTUAL_FAIXA_1;
			double valorExcedente = valorVendas - LIMITE_FAIXA_BONUS;
			double bonusFaixa2 = valorExcedente * PERCENTUAL_FAIXA_2;
			bonusTotal = bonusFaixa1 + bonusFaixa2;
		} else {
			bonusTotal = valorVendas * PERCENTUAL_FAIXA_1;
		}

		salarioFinal = salarioFixo + bonusTotal;

		System.out.println("\n--- Resumo do Salário ---");
		System.out.printf("Salário Fixo: R$ %.2f\n", salarioFixo);
		System.out.printf("Valor das Vendas: R$ %.2f\n", valorVendas);
		System.out.printf("Bônus sobre Vendas: R$ %.2f\n", bonusTotal);
		System.out.printf("Salário FINAL: R$ %.2f\n", salarioFinal);

		entrada.close();
	}
}