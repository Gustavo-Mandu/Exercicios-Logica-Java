package faccat;

import java.util.Scanner;

/**
 * Descrição: Recebe a idade de uma pessoa em anos, meses e dias e calcula o
 * total de dias vividos. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio07 {

	public static void main(String[] args) {
		int anos;
		int meses;
		int dias;
		int idadeEmDias;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual sua idade em anos completos?: ");
		anos = entrada.nextInt();

		System.out.println("E quantos meses completos já se passaram desde seu último aniversário?: ");
		meses = entrada.nextInt();

		System.out.println("E quantos dias se passaram desde o início deste mês?: ");
		dias = entrada.nextInt();

		idadeEmDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("-----------------------------------------");
		System.out.println("Sua idade total em dias é: " + idadeEmDias);

		entrada.close();
	}
}