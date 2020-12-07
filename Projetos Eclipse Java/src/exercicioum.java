import java.util.Scanner;
public class exercicioum {
	 public static void main(String[] args) 
	 
	 {  Scanner leia = new Scanner (System.in); //instanciar = cria
		  
	 int ano, mes, dia;       
		System.out.println( "Iremos pedir sua idade em anos, mês e dias");   
		System.out.println("Digite sua idade em anos");  
		ano=leia.nextInt();
		System.out.println("Digite sua idade em meses");  
		mes=leia.nextInt();
		System.out.println("Digite sua idade em dias"); 
		dia=leia.nextInt();
		int calc = (ano * 365) + (mes * 30) + dia;
		System.out.print("Sua idade em dias é:" + (calc));
 }
}


