import java.util.Scanner; 

public class fareheint2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double c, f;
		
		System.out.print(" Escreva a temperatura em celcius:");
		c=leia.nextInt(); 
		f= (c *1.8 +32);
		
		System.out.println ("A temperatura em Fareheint é: " + (f)) ;

		
		

	}

}
