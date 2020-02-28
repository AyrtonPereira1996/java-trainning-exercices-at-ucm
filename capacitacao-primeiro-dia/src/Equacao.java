import java.util.Scanner;

import javax.swing.JOptionPane;

public class Equacao {

	public static void main(String[] args) {
		double y, b, a;
		String valorA = JOptionPane.showInputDialog("Introduz o valor de 'A'");
		String valorB = JOptionPane.showInputDialog("Introduz o valor de 'B'");
		a=Double.parseDouble(valorA);
		b=Double.parseDouble(valorA);
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("*****Inicio de programa***** \n");
//		System.out.println("Por favor introduza o valor de 'a'");
//		a = entrada.nextDouble();
//		System.out.println("Por favor introduza o valor de 'b'");
//		b = entrada.nextDouble();
		
		if (b != 0) {
			y = a / b;
			System.out.println("O valor de 'y' é igual a " + y);
		} else {
			System.out.println("O valor de b não pode ser igual a '0'");
		}
		System.out.println("*****Fim de programa*****");
		System.exit(0);
	}
}
