package av2;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {

		int idade = 0;
		int corOlhos, corCabelo, sexo;
		float porcentagemFeminina;
		int contPorcentagem = 0;
		int maiorIdade = 0;
		int cont = 0;

		try (Scanner scan = new Scanner(System.in)) {

			for (;;) {
				
				System.out.println("Pesquisa sobre algumas características físicas da população ");
				
				System.out.println("Digite o seu sexo: \n 1- Masculino \n 2- Feminino ");
				sexo = scan.nextInt();
				System.out.println("Cor dos olhos: \n 1-Azuis \n 2-Verdes \n 3-Castanhos ");
				corOlhos = scan.nextInt();
				System.out.print("Cor dos cabelos: \n 1-Louros \n 2-Castanhos \n 3-Pretos ");
				corCabelo = scan.nextInt();
				System.out.println("Idade: ");
				idade = scan.nextInt();
				cont++;
				if ((sexo == 2) && (idade >= 18 && idade <= 35) && (corOlhos == 2) && (corCabelo == 1)) {
					contPorcentagem++;
				}
				if (idade > maiorIdade) {
					maiorIdade = idade;
				}
				if (idade == -1) {
					break;
				}
			}
			System.out.println("A maior idade dos habitantes é: " + maiorIdade);
			porcentagemFeminina = (100 * contPorcentagem)/cont;
			System.out.println("A porcentagem feminina com olhos verdes, cabelos louros  e que estão entre 18 e 35 anos é: "
					+ porcentagemFeminina);
		}
	}

}
