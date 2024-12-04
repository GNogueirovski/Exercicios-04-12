package laco_dowhile;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int numero = 0, total = 0;
		float media = 0, somanum = 0;
		Scanner leia = new Scanner(System.in);

		do { // Bloco de código

			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();

			// if para acrescentar condicional de número multiplo de tres, adicionar os numeros dentro de soma num e somar no contador total
			if (numero % 3 == 0 && numero != 0) {
				somanum = numero + somanum;
				total++;
			}
			;

		} while (numero != 0); // condição limite para repetir
		//calculo da média com somanum vindo do if e total de respostas.
		media = somanum / total;
		System.out.printf("A média de todos os números múltiplos de 3 é:  %.2f\n", media);
		
		//close scanner
		leia.close();

	}

}
