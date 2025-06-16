package faccat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Solicita o número de maçãs compradas e calcula o valor total com
 * base em um preço diferenciado por quantidade. Autor: Gustavo Mandu Ferreira
 * Matori
 */
public class JavaExercicio16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int macasCompradas;
		double valorMaca;
		double totalCompra;

		System.out.print("Digite o número de maçãs que foram compradas: ");
		macasCompradas = entrada.nextInt();

		if (macasCompradas < 12) {
			valorMaca = 1.30;
		} else {
			valorMaca = 1.00;
		}

		totalCompra = valorMaca * macasCompradas;

		System.out.printf("O total da sua compra é de: R$ %.2f\n", totalCompra);

		entrada.close();
	}
}