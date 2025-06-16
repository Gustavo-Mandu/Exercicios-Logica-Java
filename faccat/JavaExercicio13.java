package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Recebe três notas com pesos diferentes e calcula a média ponderada
 * final do aluno. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double mediaFinal;

		System.out.print("Digite o valor da 1ª nota do aluno (Peso 2): ");
		nota1 = entrada.nextDouble();

		System.out.print("Digite o valor da 2ª nota do aluno (Peso 3): ");
		nota2 = entrada.nextDouble();

		System.out.print("Digite o valor da 3ª nota do aluno (Peso 5): ");
		nota3 = entrada.nextDouble();

		mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10.0;

		System.out.printf("A média final do aluno é de: %.2f\n", mediaFinal);

		entrada.close();
	}
}