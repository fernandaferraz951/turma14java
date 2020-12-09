package Lista2;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);	
		
		int n;
		
		System.out.println("Digite um número: ");
		
		n=leia.nextInt();
		
		if (n >=100) {
			System.out.println("O número que você digitou foi maior que 100, número:" +n);
		}
		else {
			System.out.println("número =0");
		}
		

	}

}
