package manzano;

import java.math.BigInteger;

/**
 * Descrição: Calcula o somatório do número de grãos de trigo em um tabuleiro de
 * xadrez. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_2_1D {

	public static void main(String[] args) {
		BigInteger graosNaCasa = new BigInteger("1");
		BigInteger graosTotais = new BigInteger("0");

		System.out.println("--- Grãos de Trigo no Tabuleiro de Xadrez ---");

		for (int quadro = 1; quadro <= 64; quadro++) {
			graosTotais = graosTotais.add(graosNaCasa);
			System.out.println("Quadro " + quadro + ": " + graosNaCasa + " grãos.");

			graosNaCasa = graosNaCasa.multiply(BigInteger.valueOf(2));
		}

		System.out.println("\nTotal de grãos de trigo no tabuleiro: " + graosTotais);
	}
}