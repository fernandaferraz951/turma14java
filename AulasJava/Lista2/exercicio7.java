package Lista2;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);	
		
		int base;
		int altura;
		int area;
		
		System.out.println("Digite a base do Triangulo: ");
		base=leia.nextInt();
		
		System.out.println("Digite a Altura do triangulo: ");
		altura=leia.nextInt();
		
		if (base>0 && (altura>0)) {
			area = (base*altura/2);
			System.out.println("A area do triangulo é:" + area);
			
		}
		else {
			System.out.println("Digite valores não negativos");
		}
		

	}

}
