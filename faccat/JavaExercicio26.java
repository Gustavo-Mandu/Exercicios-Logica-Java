package faccat;

import java.util.Scanner;

/**
 * Descrição: Calcula o estoque médio de um produto e determina se é necessário
 * efetuar uma nova compra. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int estoqueAtual;
		int estoqueMaximo;
		int estoqueMinimo;
		double quantidadeMedia;

		System.out.print("Digite a quantidade atual em estoque do produto: ");
		estoqueAtual = entrada.nextInt();

		System.out.print("Digite a quantidade máxima do estoque: ");
		estoqueMaximo = entrada.nextInt();

		System.out.print("Digite a quantidade mínima do estoque: ");
		estoqueMinimo = entrada.nextInt();

		quantidadeMedia = (estoqueMaximo + estoqueMinimo) / 2.0;

		System.out.println("\nA quantidade média do estoque é: " + quantidadeMedia);
		System.out.println("----------------------------------------");

		if (estoqueAtual >= quantidadeMedia) {
			System.out.println("Resultado: NÃO EFETUAR A COMPRA");
		} else {
			System.out.println("Resultado: EFETUAR A COMPRA");
		}

		entrada.close();
	}
}