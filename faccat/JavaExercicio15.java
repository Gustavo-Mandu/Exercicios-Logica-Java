package faccat;

import java.util.Scanner;

/**
 * Descrição: Solicita um valor para o usuário e verifica se é positivo ou
 * negativo (considerando zero como positivo). Autor: Gustavo Mandu Ferreira
 * Matori
 */
public class JavaExercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor;

		System.out.print("Digite um valor inteiro: ");
		valor = entrada.nextInt();

		if (valor >= 0) {
			System.out.println("Este valor (" + valor + ") é positivo!");
		} else {
			System.out.println("Este valor (" + valor + ") é negativo!");
		}

		entrada.close();
	}
}