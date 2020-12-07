programa
{
	
	funcao inicio()
	{
		const inteiro MOVIMENTO = 5
		inteiro transacao[MOVIMENTO],dataAniversario, dataAniversarioDigitada
		cadeia numeroConta = "G2Bank", cpf = "436.164.598-18"
		real saldo=0.0,debito,credito, 
		inteiro acessaTransacao
		real numeroTalao=51.0 , alteraNumero=52.0
		


		para (inteiro x = 0; x < MOVIMENTO; x++ ){
			escreva ("\nConta: ",numeroConta)
			escreva("\nCPF: ",cpf,"\n")
			escreva("\nDigite umas das opções:  ")
			escreva("\n1 - Crédito ")
			escreva("\n2 - Débito ")
			escreva("\n3 - Saldo "))
			escreva ("\n4 - Solicitar um novo talão")
			escreva ("\n5 - Alterar numeração de talão")
			leia (acessaTransacao)
			
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
			} senao se (acessaTransacao ==4){
				escreva("solicitar um novo talão, numero do talão é: ", numeroTalao)
				leia(numeroTalao)
				
			} senao se(acessaTransacao==5){ 
				escreva ("Número Alterado para: ", alteraNumero)
				leia(alteraNumero)
			}
				
		}limpa()
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
 * @POSICAO-CURSOR = 1336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */