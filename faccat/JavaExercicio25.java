package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Recebe dados bancários, calcula o saldo atual e informa se o saldo
 * é positivo ou negativo. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numeroDaConta;
		double saldoInicial;
		double debito;
		double credito;
		double saldoAtual;

		System.out.print("Digite o número da sua conta: ");
		numeroDaConta = entrada.nextInt();

		System.out.print("Digite o seu saldo bancário atual: R$ ");
		saldoInicial = entrada.nextDouble();

		System.out.print("Digite o valor total de débitos (saídas): R$ ");
		debito = entrada.nextDouble();

		System.out.print("Digite o valor total de créditos (entradas): R$ ");
		credito = entrada.nextDouble();

		saldoAtual = saldoInicial - debito + credito;

		System.out.printf("\nO saldo atual da conta %d é: R$ %.2f\n", numeroDaConta, saldoAtual);

		if (saldoAtual >= 0) {
			System.out.println("Status: Saldo positivo");
		} else {
			System.out.println("Status: Saldo negativo");
		}

		entrada.close();
	}
}