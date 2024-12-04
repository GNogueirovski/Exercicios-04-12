package laco_for;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner leia = new Scanner(System.in);
		// Entrada do intervalo de números
		System.out.println("\nDigite o primeiro número do intervalo");
		num1 = leia.nextInt();

		System.out.println("\nDigite o ultimo número do intervalo ");
		num2 = leia.nextInt();
		// Invalida intervalos com o segundo número maior que o primeiro.
		if (num2 <= num1) {
			System.out.println("\nIntervalo é inválido");
		}

		System.out.printf("No intervalo entre %d e %d\n", num1, num2);
		// FOR com variavel interna colocando o inicio do contador como num1 e o final como num2.
		for (int contador = num1; contador <= num2; contador++) {
			// IF testando os números do intervalo se o resto de 3 ou 5 da = 0 e depois printando.
			if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.printf("%d é multiplo de 3 e 5\n", contador);
			}

		}
		//close scanner
		leia.close();
	}

}
