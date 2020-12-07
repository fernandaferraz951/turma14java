programa
{
	funcao inicio()
	{
		cadeia alunos[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena", "Vinicius Miranda"
}
		caracter sexoAlunos[] = { 'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'
}
		cadeia matriculas[39]
		cadeia aluno
		real nota
		caracter  confirmacao = 'S'
		caracter  negacao = 'N'
		
		
		para (inteiro x=0; x< 39; x++)
		{
			matriculas[x] = "G2-"+(x+1)	
		}
		
		para (inteiro x=0; x< 39; x++){
			escreva("\nmatricula:", matriculas[x], " - ",alunos[x])
		}
		
		escreva("\nEscolha um aluno pela matricula:" )
		leia(aluno)
		
		
		para (inteiro x=0; x<39; x++)
		{
			se ( aluno == matriculas[x])
			{
				se( sexoAlunos[x] == 'M')
				{
					escreva("\nO aluno escolhido foi : ", alunos[x]+" -Digite a nota do Aluno")
					leia(nota)
				}
				senao
				{
					escreva("\n"," A aluna escolhida foi : ","\n", alunos[x]+"\n"+"-Digite a nota do Aluno : ")
					
				}
				
				
			}
			
		}
		
	
			para (inteiro x=0; x<39; x++)
		{
			leia(nota)
	
			se (nota < 0 e nota > 10 ){
				escreva ("Insira uma nota válida entre 0 e 10.")					
			}
			senao se(nota<=5)
			{
				escreva("O aluno foi reprovado.")
				
			}
			senao se (nota > 5 e nota < 8)
			{
				escreva("O aluno esta de recuperação.")
				
			}
			senao se (nota > 8)
			{
				escreva ("O aluno foi aprovado")
			}
	
		}
		escolha(confirmacao){
			escreva
		}
	
		
	
		
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1675; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */