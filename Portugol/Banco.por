programa
{
	
	funcao inicio()
	{
		inteiro numeroConta = 003
		real saldo =0.0
		cadeia cpf = "123.456.789-10"
		real transacoes [10]
		real saldoLimite =1000.00
		cadeia resposta 
		caracter tipo
		real credito=0.0, debito=0.0 , numeroCheque=0.0 , cheque=0.0
		inteiro valorTalao=02
		
		


		escreva("Informe seus dados: ")
		escreva ("\n")
		escreva ("-----------------------------")
		escreva ("\nNúmero da Conta: ", numeroConta)
		escreva ("\nNúmero do CPF: ", cpf)
		escreva ("\n")
		escreva ("\nSeu saldo é:",saldo)

		para (inteiro movimentos=0; movimentos <2; movimentos++ ){
			escreva ("\n 1- Débito ou 2- Crédito?")
			leia (tipo)
			
			se (tipo =='1') 
			
			{
				escreva("O valor de Débito:")
				leia (debito)

			se ( saldo>= debito){
					transacoes[movimentos]=(saldo - debito)
					
					
				}
				senao 
				{
					escreva ("Você não possui saldo suficiente")
				}
				
			}
				senao se (tipo=='2')
				{
					escreva ( "Qual o valor a ser creditado? ")
					leia (credito)
					transacoes[movimentos]=(saldo + credito)
					
				}
				
				saldo = transacoes[movimentos]
				escreva ("\nSaldo Atual:", saldo)
				
				
				
				
				
			
			}
			para (inteiro movimentos=0; movimentos <1; movimentos++ ){
				escreva ("\n 1- Solicitar Novo talão ou 2- Alterar Numeração?")
				leia (tipo)
				se(tipo=='1'){
					escreva ("Digite o Número do talão:")
					leia (valorTalao)
					escreva ("Talão Solicitado")
					
				}
				senao se (tipo=='2'){
					escreva ("Numeração Alterada" , valorTalao)
				}
					
				
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */