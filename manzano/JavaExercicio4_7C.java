package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Lê quatro notas escolares, calcula a média e informa se o aluno
 * foi aprovado ou reprovado. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7C {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double nota1, nota2, nota3, nota4, media;

		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = entrada.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = entrada.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4.0;

		System.out.printf("\nMédia do aluno: %.1f\n", media);

		if (media >= 5.0) {
			System.out.println("Situação: ALUNO APROVADO!");
		} else {
			System.out.println("Situação: ALUNO REPROVADO.");
		}

		entrada.close();
	}
}