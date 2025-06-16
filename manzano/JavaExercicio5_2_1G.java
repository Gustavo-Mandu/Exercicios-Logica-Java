package manzano;

import java.math.BigInteger;

/**
 * Descrição: Apresenta o fatorial dos valores ímpares na faixa de 1 a 10.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_2_1G {

	public static BigInteger calcularFatorial(int n) {
		BigInteger resultado = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			resultado = resultado.multiply(BigInteger.valueOf(i));
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println("--- Fatorial dos Ímpares de 1 a 10 ---");

		for (int i = 1; i < 10; i += 2) {
			BigInteger fatorial = calcularFatorial(i);
			System.out.println("Fatorial de " + i + " é: " + fatorial);
		}
	}
}