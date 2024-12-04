package laco_while;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade = 0, menor = 0, maior = 0;
		Scanner leia = new Scanner(System.in);
		// Estrutura while condicionando a variavel idade a 0 para iniciar
		while (idade >= 0) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			// if para adicionar a idade ao contador se for menor que 21 e maior que 0
			if (idade <= 21 && idade > 0) {
				menor++;
			}
			// if para adicionar a idade ao contador se for maior que 50

			if (idade >= 50) {
				maior++;
			}
		}
		// print dos contadores
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d\n", menor);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maior);

		//close scanner
		leia.close();
	}

}
