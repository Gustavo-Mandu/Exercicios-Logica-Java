package manzano;

import java.util.Locale;
import java.util.Scanner;

/**
 * Descrição: Calcula a distância percorrida e os litros de combustível gastos
 * em uma viagem. Autor: Gustavo Mandu Ferreira Matori
 */
public class JavaExercicio3_9D {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double tempoGasto;
		double velocidadeMedia;
		double distancia;
		double litrosUsados;
		final double KILOMETROS_POR_LITRO = 12.0;

		System.out.print("Digite o tempo gasto na viagem (em horas): ");
		tempoGasto = entrada.nextDouble();

		System.out.print("Digite a velocidade média da viagem (em km/h): ");
		velocidadeMedia = entrada.nextDouble();

		distancia = tempoGasto * velocidadeMedia;
		litrosUsados = distancia / KILOMETROS_POR_LITRO;

		System.out.println("\n--- Resumo da Viagem ---");
		System.out.printf("Velocidade média: %.1f km/h\n", velocidadeMedia);
		System.out.printf("Tempo gasto: %.1f horas\n", tempoGasto);
		System.out.printf("Distância percorrida: %.2f km\n", distancia);
		System.out.printf("Combustível utilizado: %.2f L\n", litrosUsados);

		entrada.close();
	}
}