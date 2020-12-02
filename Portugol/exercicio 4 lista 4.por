programa
{
	
	funcao inicio()
	{
		inteiro diagonal = 0
		inteiro soma = 0
		inteiro dadosUsuario[3][3]

	     
	     para( inteiro linha =0;linha<3;linha++ )
	{
		escreva("\n")
	
		para(inteiro coluna =0;coluna<3;coluna++)
	{
			escreva(" Digite um valor : ")
			leia(dadosUsuario[linha][coluna])
			soma = dadosUsuario[linha][coluna]+soma
			
			
	}
	
	}
		para(inteiro l = 0;l<3;l++)
		{
			para(inteiro c = 0; c<3;c++ )
			{
				se(dadosUsuario[l][c] == dadosUsuario[c][l])
			{
				diagonal = dadosUsuario[l][c] + diagonal
			}
			}
		}
		escreva("\n A soma é ","\n", soma )
		escreva("\n O diagonal é ","\n",diagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */