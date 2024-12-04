package laco_while;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int idade, identidade, desenvolvedor, mulheresf = 0, devback = 0, homensmobile = 0, naobifs = 0, total = 0;
		float media = 0, somaidade = 0;
		String continua = "s";
		Scanner leia = new Scanner(System.in);

		// Estrutura while com menu para opções de cadastro e condicional de continuar

		while (!continua.equals("n")) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			System.out.println("Digite como você se identifica: ");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			identidade = leia.nextInt();

			System.out.println("Digite em qual área você é uma pessoa desenvolvedora: ");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - Fullstack");
			desenvolvedor = leia.nextInt();

			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\nVocê gostaria de continuar (s/n) ");
			continua = leia.next();
			
			// contador para total de respostas
			total ++;
			
			// somando idade a variavel somaidade e depois calculo da media
			somaidade = somaidade + idade;
			media = somaidade / total;
			
			// if e elseif testando condições das variáveis id, dev e idade para adicionar aos contadores
			if (desenvolvedor == 1) {
				devback++;
			} else if ((identidade == 1 || identidade == 4) && desenvolvedor == 2) {
				mulheresf++;
			} else if ((identidade == 2 || identidade == 5) && desenvolvedor == 3 && idade >= 40) {
				homensmobile++;
			} else if ( identidade == 3 && desenvolvedor == 4 && idade >= 30) {
				naobifs++;
			} 

		}

		// print dos contadores
		System.out.printf("Total de pessoas desenvolvedoras Backend:  %d\n", devback);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend %d\n", mulheresf);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n", homensmobile);
		System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d\n", naobifs);
		System.out.printf("O número total de pessoas que responderam a pesquisa %d\n", total);
		System.out.printf("A média de idade das pessoas que responderam a pesquisa %.1f\n", media);

		//close scanner
		leia.close();
	}

}
