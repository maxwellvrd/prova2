package av2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {

		List<Integer> equi = new ArrayList<Integer>();
		List<Integer> iso = new ArrayList<Integer>();
		List<Integer> esc = new ArrayList<Integer>();

		int ladoa;
		int ladob;
		int ladoc;

		try (Scanner scan = new Scanner(System.in)) {
			
			
			for (;;) {
				
				
				System.out.print("Informe o lado A do triangulo: ");
				ladoa = scan.nextInt();
				System.out.print("Informe o lado B do triangulo: ");
				ladob = scan.nextInt();
				System.out.print("Informe o lado C do triangulo: ");
				ladoc = scan.nextInt();
				
				if ((ladoa == 0 || ladob == 0) || (ladoc == 0)) {
					
					break;
				}
				
				if ((ladoa == ladob) && (ladoa == ladoc) && (ladob == ladoc)) {
					equi.add(ladoa);
					equi.add(ladob);
					equi.add(ladoc);
				}
				if ((ladoa != ladob) && (ladob != ladoc) && (ladoc != ladoa)) {
					esc.add(ladoa);
					esc.add(ladob);
					esc.add(ladoc);
				}
				if ((ladoa == ladob) && (ladoa != ladoc) || (ladob == ladoc) && (ladob != ladoa)
						|| (ladoc == ladoa) && (ladoc != ladob)) {
					iso.add(ladoa);
					iso.add(ladob);
					iso.add(ladoc);
				}
			}
				System.out.println("Existem :"+ equi.size()/3 + " triangulos equilateros.");
				System.out.println("Existem :"+ iso.size()/3 + " triangulos isosceles.");
				System.out.println("Existem :"+ esc.size()/3 + " triangulos escaleno.");
			
	
		}
	}
}
