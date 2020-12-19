package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLoja {
	public static void main (String [] args, Object produto) {
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
		
		List<Produto>produtos =new ArrayList<>();
		produtos.add(new Produto("C001", "Kong", 23.00, "10"));
		produtos.add(new Produto("C002", "Guia Azul", 12.00, "10"));
		produtos.add(new Produto("C003" , "Guia Rosa", 13.00, "10"));
		produtos.add(new Produto("C004", "Comedouro com Peso", 20.00, "10"));
		produtos.add(new Produto("C005" , "Bolinha", 2.00, "10"));
		produtos.add(new Produto("C006", "Caixa de Areia", 10.00, "10"));
		produtos.add(new Produto("0007", "Roupinha de natal tamanho G", 45.00, "10"));
		produtos.add(new Produto("0008", "Casco de boi", 10.00, "10"));
		produtos.add(new Produto("0009", "Comedouro interativo", 12.00, "10"));
		produtos.add(new Produto("0010", "Cama com colchão", 35.00, "10"));
		
		
		
		
		
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
				
				Cliente cliente =new Cliente(nome, genero, anoNascimento, cpf);
				
				if (cliente.getGenero() =='M') {
					System.out.println("\n Seja Bem-Vindo SR" + cliente.getNome());
					
					
				}else if (cliente.getGenero()=='F') {
					System.out.println("Seja Bem-Vinda SRA " +cliente.getNome());
				}
				
				
			}
			for (Produto produto : produtos) {
				System.out.println(produto.getCodigo()+"\t"+ produto.getQtdeProduto()+"\t\t"+produto.getValorUnitario() +"\t\t"+ produto.getNomeProduto());
				
				
			}
			int i=1;
			while(i>10 || opcao == 'S') {
			leia.nextLine();
			System.out.println("Digite o codigo do produto para comprar: ");
			codigo = leia.nextLine().toUpperCase();
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextInt();
			
			
			for (Produto produto : produtos) {
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
			
			
			for (Produto produto : produtos) {
				if(produto.getQtdeProduto()!=10) {
				System.out.println(produto.getCodigo() + "\t  " + quantidade + "\t\t "
						+ produto.getValorUnitario()+ "\t\t" + produto.getNomeProduto());
				}
			}
			
				System.out.println("\n O total a ser pago é :" + total +"reais");
	
			
				 if (tipo =='2') {

		do {
			System.out.println("[1] - ADICIONAR PRODUTO");
			System.out.println("[2] - REMOVER PRODUTO");
			System.out.println("[3] - ATUALIZAR PRODUTO");
			System.out.println("[4] - LISTA DE PRODUTOS");
			System.out.println("[5] - MENU");
			opcao =leia.next().charAt(0);

			while (opcao !='1' && opcao != '2' && opcao != '3' && opcao!='4') {
				System.out.println("ESCOLHA UMA OPÇÃO CORRETA");
				System.out.print("DIGITE A OPÇÃO:");
				opcao =leia.next().charAt(0);
			}

			if (opcao =='1') {
				
				System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
			;
				for (Produto produto : produtos) {
					System.out.println(produto.getCodigo() + "\t  " + produto.getQtdeProduto() +"\t\t"
							+ produto.getValorUnitario() + "\t\t" + produto.getNomeProduto());
				}
				
				leia.nextLine();
				System.out.println("Digite um código de um produto existente");
				String codigo = leia.next();
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ADICIONAR");
				String nome = leia.nextLine();
				System.out.println("DIGITE O PREÇO DO PRODUTO");
				preco =leia.nextInt(0);
				Produto produtos =new Produto(codigo, nome, preco, quantidade);
				produtos.add(produto);
				
				

			} else if (op == '2') {
				linha(60);
				System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
				linha(60);
				for (Produtos produto : produtos) {
					System.out.println(produto.getCodigo() + "\t  " + produto.getQuantidadeEstoque() + "\t\t "
							+ produto.getPreco() + "\t\t" + produto.getNome());
				}
				t.nextLine();
				System.out.println("DIGITE O CODIGO DO PRODUTO PARA REMOVER");
				String codigo = t.nextLine();

				
				for (Produtos produto : produtos) {
					if (produto.getCodigo().equals(codigo)) {
						produtos.indexOf(codigo);
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
				String nome = t.next();
				System.out.println("DIGITE O NOVO NOME DO PRODUTO");
				String nomeNovo = t.next();
				
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
			continua = t.next().toUpperCase().charAt(0);
			while(continua != 'S' && continua != 'N') {
				System.out.println("Digite uma opção válida");
				System.out.println("[S]-SIM [N]-NÃO");
				continua = t.next().toUpperCase().charAt(0);
			}

		
		}while (continua == 'S');
		
	}
	

	else if (tipo == '3') {

		System.out.println("OBRIGADO POR VISITAR A OUTLET DO DRÉZÃO");
		break;

	} else {
		System.out.println("Digite uma opção válida");
	}

	System.out.print("Deseja continuar no programa??\n\n[S]-Sim [N]-Não\n");
	opcao = t.next().toUpperCase().charAt(0);
	while (opcao != 'S' && opcao != 'N') {
		System.out.println("Digite uma opção válida");
		System.out.println("[S]-SIM [N]-NÃO");
		opcao = t.next().toUpperCase().charAt(0);
	}
	// cabeçalho menu de produtos
	linha(60);
	System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
	linha(60);

	for (Produtos produto : produtos) {
		System.out.println(produto.getCodigo() + "\t  " + produto.getQuantidadeEstoque() + "\t\t "
				+ produto.getPreco() + "\t\t" + produto.getNome());
	}
} while (opcao == 'S');

System.out.println("PROGRAMA FINALIZADO!!");


}

public static void linha(int tamanho) {
for (int i = 0; i < tamanho; i++) {
	System.out.print("═");
}
System.out.print("\n");
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}


