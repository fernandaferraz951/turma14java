package Lista4;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 Random numeroRandomico = new Random(); //objeto
		 final int VEZES=10;
		 double media=0;
		 double total=0;
		 int lancamentos[] = new int[VEZES];
		
		 for (int x = 0 ; x<VEZES; x++)
		 {
			
			 lancamentos[x]=numeroRandomico.nextInt(6)+1;
			 System.out.printf("Lancamento %d é igual %d\n", (x+1), lancamentos[x]);
			 total = lancamentos[x]+ total;
			
			 System.out.printf("Valor no random %.0f\n", Math.random()*6);
		 }
		
		 media = total / VEZES;
		
		 System.out.printf("Média %.2f",media);
		
		
		
	}
}
