package lista5;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double precoEtiqueta, precoTotal;
		int opcaoPgt;
		
		System.out.println("Digite o pre�o de etiqueta:_ ");
		precoEtiqueta = leia.nextDouble();
		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("[1] - � vista em dinheiro ou cheque (20% de desconto);");
		System.out.println("[2] - � vista no cart�o de cr�dito (15% de desconto);");
		System.out.println("[3] - Duas vezes (sem juros);");
		System.out.println("[4] - Tr�s vezes (juros de 10%); ");
		opcaoPgt = leia.nextInt();
		
		if(opcaoPgt == 1) {
			precoTotal = precoEtiqueta-(precoEtiqueta*0.2);
			System.out.println("O pre�o a ser pago ser� de: R$" + precoTotal);
		} else if(opcaoPgt == 2) {
			precoTotal = precoEtiqueta - (precoEtiqueta*0.15);
			System.out.println("O pre�o a ser pago ser� de: R$" + precoTotal);
		} else if(opcaoPgt == 3) {
			precoTotal = precoEtiqueta/2;
			System.out.println("O pre�o a ser pago em cada parcela ser� de: R$" + precoTotal);
		} else if(opcaoPgt == 4) {
			precoTotal = (precoEtiqueta + (precoEtiqueta*0.1))/3;
			System.out.printf("O pre�o a ser pago em cada parcela ser� de: R$%.2f", precoTotal);
		} else {
			System.out.println("op��o inv�lida!");
		}
		
	}

}
