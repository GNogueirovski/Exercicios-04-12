package laco_for;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num,par = 0, impar = 0;
		Scanner leia = new Scanner(System.in);
		// For para definir contador dos números e mostrar as 10 inserções.
		for (int contador = 1 ; contador < 11; contador ++) {
			System.out.printf("\nDigite o %dº número: ", contador);
			num = leia.nextInt();
		// if checando se o número é par e armazenando no contador par iniciado	
		if (num % 2 == 0 ) {
			par++;
				}
		// if checando se o número é impar e armazenando no contador par iniciado	
		if (num % 2 == 1 ) {
			impar++;
				}

		}
		// Impressão dos contadores com os números totais impares e pares
		System.out.printf("\nTotal de números pares: %d\n", par);
		System.out.printf("\nTotal de números ímpares: %d", impar);
	

		
		//close scanner
		leia.close();
		}
}
