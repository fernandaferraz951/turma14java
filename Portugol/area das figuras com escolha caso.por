programa{
	inclua biblioteca Matematica --> mat
	funcao inicio() {
		inteiro opcao
		real area, raio,base, altura, pI = 3.14
		
		escreva("1) Area Circulo \n")
		escreva("2) Area Triangulo \n")
		escreva("3) Area Retangulo \n")
		escreva("4) sair \n\n")

		escreva("Escolha uma opção: ")
		leia(opcao)

		limpa()

		escolha (opcao)	
		{
			caso 1: 
		 		

				escreva("Digite o valor do raio do circulo: ")
				leia(raio)

				se(raio > 0) {
					area = (mat.potencia(raio, 2.0)) * pI
					escreva("\nA área do circulo é: "+mat.arredondar(area, 2)+"\n")
				}senao{
					escreva("\nO valor do raio deve ser maior que zero!\n")
				}
		 		pare   // Impede que as instruções do caso 2 sejam executadas
		 	caso 2: 
		 		escreva("Digite o valor da base do Triangulo:" )
				leia(base)
				escreva("Digite o valor da altura do Triangulo:" )
				leia(altura)

				area = (base*altura)/2

				escreva("\nA área do triangulo é: "+area+"\n")
		 		pare   // Impede que as instruções do caso 2 sejam executadas
		 	caso 3:
		 	escreva("Digite o valo da base do retangulo: ")
				leia(base)
				escreva("\nDigite o valo da altura do retangulo: ")
				leia(altura)

				area=base*altura

				escreva("\nA área do retangulo é: "+area+"\n")
		 		pare
		 	caso 4:
		 		escreva ("Programa Finalizado")
		 		pare
		 	caso contrario: // Será executado para qualquer opção diferente de 1, 2 ou 3
		 		escreva ("Opção Inválida !")
		}

		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 781; 
 * @DOBRAMENTO-CODIGO = [27];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */