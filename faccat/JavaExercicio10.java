package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Solicita o valor de um carro, calcula impostos e a porcentagem do
 * distribuidor para chegar ao valor final. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double custoDeFabrica;
		double valorFinal;

		System.out.println("Bem-vindo, iremos descobrir o valor final de seu carro!");
		System.out.print("Digite o custo de fábrica do carro: R$ ");
		custoDeFabrica = entrada.nextDouble();

		double impostos = custoDeFabrica * 0.45;
		double porcentagemDistribuidor = custoDeFabrica * 0.28;
		valorFinal = custoDeFabrica + impostos + porcentagemDistribuidor;

		System.out.printf("O valor total do carro para o consumidor é de: R$ %.2f\n", valorFinal);

		entrada.close();
	}
}