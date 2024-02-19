programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	
		real lado
		real final
		real a,b,c
		real final2
		real r
		real final3
		real rcilindro
		real hcilindro
		real final4
		
		escreva("Digite o valor do lado do seu cubo: ")
		leia(lado)
		
		final = volumecubo(lado)
		escreva("O volume desse cubo é: ", final)
		
		escreva("\nDigite 3 valores para o paralelepipedo, para altura, comprimento e largura respectivamente: ")
		escreva("\nAltura: ")
		leia(a)
		escreva("Comprimento: ")
		leia(b)
		escreva("Largura: ")
		leia(c)

		final2 = volumeparalelepipedo(a,b,c)

		escreva("O volume do paralelepipedo é: ", final2)





		escreva("\nVamos calcular o volume de uma esfera, digite o raio dessa esfera: ")
		leia(r)

		
		final3 = volumeesfera(r)
		
		escreva("O volume da sua esfera é: ", final3)

		escreva("\nVamos calcular a area do cilindro, digite a altura e o raio da base desse cilindro: ")
		escreva("\nAltura: ")
		leia(hcilindro)
		escreva("\nRaio da base: ")
		leia(rcilindro)

		final4 = volumecilindro(hcilindro,rcilindro)

		escreva("O volume desse cilindro é: ", final4)
		
		
		
	}
	funcao real volumecubo(real x){
		real resultado
			resultado = x*x*x
		
		retorne resultado
	}
	funcao real volumeparalelepipedo(real x, real y, real h){
		real resultado
		resultado = x*y*h

		retorne resultado
	}
	funcao real volumeesfera(real x){
		
		real resultado
		resultado =  (4/3) * 3.14 * (x*x*x)
		retorne resultado
		
	}
	funcao real volumecilindro(real h, real r){
		real resultado
		resultado = 3.14 * (r*r) * h
		retorne resultado
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 769; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */