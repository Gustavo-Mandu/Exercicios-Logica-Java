package manzano;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Descrição: Lê 15 valores e apresenta o total do somatório da fatorial de cada
 * valor lido. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_2_1E {

	public static BigInteger calcularFatorial(int n) {
		if (n < 0) {
			return BigInteger.ZERO;
		}
		BigInteger resultado = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			resultado = resultado.multiply(BigInteger.valueOf(i));
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		BigInteger somaTotalDosFatoriais = BigInteger.ZERO;

		for (int i = 1; i <= 15; i++) {
			System.out.printf("Digite o %dº valor de 15: ", i);
			int valor = entrada.nextInt();

			BigInteger fatorialDoValor = calcularFatorial(valor);
			System.out.println("O fatorial de " + valor + " é " + fatorialDoValor);

			somaTotalDosFatoriais = somaTotalDosFatoriais.add(fatorialDoValor);
		}

		System.out.println("\nO somatório de todos os fatoriais é: " + somaTotalDosFatoriais);
		entrada.close();
	}
}