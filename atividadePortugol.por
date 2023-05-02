programa
{	
	// Dupla: Igor Daniel da Silva e Carlos Eduardo Bezerra de Lima
	
	funcao inicio()
	{
		inteiro pontos, idade
		cadeia full, nome
		inteiro q1,q2,q3,q5,q6
		real q4
		

		pontos = 0
		
		escreva("Olá, seja Bem-vindo(a) ao quiz Portugol!")
		escreva("\nPrimeiro, se apresente: ")
		escreva("\nSeu nome:")
		leia(nome)
		escreva("Sua idade:")
		leia(idade)
		escreva("Você conhece o Portugol? ")
		leia(full)
		escreva("\nÓtimo, foi incrivel conhecer você, agora, vamos começar!\n")
		escreva("*Explicando o quiz: a cada pergunta respondida corretamente, você terá +1 ponto, cada resposta errada, terá -1 ponto. Cuidado!: você pode ficar negativo.\nBoa sorte e que a força esteja com você!")

		
		
		

		escreva("Qual tag eu usaria para exibir algo na tela? ")
		escreva("\n1 - Console.log")
		escreva("\n2 - Escreva")
		escreva("\n3 - Print\n")
		escreva("Resposta: ")
		leia(q1)
		se(q1 == 2){
			
			pontos++
		}senao{
			
			pontos--
		}
		
		

		escreva("O que o leia faz? ")
		escreva("\n1- Recebe um valor para alguma variável. ")
		escreva("\n2- Chama uma função. ")
		escreva("\n3- Ler o que foi escrito e exibi na tela.\n")
		escreva("Resposta: ")
		leia(q2)
		se(q2 == 1){
			
			pontos++
		}senao{
			
			pontos--
		}
		
		escreva("Quais são os tipos de dados que o computador pode armazenar? ")
		escreva("\n1- Float - Real - Cadeia - String ")
		escreva("\n2- Cadeia - Real - Inteiro - Lógico")
		escreva("\n3- Cadeia - Real - Inteiro - Funcão\n")
		escreva("Resposta: ")
		leia(q3)
		se(q3 == 2){
			pontos++
		}senao{
			pontos--
		}
		
		escreva("Qual valor retornado por final? ")
		escreva("\nfuncao inicio()\nreal n1,n2,n3,n4,final \nn1 = 2\nn2 = 5\nn3 = 7\nn4 = 5\nfinal = media(n1,n2,n3,n4)\nescreva(final)\n")
		escreva("funcao real media(real a,real b, real c, real d) \n real resultado \n resultado = (a+b+c+d)/4 \n retorne resultado\n")	
		escreva("Resposta: ")
		leia(q4)
		se(q4 == 4.75){
			pontos++
		}
		senao{
			pontos--
		}
		escreva("\nPreste bem atenção nesse codigo: ")
		escreva("\nfuncao inicio()\n {\n inteiro opcleia(opc)\nescolha(opc){\ncaso1\nescreva('Matematica')\npare\ncaso 2\nescreva('Português')\npare\ncaso 3\nescreva('Ciências')\npare\n}\n}")
		escreva("\nO codígo funcionará? PRESTEM BASTANTE ATENÇÃO! 1 - sim / 2 - não ")
		escreva("Resposta: ")
		leia(q5)
		se(q5 == 2){
			pontos++
		}
		senao{
			pontos--
		}
		escreva("\nQual desses códigos os loops serão FINITOS? ")
		escreva("\n 1 - funcao inicio(){\n inteiro loop,i\nloop = 3\ni = 0\nenquanto(loop > i){\nescreva(Portugol é chatinho :()\ni++\n}")
		escreva("\n 2 - funcao inicio(){\n inteiro loop,i\nloop = 3\ni = 0\nenquanto(loop > i){\nescreva(Portugol é chatinho :()\n}")
		escreva("\nResposta: ")
		leia(q6)
		
		se(q6 == 1){
			pontos++
		}
		senao{
			pontos--
		}
		escreva("Voce obteve ", pontos, " pontos!\n")
		se(pontos == 6){
			escreva("\nVocê pode se considerar um master em Portugol! Proxima etapa: JAVA :0 ")
		}senao{
			escreva("Se você estudar mais e praticar mais, você vai acertar tudo! ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 43; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */