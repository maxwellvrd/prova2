package av2;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		int ladoa, ladob, ladoc, ladod;
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Descubra se o quadrado � perfeito ou n�o G.G");
			System.out.println("Digite o primeiro lado do quadrado: ");
			ladoa = scan.nextInt();
			System.out.print("Digite o segundo lado do quadrado: ");
			ladob = scan.nextInt();
			System.out.print("Digite o terceiro lado do quadrado: ");
			ladoc = scan.nextInt();
			System.out.print("Digite o quarto lado do quadrado: ");
			ladod = scan.nextInt();
			if((ladoa == ladob)&&(ladoa == ladoc)&&(ladoa == ladod)){
				System.out.println("� um quadrado perfeito");
			}else {
				System.out.println("N�o � um quadrado perfeito");
			}
		}
		
	}
}