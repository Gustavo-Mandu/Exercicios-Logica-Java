package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula a área total de uma residência, somando a área de
 * múltiplos cômodos informados pelo usuário. Autor: Gustavo Mandu Ferreira
 * Matori
 */
public class JavaExercicio5_1_1K {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double areaTotal = 0;
		String resposta;

		do {
			System.out.print("\nDigite o nome do cômodo: ");
			String nomeComodo = entrada.next();

			System.out.print("Digite a largura do cômodo (m): ");
			double largura = entrada.nextDouble();

			System.out.print("Digite o comprimento do cômodo (m): ");
			double comprimento = entrada.nextDouble();

			double areaComodo = largura * comprimento;
			areaTotal += areaComodo;

			System.out.printf("Área do(a) %s: %.2f m².\n", nomeComodo, areaComodo);

			System.out.print("Deseja calcular outro cômodo? (SIM/NAO): ");
			resposta = entrada.next();

		} while (resposta.equalsIgnoreCase("SIM"));

		System.out.println("\n-------------------------------------");
		System.out.printf("A ÁREA TOTAL DA RESIDÊNCIA É: %.2f m²\n", areaTotal);

		entrada.close();
	}
}