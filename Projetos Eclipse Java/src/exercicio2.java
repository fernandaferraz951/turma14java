import java.util.Scanner; 
public class exercicio2 {
	public static void main(String[] args) 
	{Scanner leia = new Scanner (System.in);
	int tempoDias;
	System.out.println ("Digite o tempo em dias");
	tempoDias=leia.nextInt();
	System.out.println("Anos(s): " + (tempoDias/365) + "  " + " Mes(es): " +((tempoDias%365)/30) + " e "+  ((tempoDias% 365)% 30) + "7 dia (s): ");
	}
	
	
		 
		 
	
	
	
	
	
	
	
	
	
}

