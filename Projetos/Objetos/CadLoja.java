package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LojaExemplo.Produtos;

public class CadLoja {
	public static void main (String [] args) {
		Scanner leia =new Scanner (System.in);
		char opcao ='S';
		char continua ='S';
		char opc;
		int quantidade = 0;
		int escolhido =0 ;
		double preco=0;
		double total =0;
		String codigo;
		final int ESTOQUE=10;
		char op;
		
		
		List<Produtos> produtos = new ArrayList<>();
		produtos.add(new Produtos("C001", "Kong", 23.00, 10));
		produtos.add(new Produtos("C002", "Guia Azul", 12.00, 10));
		produtos.add(new Produtos("C003", "Guia Rosa", 13.00, 10));
		produtos.add(new Produtos("C004", "Comedouro com Peso", 20.00, 10));
		produtos.add(new Produtos("C005", "Bolinha", 2.00, 10));
		produtos.add(new Produtos("C006", "Caixa de Areia", 10.00, 10));
		produtos.add(new Produtos("C007", "Roupinha de natal tamanho G", 45.00, 10));
		produtos.add(new Produtos("C008", "Casco de boi", 12.00, 10));
		produtos.add(new Produtos("C009", "Cama com colchão", 35, 10));
		produtos.add(new Produtos("C010", "Comedouro interativo", 12.00, 10));

		
		
		
		
		
		
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("                                                             ,--,                                                  \r\n"
					+ "                                                ,---.'|                                                  \r\n"
					+ "                                                |   | :                  ___                             \r\n"
					+ "       ,---.  ,--,                              :   : |                ,--.'|_                           \r\n"
					+ "      /__./|,--.'|    __  ,-.                   |   ' :                |  | :,'                          \r\n"
					+ " ,---.;  ; ||  |,   ,' ,'/ /|                   ;   ; '                :  : ' :               .--.--.    \r\n"
					+ "/___/ \\  | |`--'_   '  | |' | ,--.--.           '   | |__   ,--.--.  .;__,'  /    ,--.--.    /  /    '   \r\n"
					+ "\\   ;  \\ ' |,' ,'|  |  |   ,'/       \\          |   | :.'| /       \\ |  |   |    /       \\  |  :  /`./   \r\n"
					+ " \\   \\  \\: |'  | |  '  :  / .--.  .-. |         '   :    ;.--.  .-. |:__,'| :   .--.  .-. | |  :  ;_     \r\n"
					+ "  ;   \\  ' .|  | :  |  | '   \\__\\/: . .         |   |  ./  \\__\\/: . .  '  : |__  \\__\\/: . .  \\  \\    `.  \r\n"
					+ "   \\   \\   ''  : |__;  : |   ,\" .--.; |         ;   : ;    ,\" .--.; |  |  | '.'| ,\" .--.; |   `----.   \\ \r\n"
					+ "    \\   `  ;|  | '.'|  , ;  /  /  ,.  |         |   ,/    /  /  ,.  |  ;  :    ;/  /  ,.  |  /  /`--'  / \r\n"
					+ "     :   \\ |;  :    ;---'  ;  :   .'   \\        '---'    ;  :   .'   \\ |  ,   /;  :   .'   \\'--'.     /  \r\n"
					+ "      '---\" |  ,   /       |  ,     .-./                 |  ,     .-./  ---`-' |  ,     .-./  `--'---'   \r\n"
					+ "             ---`-'         `--`---'                      `--`---'              `--`---'                 \r\n"
					+ "                                                                                                                       ");
			System.out.println("                                       O Pet do seu melhor amigo                                              ");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("	                                  [1] - COMPRAR PRODUTOS                                                  ");
			System.out.println("	                                  [2] - GERENCIAR ESTOQUE                                                 ");
			System.out.println("                                          [3] -   SAIR\n                                                  "); 
			System.out.println("                                         DIGITE A OPÇÃO:                                                      ");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			char tipo = leia.next().charAt(0);
			
			if (tipo=='1') {
				leia.nextLine();
				System.out.println("Nome do cliente");
				String nome = leia.nextLine().toUpperCase();
				System.out.println("Qual seu Genero? M-Masculino F- Feminino");
				char genero = leia.next().toUpperCase().charAt(0);
				
				while (genero != 'M' && genero != 'F') {
					System.out.println("Digite uma opção Valida");
					System.out.println("M- para Masculino F- para feminino");
					genero =leia.next().toUpperCase().charAt(0);
				}
				
				System.out.println("Digite o seu ano de Nascimento");
				int anoNascimento =leia.nextInt();
				System.out.println("Digite o número do seu CPF");
				String cpf=leia.next();
				
				cliente cliente =new cliente(nome, genero, anoNascimento, cpf);
				
				if (cliente.getGenero() =='M') {
					System.out.println("\n Seja Bem-Vindo SR" + cliente.getNome());
					
					
				}else if (cliente.getGenero()=='F') {
					System.out.println("Seja Bem-Vinda SRA " +cliente.getNome());
				}
				
				
			
			for (Produtos produto : produtos) {
				System.out.println(produto.getCodigo() + "\t  " + produto.getQuantidadeEstoque() + "\t\t "
						+ produto.getPreco() + "\t\t" + produto.getNome());
			}
			int i=1;
			while(i>10 || opcao == 'S') {
			leia.nextLine();
			System.out.println("Digite o codigo do produto para comprar: ");
			codigo = leia.nextLine().toUpperCase();
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextInt();
			
			
			for (Produtos produto : produtos) {
				if(codigo.equals(produto.getCodigo())) {
					total =total +produto.comprarProduto(quantidade);
				}
				
			}
				
			System.out.println("Deseja continuar comprando? ");
			opcao=leia.next().toUpperCase().charAt(0);
			while(opcao != 'S' && opcao != 'N') {
				System.out.println("Opção invalida");
				System.out.println("DESEJA CONTINUAR COMPRANDO S/N");
				opcao = leia.next().toUpperCase().charAt(0);
				
			}
		}
			
			System.out.println("Nota");
			
			
			for (Produtos produto : produtos) {
				if(produto.getQuantidadeEstoque() != 10) {
				System.out.println(produto.getCodigo() + "\t  " + quantidade + "\t\t "
						+ produto.getPreco() + "\t\t" + produto.getNome());
				}
			}
			
			
			System.out.println("\nO TOTAL A SER PAGO É: R$" + total);
			}
		
				 if (tipo =='2') {

		do {
			System.out.println("[1] - Adicionar o Produto");
			System.out.println("[2] - Remover o produto");
			System.out.println("[3] - Atualizar produtos");
			System.out.println("[4] - Lista de Produtos");
			System.out.println("[5] - Menu");
			op =leia.next().charAt(0);

			while (op !='1' && op != '2' && op != '3' && op!='4') {
				System.out.println("Escolha uma opção valida");
				System.out.print("Digite a opção:");
				op =leia.next().charAt(0);
			}

			if (op =='1') {
				
				System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
			
				for(Produtos prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreco());
				}
				
			
				System.out.println("Digite o código do produto que gostaria de adcionar");
				String nome = leia.next();
				System.out.println("Digite o preço do produto");
				preco = leia.nextDouble();
				Produtos produto = new Produtos(nome, preco);
				produtos.add(produto);
				

			} else if (op == '2') {
				linha(60);
				System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
				linha(60);
				for(Produtos prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreco());
				}

				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA REMOVER");
				String nome = leia.next();

				
				for (Produtos prod : produtos) {
					if (prod.getNome().equals(nome)) {
						produtos.remove(prod);
					}
				}
				

			} else if (op == '3') {
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(Produtos prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreco());
				}
				
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ATUALIZAR");
				String nome = leia.next();
				System.out.println("DIGITE O NOVO NOME DO PRODUTO");
				String nomeNovo = leia.next();
				
				Produtos produto = new Produtos(nome);

				for (Produtos prod : produtos) {
					if (prod.getNome().equals(nome)) {
						prod.setNome(nomeNovo);
					}
				}

			} else if (op =='4'){
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(Produtos prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreco());
				}

			}					
			System.out.println("\n\nDESEJA FAZER OUTRA AÇÃO? S/N");
			continua = leia.next().toUpperCase().charAt(0);
			while(continua != 'S' && continua != 'N') {
				System.out.println("Digite uma opção válida");
				System.out.println("[S]-SIM [N]-NÃO");
				continua = leia.next().toUpperCase().charAt(0);
			}

		
		}while (continua == 'S');
		
	}
	
				 else if (tipo == '3') {

						System.out.println("OBRIGADO POR VISITAR A OUTLET DO DRÉZÃO");
						

					} else {
						System.out.println("Digite uma opção válida");
					}

					System.out.print("Deseja continuar comprando??\n\n[S]-Sim [N]-Não\n");
					opcao = leia.next().toUpperCase().charAt(0);
					while (opcao != 'S' && opcao != 'N') {
						System.out.println("Digite uma opção válida");
						System.out.println("[S]-SIM [N]-NÃO");
						opcao = leia.next().toUpperCase().charAt(0);
					}
					// cabeçalho menu de produtos
					linha(60);
					System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
					linha(60);

					for (Produtos produto : produtos) {
						System.out.println(produto.getCodigo() + "\t  " + produto.getQuantidadeEstoque() + "\t\t "
								+ produto.getPreco() + "\t\t" + produto.getNome());
				}
	

	System.out.println("PROGRAMA FINALIZADO!!");

	}

	public static void linha(int tamanho) {
						for (int i = 0; i < tamanho; i++) {
							System.out.print("═");
						}
						System.out.print("\n");
					}
}


