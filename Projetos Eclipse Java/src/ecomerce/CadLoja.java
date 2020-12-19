package ecomerce;
import java.util.Scanner;
public class CadLoja {
	public static void main(String[] args)
	{
		//variveis
		Scanner leia = new Scanner(System.in);
		String codigos[] = new String[10];
		String produtos[]  = {"Kong\r\n" +"Guia Azul\r\n" + "Guia Rosa\r\n" + "Comedouro com peso\r\n" + "Bolinha\r\n"
		+ "Caixa de areia\r\n" + "Roupinha de natal\r\n" + "Casco de boi\r\n" + "Comedouro interativo\r\n" + "Cama com colchão"};
		double precoUnitarios[]= {23,12,18,20,2,10,45,15,12,40};
		int estoque[] = new int[10];

		linhaDetalhe();
		System.out.println("Vira-Latas");
		System.out.println("O pet shop do seu melhor amigo");
		linhaDetalhe();
		System.out.println();
		// menu inicial
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		System.out.print("DIGITE A OPÇÃO: ");
		char opcaoMenu = leia.next().charAt(0);
		switch (opcaoMenu)
		{
			case '1':
			{
				System.out.print("Por favor informe o seu nome: ");
				String nomeCliente = leia.next().toUpperCase();
				System.out.print("Você de define como M-masculino, F-feminino ou O-outro :");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("Seja bem-vind%s loja %s!!!",voltaGenero(generoCliente),nomeCliente);
							
				break;
				
			}
			case '2':
			{
				System.out.println("WIP");  // work in progress
				break;
			}
			case '3':
			{
				System.out.println("Volte sempre, adoramos sua visita!!!");
				break;
			}
				
		}
		
		
	}
	
	
	public static void linhaDetalhe() {
		System.out.println("═══════════════════════════════════════════════════════");
		
	}
	
	public static String voltaGenero(char generoCliente) {
		
		String tipo;
		if (generoCliente == 'M')
		{
			tipo = "o";
		}
		else if (generoCliente == 'F')
		{
			tipo = "a";
		}
		else if (generoCliente == 'O')
		{
			tipo = "x";
		}
		else
		{
			tipo = "*";
		}
			
		
		return tipo;
	
	}
	
}