package Lista2;
import java.util.Scanner;
public class Exercicio2 {
	public static void main (String Args[]) {
	 
	 Scanner leia = new Scanner (System.in);
	 
	 int num;
	 
	 System.out.println("Digite um n�mero: ");
	 num=leia.nextInt();
	 
	 if (num > 0) {
	 if (num% 2 ==0) {
		 System.out.println("O n�mero � par e positivo");}
	 
		 else {
			 System.out.println("O n�mero � impar e positivo");
			 
			 
		 }
	 
	 
	 }
	 if (num <0) {
		 if (num% 2!=0) {
			 System.out.println("O n�mero � negativo e impar");
			 
		 }
	 }
	 
	 if (num <0) {
		 if(num%2==0) {
			 System.out.println("O n�mero � negativo e par");
		 }
	 }
	 
	 
	 
	 
	
	
	

}
}
