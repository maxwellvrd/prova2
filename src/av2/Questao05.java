package av2;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[]args) {
		Double valor;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		valor = scan.nextDouble();
		scan.close();
		for(int i = 1; i <= 10; i++) {
			System.out.println(valor + " + " + i + " = " + (valor + i));
		}
		System.out.println("");
		for(int i = 1; i <= 10; i++) {
			System.out.println(valor + " - " + i + " = " + (valor - i));
		}
		System.out.println("");
		for(int i = 1; i <= 10; i++) {
			System.out.println(valor + " * " + i + " = " + (valor * i));
		}
		System.out.println("");
		for(int i = 1; i <= 10; i++) {
			System.out.println(valor + " / " + i + " = " + (valor / i));
		}
		
	}
}
