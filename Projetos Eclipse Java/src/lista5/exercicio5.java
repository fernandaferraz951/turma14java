package lista5;
import java.util.Scanner;
import java.util.Random;

public class exercicio5 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int vetor[] = new int[5];
		int codigo=0;
		
		System.out.print("Vetor = ");
		for(int i=0; i<5; i++) {
			vetor[i] = random.nextInt(10);
			System.out.print("|" + vetor[i] + "|");
		}
		
		codigo = random.nextInt(4);
		System.out.println("\nCódigo = " + codigo);

		if(codigo == 0) {
			System.out.println("\nFim do programa!");
			
		} else if(codigo == 1) {
			for(int i=0; i<5; i++) {
				System.out.print("|" + vetor[i] + "|");
			}
		} else if(codigo == 2) {
			for(int i=4; i>=0; i--) {
				System.out.print("|" + vetor[i] + "|");
			}
		} else {
			System.out.println("código inválido!");
		}
		
	}
}


