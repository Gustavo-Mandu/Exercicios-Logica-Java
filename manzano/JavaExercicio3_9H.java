package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Elabora um programa que calcule e apresente o volume de uma caixa
 * retangular. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9H {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double comprimento, largura, altura, volume;

		System.out.print("Digite o comprimento (cm): ");
		comprimento = entrada.nextDouble();

		System.out.print("Digite a largura (cm): ");
		largura = entrada.nextDouble();

		System.out.print("Digite a altura (cm): ");
		altura = entrada.nextDouble();

		volume = comprimento * largura * altura;

		System.out.printf("\nO volume da caixa é: %.2f cm³\n", volume);

		entrada.close();
	}
}