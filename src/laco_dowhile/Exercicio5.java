package laco_dowhile;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int numero,soma = 0;
		Scanner leia = new Scanner(System.in);

		do { // Bloco de código

			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();	
			
			// IF para acrescentar o número perguntado a soma
			if (numero > 0 ) {
				soma = numero + soma;
					}

		} while (numero != 0); // condição limite para repetir
		
		System.out.printf("A soma de todos os números positivos foi %d", soma);
		
		//close scanner
		leia.close();
	}

}
