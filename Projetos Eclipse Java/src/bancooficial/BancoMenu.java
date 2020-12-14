package bancooficial;


import java.util.Random;
import java.util.Scanner;

public class BancoMenu {

	public static final int TOTAL_CLIENTE = 40;
	public static int contaDigitada;
	public static int conta [] = new int [TOTAL_CLIENTE];
	public static String clientes[] = {"Allen de Lima Vieira", "Andr� de Brito Silva da Costa","B�rbara Liboni Guerra",	
			"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
			"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
			"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
			"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco Jos� Pires",
			"Gabriel S�rgio Nascimento Santos Gon�alves", "Gide�o da Silva Idelfonso",
			"GILSON AMORIM DE MATOS","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
			"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
			"Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�",
			"K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni barros",
			"Lucas Gon�alves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalh�es",
			"Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva",
			"Tiago dos Santos Martins","Ver�nica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
	public static char genero [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M',
			'F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
	public static int tipo[] = new int[4];
	public static double valor[] = new double[4];
	public static String nome;
	public static Scanner leia = new Scanner(System.in);
	public static int talao[]= new int [3];
	public static void main(String[] args) {
		
		int menu;
		
		digitarConta(); 
		inicializarContas();
		
		linha(50);
		saudacao();
		linha(50);
			
		do {
			System.out.println("Digite a op��o de conta");
			System.out.println("1 - Conta Poupan�a ");
			System.out.println("2 - Conta Corrente ");
			System.out.println("3 - Conta Especial ");
			System.out.println("4 - Conta Empresarial ");
			System.out.println("5 - Conta Universit�ria ");
			System.out.println("6 - Extrato Consolidado ");
			System.out.println("0 - Sair ");
			menu = leia.nextInt();

			if (menu == 1) {
				contaPoupanca();
			} else if (menu == 2) {
				contaCorrente();
			} else if (menu == 3) {
				contaEspecial();
			} else if (menu == 4) {
				contaEmpresarial();
			} else if (menu == 5) {
				contaUniversitaria();
			} else if (menu == 6) {
				// fun��o extrato
			} else if (menu == 0) {
				System.out.println("Encerrando acesso a conta");
				System.exit(0);
			}

		} while (menu != 0);
	}

	public static void contaPoupanca() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("N�o � poss�vel realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if (saldo < 0) {
							System.out.println(
									"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}

			}
			System.out
					.println("Voc� realizou todas as poss�veis transa��es em Conta Poupan�a, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaCorrente() {
		Random sorteia = new Random();
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar, escolheDebitoCredito;
		Scanner entrada = new Scanner(System.in);
		int numeroTalao=sorteia.nextInt(258) ,alteraNumero=sorteia.nextInt(252);

		do {

			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("3 - Saldo ");
				System.out.println("4 - Solicitar tal�o ");
				System.out.println("5 - Alterar n�mero do tal�o ");
				System.out.println("0 - Sair ");
				
				
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("N�o � poss�vel realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if(saldo < 0) {
							System.out.println("N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				}else if (opcao==4) {
					System.out.println("solicitar um novo tal�o, numero do tal�o �: " + numeroTalao);
					
				} else if (opcao==5) {
					System.out.println("Alterado o n�mero para: " + alteraNumero);
				}
				
				else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}

			}
			System.out
					.println("Voc� realizou todas as poss�veis transa��es em Conta Corrente, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}
	public static void contaEspecial() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("N�o � poss�vel realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if (saldo < 0) {
							System.out.println(
									"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}

			}
			System.out
					.println("Voc� realizou todas as poss�veis transa��es em Conta Especial, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaEmpresarial() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("N�o � poss�vel realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if (saldo < 0) {
							System.out.println(
									"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}

			}
			System.out.println(
					"Voc� realizou todas as poss�veis transa��es em Conta Empresarial, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaUniversitaria() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
				} else if (opcao == 2) {
					if (saldo <= 0.0) {
						System.out.println("N�o � poss�vel realizar o saque!");
					} else if (saldo >= debito) {
						System.out.println("Digite o valor a ser debitado");
						debito = entrada.nextDouble();
						saldo -= debito;
						if (saldo < 0) {
							System.out.println(
									"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
							saldo = saldo + debito;
						}
						mostrarSaldo(saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}

			}
			System.out.println(
					"Voc� realizou todas as poss�veis transa��es em Conta Universitaria, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void mostrarSaldo(Double saldo) {
		System.out.println("Saldo: R$ " + saldo);
	}

	public static String opcaoGenero(char genero) {
		if (genero == 'M') {
			return "AAA";
		} else if (genero == 'F') {
			return "BBB";
		} else {
			return "CCC";
		}
	}
	
	private static void digitarConta() {
		while (true) {
			System.out.println("Digite o n�mero da sua conta: ");
			contaDigitada = leia.nextInt();
			if (contaDigitada < 1 || contaDigitada > TOTAL_CLIENTE + 1) {
				System.out.println("Voc� n�o possui uma conta no banco");
			} else {
				contaDigitada -= 1;
				break;
			}
		}
	}
	
	public static void saudacao() {
		if (genero[contaDigitada] == 'M') {
			System.out.println("Bem vindo ao Banco G2! Sr. " + clientes[contaDigitada]);
		} else if (genero[contaDigitada] == 'F') {
			System.out.println("Bem vinda ao Banco G2! Sra. " + clientes[contaDigitada]);
		} else {
			System.out.println("Bem vindo(a) ao Banco G2! Sr(a). " + clientes[contaDigitada]);
		}
	}
	
	private static void inicializarContas() {
		for (int i = 0; i < TOTAL_CLIENTE; i++) {
			conta[i] = i;
		}
	}

}