package lista3;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);

	        int soma, numero;
	        soma=0;

	        System.out.println("N�mero para o somat�rio ");
	        numero = scan.nextInt();

	        do{
	        	soma = soma + numero;
	            numero--;
	        }
	        while(numero != 0);

	        System.out.println("O somat�rio � ");
	        System.out.println(soma);

	    }

	

	}

