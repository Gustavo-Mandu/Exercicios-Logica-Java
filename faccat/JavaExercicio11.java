package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula o salário final de um vendedor com base em salário fixo,
 * comissão por carro vendido e um percentual sobre o valor total das vendas.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double salarioFixo;
		double comissaoFixaPorCarro;
		int carrosVendidos;
		double valorTotalVendas;
		double salarioFinal;

		System.out.print("Digite o salário fixo do funcionário: R$ ");
		salarioFixo = entrada.nextDouble();

		System.out.print("Digite o número de carros vendidos: ");
		carrosVendidos = entrada.nextInt();

		System.out.print("Digite a comissão fixa por carro vendido: R$ ");
		comissaoFixaPorCarro = entrada.nextDouble();

		System.out.print("Digite o valor total de suas vendas: R$ ");
		valorTotalVendas = entrada.nextDouble();

		salarioFinal = salarioFixo + (comissaoFixaPorCarro * carrosVendidos) + (valorTotalVendas * 0.05);

		System.out.printf("O salário final do vendedor é de: R$ %.2f\n", salarioFinal);

		entrada.close();
	}
}