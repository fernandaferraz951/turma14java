package Lista2;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);	
		
		int n;
		
		System.out.println("Digite um n�mero: ");
		
		n=leia.nextInt();
		
		if (n >=100) {
			System.out.println("O n�mero que voc� digitou foi maior que 100, n�mero:" +n);
		}
		else {
			System.out.println("n�mero =0");
		}
		

	}

}
