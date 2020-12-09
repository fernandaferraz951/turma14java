package Lista2;
import java.util.Scanner;

public class exerciciodois {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);	
	
	
	int c;
	int N=0;
	double E=0;
	double salarioTotal=0.0, salarioExcedente=0.0, salarioBase = 500.00;
	
	double valorNormal = 10.00;
	double valorHoraexcedente = 10.00;
	double limiteHoras = 50.00;
	
	System.out.println("Digite o Código do funcionário: ");
	c=leia.nextInt();
	
	System.out.println("Digite a Quantidade de horas Trabalhadas: ");
	N=leia.nextInt();
	
	if (N <= limiteHoras) {
		salarioBase =(N*valorNormal);
		salarioTotal =salarioBase;
	}
	
	else {
		 E = (N - limiteHoras);
		salarioTotal =(limiteHoras*valorNormal);
		salarioExcedente = E *valorHoraexcedente;
		salarioTotal = salarioTotal + valorHoraexcedente;
		
	}
	
	System.out.println("Quantidade de horas trabalhadas" + N);
	System.out.println("Quantidade horas excedentes: " + E);
	System.out.println("Salário Excedente: " + salarioExcedente);
	System.out.println("Salário Total :" + salarioTotal);
	
	
		
		

	}

}
