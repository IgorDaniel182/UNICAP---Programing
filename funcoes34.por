programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	
		real lado
		real final
		real a,b,c
		real final2
		real r
		real final3
		
		escreva("Digite o valor do lado do seu cubo: ")
		leia(lado)
		
		final = areacubo(lado)
		escreva("A area desse cubo é: ", final)
		
		escreva("\nDigite 3 valores para o paralelepipedo, para altura, comprimento e largura respectivamente: ")
		escreva("\nAltura: ")
		leia(a)
		escreva("Comprimento: ")
		leia(b)
		escreva("Largura: ")
		leia(c)

		final2 = areaparalelepipedo(a,b,c)

		escreva("A area do paralelepipedo é: ", final2)





		escreva("Vamos calcular a area de uma esfera, digite o raio dessa esfera: ")
		leia(r)
		
		
		escreva("A area da sua esfera é: ", areaesfera)
		
		
	}
	funcao real areacubo(real x){
		real resultado
			resultado = x*x*x
		
		retorne resultado
	}
	funcao real areaparalelepipedo(real x, real y, real h){
		real resultado
		resultado = x*y*h

		retorne resultado
	}
	funcao real esferaarea(x){
		
		real resultado
		resultado =  (4/3) * 3.14 * (x*x*x)
		retorne resultado
		)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */