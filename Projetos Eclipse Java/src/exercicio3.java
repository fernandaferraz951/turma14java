import java.util.Scanner; 
public class exercicio3 {
	public static void main(String[] args)
	{ Scanner leia = new Scanner (System.in);
	int tempoSegundos, horas, minutos, segundos;
	
	System.out.println("Digite o tempo em segundos: "); 
	tempoSegundos=leia.nextInt(); 
	horas= tempoSegundos/3600;
			System.out.println("Hora(s): " + (horas));
			
			minutos=((tempoSegundos %3600) /60);
			System.out.println("Minuto(s): " + (minutos));
			
			segundos = ((tempoSegundos % 3600) % 60);
			System.out.println("Segundos: " + (segundos));
			
			
	

}

}