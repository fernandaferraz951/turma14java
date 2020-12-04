programa{
	
	inclua biblioteca Util
	funcao inicio(){
		const inteiro MOVIMENTO = 5
		inteiro transacao[MOVIMENTO],dataAniversario, dataAniversarioDigitada
		cadeia numeroConta = "G2Bank", cpf = "436.164.598-18"
		real saldo=0.0,debito,credito 
		inteiro acessaTransacao

		dataAniversario = Util.sorteia(1, 31)
		
		para(inteiro x = 0; x < MOVIMENTO; x++){
			escreva("\nConta: ",numeroConta)
			escreva("\nCPF: ",cpf,"\n")
			escreva("\nDigite umas das opções:  ")
			escreva("\n1 - Crédito ")
			escreva("\n2 - Débito ")
			escreva("\n3 - Saldo ")
			escreva("\n4 - Data Aniversário \n")
			leia(acessaTransacao)
			se(acessaTransacao == 1){
				escreva("\nDigite o valor do Crédito: ")
				leia(credito)
				saldo+=credito
			}senao se(acessaTransacao == 2){
				escreva("\nDigite o valor do Débito: ")
				leia(debito)
				se(saldo <= 0.0){
					escreva("Não é possível realizar o saque!\n")
				}senao se(saldo >= debito){
					saldo -= debito
				}
			}senao se(acessaTransacao == 3){
				escreva("\nSaldo em conta:",saldo,"\n")
			}senao se(acessaTransacao == 4){
				escreva("\nDigite o aniversário da conta: ")
				leia(dataAniversarioDigitada)
				se(dataAniversarioDigitada >= 1 e dataAniversarioDigitada <= 31){
					escreva("\nA data de Aniversário da conta é: ",dataAniversario)
					se(dataAniversario == dataAniversarioDigitada){
						se(saldo > 0.0){
							saldo = saldo +(saldo * 0.005)
							escreva("\nSaldo atualizado\n")
						} 
					}
				}
				escreva("\nA data de Aniversário digitada é: ",dataAniversarioDigitada)
				escreva("\nNão houve o reajuste e 0.5% no saldo!")
			}
		}
		limpa()
		escreva("\nConta: ",numeroConta)
		escreva("\nCPF: ",cpf,"\n")
		escreva("\nRealizado as ",MOVIMENTO," movimentações do dia")
		escreva("\nSaldo restante no final das transações: R$",saldo,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */