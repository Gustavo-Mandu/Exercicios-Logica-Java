package faccat;

import java.util.Scanner;

/**
 * Descrição: Lê a hora de início e término de uma partida de xadrez e calcula a
 * duração total do jogo. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int horaInicio;
		int horaTermino;
		int duracao;

		System.out.print("Digite a hora de início do jogo de xadrez (0-23): ");
		horaInicio = entrada.nextInt();

		System.out.print("Digite a hora de término do jogo de xadrez (0-23): ");
		horaTermino = entrada.nextInt();

		if (horaTermino > horaInicio) {
			duracao = horaTermino - horaInicio;
		} else {
			duracao = (24 - horaInicio) + horaTermino;
		}

		System.out.println("O jogo durou um total de " + duracao + " hora(s). ");

		entrada.close();
	}
}