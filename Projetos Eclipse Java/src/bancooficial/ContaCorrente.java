package bancooficial;
import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	private int talao ;
	private int qtdTalao;
	private int totalTalao;
	
	
	
	
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	}

	public ContaCorrente(int numeroConta, String CPF, int qtdTalao) {
		super(numeroConta, CPF);
		qtdTalao=this.qtdTalao;
	}
	
	
	public int getQtdTalao() {
		return qtdTalao;
	}
	
	public int getTotalTalao() {
		return totalTalao;
	}

	public void setTotalTalao(int totalTalao) {
		this.totalTalao = totalTalao;
	}
	
	

	public int getTalao() {
		return talao;
	}

	public void setTalao(int talao) {
		this.talao = talao;
	}

	public void setQtdTalao(int qtdTalao) {
		this.qtdTalao = qtdTalao;
	}

	public void talao(int numConta) {
		char opcao;
		do {
			Scanner t = new Scanner(System.in);
			System.out.println("Voc� deseja imprimir tal�o? S/N ");
			opcao = t.next().toUpperCase().charAt(0);
			while (opcao != 'S' && opcao != 'N') {
				System.out.println("\nOp��o inv�lida. Deseja continuar? S/N");
				opcao = t.next().toUpperCase().charAt(0);
			}

			if (opcao == 'S') {
				System.out.println("Digite a quantidade que deseja: (At� 3 tal�es por dia)");
				qtdTalao = t.nextInt();
				while (qtdTalao < 0 || qtdTalao > 3) {
					System.out.printf("\nQuantidade inv�lida. Voc� pode resgatar at� %d tal�es\nDigite a quantidade:", talao);
					qtdTalao = t.nextInt();
				}

				while (qtdTalao > talao) {
					System.out.printf("Erro! Quantidade dispon�vel: %d. Digite a quantidade:", talao);
					qtdTalao = t.nextInt();
				}

				talao = talao - qtdTalao;
				totalTalao = totalTalao + qtdTalao;
				if (talao == 0) {
					talao = 3;
				}
				this.totalTalao = totalTalao;
				System.out.printf("Quantidade di�ria impressa: %d\n", qtdTalao);
				System.out.printf("Quantidade total impressa: %d\n", totalTalao);
				System.out.println("Deseja continuar? \n[S]-Sim \n[N]-N�o");
				opcao = t.next().toUpperCase().charAt(0);
			}

		} while (opcao == 'S');

	}

	

}