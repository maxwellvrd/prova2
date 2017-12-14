package av2;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num = 0;
			int n = 0;
			int n3 = 0;
			int n11 = 0;
			int n15 = 0;
			for (;;) {
				System.out.print("Digite um número ou 0 para parar: ");
				num = scan.nextInt();
				if (num == 0) {
					break;
				}
				if (num >= 100 && num <= 2000) {
					n++;
				}
				if (num % 3 == 0) {
					n3++;
				}
				if (num % 11 == 0) {
					n11++;
				}
				if (num % 15 == 0) {
					n15++;
				}
			}
			System.out.println("Dos valores digitados: " + n + " deles estão entre 100 e 2000");
			System.out.println("Dos valores digitados: " + n3 + " são divisiveis por 3");
			System.out.println("Dos valores digitados: " + n11 + " são divisiveis por 11");
			System.out.println("Dos valores digitados: " + n15 + " são divisiveis por 15");
		}
	}
}
