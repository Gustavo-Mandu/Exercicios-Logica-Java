package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula o salário total de um funcionário, aplicando um acréscimo
 * de 50% para as horas trabalhadas além de 160 no mês. Autor: Gustavo Mandu
 * Ferreira Matori
 */
public class JavaExercicio22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int horasTrabalhadas;
		double salarioPorHora;
		double salarioTotal;
		final int LIMITE_HORAS_REGULARES = 160;

		System.out.print("Digite o número de horas trabalhadas no mês: ");
		horasTrabalhadas = entrada.nextInt();

		System.out.print("Digite o seu salário por hora: R$ ");
		salarioPorHora = entrada.nextDouble();

		if (horasTrabalhadas <= LIMITE_HORAS_REGULARES) {
			salarioTotal = horasTrabalhadas * salarioPorHora;
			System.out.printf("Seu salário total é de: R$ %.2f\n", salarioTotal);
		} else {
			double salarioRegular = LIMITE_HORAS_REGULARES * salarioPorHora;
			int horasExtras = horasTrabalhadas - LIMITE_HORAS_REGULARES;
			double valorHoraExtra = salarioPorHora * 1.50;
			double pagamentoHorasExtras = horasExtras * valorHoraExtra;

			salarioTotal = salarioRegular + pagamentoHorasExtras;

			System.out.println("\n--- Resumo do Pagamento ---");
			System.out.printf("Salário base (%d horas): R$ %.2f\n", LIMITE_HORAS_REGULARES, salarioRegular);
			System.out.printf("Horas extras (%d horas): R$ %.2f\n", horasExtras, pagamentoHorasExtras);
			System.out.printf("Salário TOTAL com horas extras é de: R$ %.2f\n", salarioTotal);
		}

		entrada.close();
	}
}