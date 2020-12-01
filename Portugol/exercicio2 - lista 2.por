programa
{
	
	funcao inicio()
	{
		cadeia C 
		inteiro N=0
		inteiro E=0
		real salarioTotal=0.0, salarioExcedente=0.0, salarioBase = 500.00

		const real VALORHORANORMAL = 10.00
		const real VALORHORAEXCEDENTE = 20.00
		const inteiro LIMITEHORAS = 50.00

		escreva ("Digite o código do funcionário: ")
		leia (C)
		escreva ("Digite a Quantidade de horas trabalhadas")
		leia (N)


		se (N <= LIMITEHORAS) {
			salarioBase = (N*VALORHORANORMAL) //calculo hora normal
			salarioTotal = salarioBase
			
		}
		senao {
			
			E = (N - LIMITEHORAS)
			salarioTotal = (LIMITEHORAS*VALORHORANORMAL)
			
			salarioExcedente = E*VALORHORAEXCEDENTE
			salarioTotal = salarioTotal+salarioExcedente
		}

		//saidas

		
		escreva ("\nQuantidade de horas Trabalhadas: ", N)
		escreva ("\nQuantidade de horas excedentes: ", E)
		escreva("\nSalario Excedente: ", salarioExcedente)
		escreva("\nSalario total: ", salarioTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */