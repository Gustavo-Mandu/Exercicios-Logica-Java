package faccat;

import java.util.Scanner;

/**
 * Descrição: Recebe um valor e mostra seu antecessor. Autor: Gustavo Mandu
 * Ferreira Matori
 */
public class JavaExercicio05 {

	public static void main(String[] args) {
		int numero;
		int antecessor;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha um número do seu teclado e digite logo abaixo");
		System.out.print("Digite um número: ");
		numero = entrada.nextInt();

		antecessor = numero - 1;

		System.out.println("Número antecessor: " + antecessor);

		entrada.close();
	}
}