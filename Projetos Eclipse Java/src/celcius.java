import java.util.Scanner; 

public class celcius {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double grausCelsius, fahreheint;
		System.out.print(" Escreva a temperatura em fareheint");
		fahreheint=leia.nextInt();
		grausCelsius = ( (fahreheint - 32) *0.5555555556);
		System.out.print("O grau fahrenheit em grausCelsius é " + (grausCelsius) + " c");

	}

}
