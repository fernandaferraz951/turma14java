package Lista2;
import java.util.Scanner;
public class exercicio6 {
	public static void main (String Args[]) {
	
	Scanner leia = new Scanner (System.in);	
	int idade;
	
	System.out.println("Digite a idade do nadador:");
	idade=leia.nextInt();
	
	if (idade <=4) {
		System.out.println("Não pode entrar na piscina");}
	
		
	
		else if (idade ==5 || (idade <=7)){
		System.out.println("Infantil A");
		}
		else if(idade ==8 || (idade <=11)){
		System.out.println("Infantil B");
	}
	
		else if (idade ==12 || (idade <=13)) {
		System.out.println("Juvenil A");
	}
		else if(idade ==14 || (idade <=17)) {
		System.out.println("Juvenil B");
	}
	
		else if(idade >=18) {
		System.out.println("Maiores de 18 anos");
	}
	
	
}
}
	
