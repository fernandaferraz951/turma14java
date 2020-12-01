programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		//8. O custo ao consumidor de um carro novo é a soma do custo
		//de fábrica com a percentagem do distribuidor e dos impostos 
		//(aplicados ao custo de fábrica). 
		//Supondo que a percentagem do distribuidor seja de 
		//28% e os impostos de 45%, escrever um sistema //
		//que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

		 //variaveis

		 real custoConsumidorCarro=0
		 real custoFabricaCarro
		 real porcentagemDistribuidor=0 //documetação - camelcase
		 real impostosPrecoFabrica=0

		 const real VALORDISTRIBUIDOR =0.28 //28%
		 const real VALORIMPOSTO =0.45 //45% 1.45 0.45

		 //entrada de dados

		 escreva ("Digite o preço de fabrica do carro: ")
		 leia (custoFabricaCarro)


		 //processamento

		impostosPrecoFabrica = (custoFabricaCarro * VALORIMPOSTO)
		porcentagemDistribuidor = (custoFabricaCarro *VALORDISTRIBUIDOR)
		custoConsumidorCarro = (custoFabricaCarro +impostosPrecoFabrica + porcentagemDistribuidor)

		//saida
		escreva("Custo final do carro novo é: " ,math.arredondar(custoConsumidorCarro, 4)custoConsumidorCarro)
		
		
		

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */