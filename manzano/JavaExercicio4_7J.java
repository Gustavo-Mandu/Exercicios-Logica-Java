package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Verifica se um valor está dentro da faixa permitida (1 a 9).
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7J {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor;

		System.out.print("Digite um valor de 1 a 9: ");
		valor = entrada.nextDouble();

		if (valor >= 1 && valor <= 9) {
			System.out.println("O valor está na faixa permitida.");
		} else {
			System.out.println("O valor está fora da faixa permitida.");
		}

		entrada.close();
	}
}