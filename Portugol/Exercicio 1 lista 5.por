programa
{
	
	funcao inicio()
	{
		//Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
		//Código Condição de pagamento 
		//À vista em dinheiro ou cheque, recebe 20% de desconto 
		//À vista no cartão de crédito, recebe 15% de desconto 
		//Em duas vezes, preço normal de etiqueta sem juros 
		//Em três vezes, preço normal de etiqueta mais juros de 10%

		real  condicaoPagamento =0.00
		real cheque =0.2 , dinheiro=*0.2
		real cartaoCredito =0.15
		real emDuasvezes =0.00
		real emTresvezes =0.10
		real juros =0.10
		real preco =0.00
		real precoFinal =0.00
		


		escreva("Calculadora de preços:")
	

		escreva ("Qual a condição do pagamento? \n 1- para a vista em dinheiro ou cheque \n 2- À vista no cartão de crédito \n 3- Em duas vezes \n 4- Em tres Vezes")
		escreva ("\n")
		leia (condicaoPagamento)
		
		se (condicaoPagamento ==1){
			escreva("Qual o valor do seu produto?  ")
			leia (preco )
			dinheiro=preco*dinheiro
		escreva ("O desconto do produto é " , dinheiro, "\nvalor total é: " , preco-dinheiro) 

		}
		senao se (condicaoPagamento ==2){
			escreva ("Qual o valor do seu produto? ")
			leia (preco)
			cartaoCredito=preco*cartaoCredito
			escreva ("O desconto do produto é: ", cartaoCredito, "\nValor Total é: ", preco-cartaoCredito)
		}
		senao se (condicaoPagamento ==3){
			escreva ("Qual o valor do seu produto? ")
			leia (preco)
			escreva ("O valor total do seu produto é: ", preco)
			
			
		}senao se (condicaoPagamento ==4){
			escreva ("Qual o valor do seu produto?")
			leia (preco)
			
			escreva ("Parcelado em 3 vezes com juros de 10% " , "\nO valor total do seu produto é: ", preco*1.10)
		}
		
		senao se (condicaoPagamento >=5 ) {
			escreva ("Opção invalida")
			
			
		}
			
			
			
			
			
			
			
		
		
		
			
		
	
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1943; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */