package av2;

public class Questao06 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i=1; i<=100 ;i++){
			System.out.print("\n" +i);
			if(i%7==0) {
				System.out.print(" É multiplo de 7!");
			}
		}
		for(int i = 1; i<= 100; i++) {
			if(i%2==0) {
				num1 = num1 + i;
			}
			else {
				num2 = num2 + i;
			}
		}
		System.out.println("\nA soma dos números pares é: "+num1);
		System.out.println("A soma dos números impares é: "+num2);
	}
}