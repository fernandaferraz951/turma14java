programa
{
	inclua biblioteca Util --> usar
	
	funcao inicio()
	{
		inteiro numeroMaior= 0
		inteiro media = 0
		inteiro soma = 0
		inteiro numeroLadoDados[6]
		inteiro numeroVezes[10]
		
		para(inteiro numeroLanc = 0; numeroLanc < 10;numeroLanc++)
		{
			numeroVezes[numeroLanc] = usar.sorteia(1, 6)
			escreva("\n"," o numero é ","\n",numeroVezes[numeroLanc],"\n" )
			soma = (numeroVezes[numeroLanc]+soma)
			media = (soma/10)
			se(numeroVezes[numeroLanc]>numeroMaior)
			{
				numeroMaior= numeroVezes[numeroLanc]
			}
			
		}
			escreva("\n A média é : ", "\n", "    ", media)
			escreva("\n","\n A numero maior é : ", " \n", "    ", numeroMaior)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */