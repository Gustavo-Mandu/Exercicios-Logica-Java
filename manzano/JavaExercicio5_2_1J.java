package manzano;

import java.util.Scanner;

/**
 * Descrição: Apresenta o resultado inteiro da divisão de dois números
 * utilizando subtrações sucessivas. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio5_2_1J {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int dividendo, divisor, quociente = 0;

		System.out.print("Digite o dividendo (inteiro): ");
		dividendo = entrada.nextInt();

		System.out.print("Digite o divisor (inteiro diferente de zero): ");
		divisor = entrada.nextInt();

		if (divisor == 0) {
			System.out.println("Erro: Divisão por zero não é permitida.");
		} else {
			int dividendoAbs = Math.abs(dividendo);
			int divisorAbs = Math.abs(divisor);

			while (dividendoAbs >= divisorAbs) {
				dividendoAbs -= divisorAbs;
				quociente++;
			}

			if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
				quociente = -quociente;
			}

			System.out.println("\nO quociente da divisão é: " + quociente);
		}

		entrada.close();
	}
}
