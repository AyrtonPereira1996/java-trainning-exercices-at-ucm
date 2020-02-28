import java.util.Scanner;

public class CalculoNotas {

	public static void main(String[] args) {
		int cont = 0;
		String resultado = "";
		double nota1, nota2, media;
		Scanner entrada = new Scanner(System.in);

		String[] nomeEstudantes = new String[2];
		Double[] mediaEstudantes = new Double[2];
		String[] resultadoMedias = new String[2];

		while (cont < nomeEstudantes.length) {
			System.out.println("Introduza o nome de usuario");
			nomeEstudantes[cont] = entrada.next();

			System.out.println("Introduza a primera nota");
			nota1 = entrada.nextDouble();
			System.out.println("Introduza a segunda nota");
			nota2 = entrada.nextDouble();
			media = (nota1 + nota2) / 2;
			if(media<10) {
				resultadoMedias[cont] = "Reprovado";
			}else if(media>=10) {
				resultadoMedias[cont] = "Aprovado";
			}
			
			mediaEstudantes[cont] = media;
			cont++;
		}
		
		for (int i = 0; i < nomeEstudantes.length; i++) {
			System.out.print(" [Estudante " + i + "] - " + nomeEstudantes[i] + ", Media " + mediaEstudantes[i] + " ("+ resultadoMedias[i] + ") ");
		}
		System.exit(0);

	}

}
