import java.util.Scanner;

public class ProgramaArrayImparPar {

	public static void main(String[] args) {	
		Integer cont = 0 ;
		Scanner entrada = new Scanner(System.in);
		Integer[] arrayNumeros = new Integer[20];

		while(cont<arrayNumeros.length) {
			System.out.print("Introduza o " + cont + "º número:");
			arrayNumeros[cont] = entrada.nextInt();
			System.out.println("\n");
			cont++;
		}
		
		System.out.print("Números pares do array:");
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			if(arrayNumeros[i]%2==0) {
				System.out.print(arrayNumeros[i] + " - ");
			}
		}

	}

}
