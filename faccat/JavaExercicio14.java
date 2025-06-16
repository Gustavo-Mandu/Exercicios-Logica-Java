package faccat;

import java.util.Scanner;

/**
 * Descrição: Solicita um valor e verifica se ele é maior, menor ou igual a 10.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor;

		System.out.println("Bem-vindo!");
		System.out.print("Digite um valor inteiro: ");
		valor = entrada.nextInt();

		if (valor > 10) {
			System.out.println("Este valor é maior que 10!");
		} else if (valor == 10) {
			System.out.println("Esse valor é igual a 10!");
		} else {
			System.out.println("Esse valor é menor que 10!");
		}

		entrada.close();
	}
}