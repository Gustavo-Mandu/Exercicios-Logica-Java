package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Apresenta um valor lido somente se ele não for maior que 3. Autor:
 * Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7K {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double valor;

		System.out.print("Digite um valor: ");
		valor = entrada.nextDouble();

		System.out.println("Se o valor não for maior que 3, ele aparecerá abaixo:");

		if (valor <= 3) {
			System.out.println("Valor exibido: " + valor);
		}

		entrada.close();
	}
}