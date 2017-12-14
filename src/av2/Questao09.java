package av2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();

		int numero;
		double soma = 0;

		try (Scanner scan = new Scanner(System.in)) {
			for (;;) {
				System.out.print("Informe um número ou -1 para parar: ");

				numero = scan.nextInt();

				if (numero == -1) {
					break;
				}

				numeros.add(numero);

				soma += numero;
			}

			System.out.println("\nSoma" + soma);

			System.out.println("\nMedia: " + soma / numeros.size());

		}

	}

}
