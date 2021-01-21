package Lista4;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		final int TAMANHO = 5;
		double notas[] = new double[TAMANHO], maiorNota = -99.0;

		for (int i = 0; i < TAMANHO; i++) {
			System.out.println("\nDigite a " + (i + 1) + " nota:");
			notas[i] = leia.nextDouble();
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
		}
		System.out.println("Notas:\n");

		for (int i = 0; i < TAMANHO; i++) {
			System.out.println(notas[i] + "\n");
		}
		System.out.println("A maior nota foi: " + maiorNota);
		leia.close();
	}


		
		

	}


