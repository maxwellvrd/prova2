package av2;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questao10 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		String num;
		int n1;
		try (Scanner scan = new Scanner(System.in)) {
			int n = aleatorio.nextInt(999);

			JOptionPane.showMessageDialog(null, "|:-:|    Bem vindo ao jogo da adivinha��o     |:-:|");
			JOptionPane.showMessageDialog(null, "Tente adivinhar qual n�mero o computador escolheu x.x");
			for (;;) {
				num = JOptionPane.showInputDialog("Digite sua resposta: ");
				n1 = Integer.parseInt(num);
				if (n1 == n) {
					JOptionPane.showMessageDialog(null,"Parab�ns voc� acertou *-* \n O n�mero que o computador escolheu foi o: " + n);
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Tente novamente o n�mero est� entre :" + (n - 3) + " e " + (n + 3));
				}
			}
		}
	}
}




