package lista5;
import java.util.Scanner;
public class Exercicio3 {
	

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			double num;
			int cont1=0, cont2=0, cont3=0, cont4=0;
			
			
			do {
				System.out.println("Digite um número: ");
				System.out.println("(Para parar o programa, digite um número negativo)");
				num = leia.nextDouble();
				
				if(num>=0 && num<=25) {
					cont1++;
				} else if(num>=26 && num<=50) {
					cont2++;
				} else if(num >=51 && num <= 75) {
					cont3++;
				} else if(num>=76 && num<=100) {
					cont4++;
				}
			}while(num>=0);
			
			System.out.printf("\nA quantidade de número entre 0 e 25 foi: %d", cont1);
			System.out.printf("\nA quantidade de número entre 26 e 50 foi: %d", cont2);
			System.out.printf("\nA quantidade de número entre 51 e 75 foi: %d", cont3);
			System.out.printf("\nA quantidade de número entre 76 e 100 foi: %d", cont4);
		}
		
	}


