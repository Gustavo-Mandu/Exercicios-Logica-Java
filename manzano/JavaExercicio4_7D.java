package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Sistema de notas com aprovação direta ou por exame. Autor: Gustavo
 * Mandu Ferreira Matori
 */
public class JavaExercicio4_7D {

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

		System.out.printf("\nMédia parcial: %.1f\n", media);

		if (media >= 7.0) {
			System.out.println("Situação: ALUNO APROVADO!");
		} else {
			System.out.println("O aluno ficou em exame.");
			System.out.print("Digite a nota do exame: ");
			double notaExame = entrada.nextDouble();

			double novaMedia = (media + notaExame) / 2.0;

			System.out.printf("Nova média (com exame): %.1f\n", novaMedia);

			if (novaMedia >= 5.0) {
				System.out.println("Situação: ALUNO APROVADO EM EXAME!");
			} else {
				System.out.println("Situação: ALUNO REPROVADO.");
			}
		}

		entrada.close();
	}
}