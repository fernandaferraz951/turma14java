package lista5;
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int MAXIMO = 3;
		int vetor[] = new int[MAXIMO], matriz[][] = new int[MAXIMO][MAXIMO];

		for (int i = 0; i < MAXIMO; i++) {
			System.out.println("Digite o [" + (i + 1) + "] elemento do vetor: ");
			vetor[i] = leia.nextInt();
		}

		for (int i = 0; i < MAXIMO; i++) {
			for (int j = 0; j < MAXIMO; j++) {
				System.out.println("Digite o [" + (i + 1) + "][" + (j + 1) + "] elemento da matriz: ");
				matriz[i][j] = leia.nextInt();
			}
		}

		System.out.println(" Vetor digitado");
		for (int i = 0; i < MAXIMO; i++) {
			System.out.println((vetor[i]) + "\t");
		}
		System.out.println(" Matriz digitada");
		for (int i = 0; i < MAXIMO; i++) {
			for (int j = 0; j < MAXIMO; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < MAXIMO; i++) {
			for (int j = 0; j < MAXIMO; j++) {
				matriz[i][j] = vetor[i] * matriz[i][j];
			}
		}
		System.out.println(" Matriz final");
		for (int i = 0; i < MAXIMO; i++) {
			for (int j = 0; j < MAXIMO; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		leia.close();
	}
}
