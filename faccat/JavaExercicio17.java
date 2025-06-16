package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Recebe duas notas, calcula a média e informa se o aluno foi
 * aprovado. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double nota1;
		double nota2;
		double media;

		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = entrada.nextDouble();

		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = entrada.nextDouble();

		media = (nota1 + nota2) / 2.0;

		if (media >= 6.0) {
			System.out.printf("Aluno APROVADO com média: %.1f!\n", media);
		} else {
			System.out.printf("Aluno REPROVADO com média: %.1f.\n", media);
		}

		entrada.close();
	}
}