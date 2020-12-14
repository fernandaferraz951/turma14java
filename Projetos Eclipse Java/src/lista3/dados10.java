package lista3;
import java.util.Scanner;
public class dados10 {
	public static void main (String[] args) {
		Scanner leia =new Scanner (System.in);
		final int vezes=10;
		double media =-0;
		double total=0;
		int lancamentos[] =new int [vezes];
		
		for (int x=0 ; x<vezes; x++) 
		{
			System.out.println("Digite um valor de 1-6 ");
			lancamentos[x]=leia.nextInt();
			total = lancamentos [x] + total;
		} media = total /vezes;
		System.out.println("Média " +media);
		
	}

}
