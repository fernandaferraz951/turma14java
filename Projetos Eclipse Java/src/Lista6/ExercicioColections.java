package Lista6;
import java.util.*;
public class ExercicioColections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		int qtd, opcao, codi = 1, codUser;
		double preco;
		String nome;
		do {
			linha(80);
			System.out.println("Menu inicial");
			linha(80);
			System.out.println("[1] - Adicionar produtos");
			System.out.println("[2] - Remover produtos");
			System.out.println("[3] - Atualizar produtos");
			System.out.println("[4] - Ver produtos");
			System.out.println("[5] - Fechar sistema");
			do {
				System.out.println("Digite a op��o desejada: ");
				opcao = sc.nextInt();
			} while (opcao < 1 || opcao > 5);
			if (opcao == 1) {
				sc.nextLine();
				System.out.println("Digite o nome do produto: ");
				nome = sc.nextLine();
				System.out.println("Digite o pre�o do produto: ");
				preco = sc.nextDouble();
				do {
					System.out.println("Digite [1] se tiver estoque, [2] se n�o: ");
					opcao = sc.nextInt();
				} while (opcao < 1 || opcao > 2);
				if (opcao == 1) {
					System.out.println("Digite quanto tem em estoque: ");
					qtd = sc.nextInt();
				} else {
					qtd = 0;
				}
				lista.add(new Produto(codi, nome, preco, qtd));
				codi++;
			} else if (opcao == 2) {
				System.out.println("Digite o c�digo de produto que quer retirar de linha: ");
				codUser = sc.nextInt();
				for (Produto p : lista) {
					if (p.getCodigo() == codUser) {
						System.out.println("O produto selecionado foi: ");
						System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
						System.out.println(
								p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t" + p.getNome());
						do {
							System.out.println("Digite 1 para confirmar a exclus�o, 2 para cancelar");
							opcao = sc.nextInt();
						} while (opcao < 1 || opcao > 2);
						if (opcao == 1) {
							lista.remove(lista.indexOf(p));
							System.out.println("Produto removido com sucesso");
						} else {
							System.out.println("Exclus�o cancelada.");
						}
					}
				}
			} else if (opcao == 3) {
				linha(80);
				System.out.println("Atualiza��o de produtos");
				linha(80);
				System.out.println("[1] - Atualizar nome");
				System.out.println("[2] - Atualizar pre�o");
				System.out.println("[3] - Manuten��o de estoque");
				System.out.println("[4] - Voltar para o menu inicial");
				do {
					System.out.println("Digite a op��o desejada: ");
					opcao = sc.nextInt();
				} while (opcao < 1 || opcao > 4);
				if (opcao == 1) {
					System.out.println("Digite o c�digo de produto que quer alterar o nome: ");
					codUser = sc.nextInt();
					for (Produto p : lista) {
						if (p.getCodigo() == codUser) {
							System.out.println("O produto selecionado foi: ");
							System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
							System.out.println(p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t"
									+ p.getNome());
							do {
								System.out.println("Digite 1 para confirmar a altera��o de nome, 2 para cancelar");
								opcao = sc.nextInt();
							} while (opcao < 1 || opcao > 2);
							if (opcao == 1) {
								sc.nextLine();
								System.out.println("Digite o novo nome: ");
								nome = sc.nextLine();
								p.atualizaNome(nome);

							} else {
								System.out.println("Altera��o cancelada.");
							}
						}
					}
				}
				if (opcao == 2) {
					System.out.println("Digite o c�digo de produto que quer alterar o pre�o: ");
					codUser = sc.nextInt();
					for (Produto p : lista) {
						if (p.getCodigo() == codUser) {
							System.out.println("O produto selecionado foi: ");
							System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
							System.out.println(p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t"
									+ p.getNome());
							do {
								System.out.println("Digite 1 para confirmar a altera��o de pre�o, 2 para cancelar");
								opcao = sc.nextInt();
							} while (opcao < 1 || opcao > 2);
							if (opcao == 1) {
								System.out.println("Digite o novo pre�o: ");
								preco = sc.nextDouble();
								p.atualizaPreco(preco);

							} else {
								System.out.println("Altera��o cancelada.");
							}
						}
					}
				}
				if (opcao == 3) {
					System.out.println("Digite o c�digo de produto que quer atualizar estoque: ");
					codUser = sc.nextInt();
					for (Produto p : lista) {
						if (p.getCodigo() == codUser) {
							System.out.println("O produto selecionado foi: ");
							System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
							System.out.println(p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t"
									+ p.getNome());
							do {
								System.out.println(
										"Digite 1 para adicionar estoque, 2 para retirar estoque, 3 para cancelar");
								opcao = sc.nextInt();
							} while (opcao < 1 || opcao > 3);
							if (opcao == 1) {
								do {
									System.out.println("Digite a quantidade a ser adicionada: ");
									qtd = sc.nextInt();
								} while (qtd < 0);
								p.addEstoque(qtd);
							} else if (opcao == 2) {
								do {
									System.out.println("Digite a quantidade a ser retirada: ");
									qtd = sc.nextInt();
								} while (qtd < 0);
								p.tiraEstoque(qtd);
							} else {
								System.out.println("Altera��o cancelada.");
							}
						}
					}
				}
			} else if (opcao == 4) {
				linha(80);
				System.out.println("Lista de produtos");
				linha(80);
				System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
				for (Produto p : lista) {
					System.out.println(
							p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t" + p.getNome());
				}
			} else {
				System.out.println("Obrigado por utilizar nosso sistema.");
				sc.close();
				System.exit(0);
			}
		} while (opcao != 5);
		sc.close();

	}

	static void linha(int tam) {
		for (int i = 1; i <= tam; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}

