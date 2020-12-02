programa
{
	
	funcao inicio()
	{
		inteiro maior=0
		inteiro pontos[5]


		para( inteiro x=0 ; x<=4; x++)
		{
			escreva("Digite os numeros: ")
			leia (pontos [x])
			se(pontos [x]> maior ){
				maior=pontos [x]
				
			}
			
			
		}
		para( inteiro x=1 ; x<=1; x++){

			escreva ("\n")
		
			escreva ("Maior pontos é:" , maior) }


			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */