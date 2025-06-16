package manzano;

import java.util.Scanner;

/**
 * Descrição: Faz uma saudação formal a uma pessoa com base no nome e no sexo.
 * Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio4_7L {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		int sexo;

		System.out.print("Qual seu nome? ");
		nome = entrada.nextLine();

		System.out.println("Qual seu sexo? (Digite 1 para Masculino ou 2 para Feminino)");
		System.out.print("Opção: ");
		sexo = entrada.nextInt();

		if (sexo == 1) {
			System.out.println("\nIlmo Sr. " + nome);
		} else if (sexo == 2) {
			System.out.println("\nIlma Sra. " + nome);
		} else {
			System.out.println("\nOpção de sexo inválida.");
		}

		entrada.close();
	}
}