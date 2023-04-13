programa
{
funcao inicio(){
		real A,B,C
		escreva("Digite um valor: ")
		leia(A)
		escreva("Digite outro valor: ")
		leia(B)
		escreva("Digite outro valor: ")
		leia(C)

		se((A+B>C) e (A+C>B) e (B+C>A)){
			escreva("É um triangulo! ")
		}senao{
			escreva("Não é um triangulo! ")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */