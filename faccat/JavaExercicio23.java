package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Recebe nome, altura e sexo de uma pessoa e calcula seu peso ideal.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio23 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		String nome;
		double altura;
		String sexo;
		double pesoIdeal;

		System.out.print("Digite o seu nome: ");
		nome = entrada.nextLine();

		System.out.print("Digite sua altura (ex: 1.75): ");
		altura = entrada.nextDouble();

		System.out.print("Digite seu sexo (M para Masculino / F para Feminino): ");
		sexo = entrada.next();

		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			pesoIdeal = (62.1 * altura) - 44.7;
		}

		System.out.printf("\nOlá, %s! Seu peso ideal é: %.2f kg\n", nome, pesoIdeal);

		entrada.close();
	}
}
