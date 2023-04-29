programa
{
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	
		real lado,final, altura, largura, comprimento,final2,hcilindro, rcilindro,final3,resfera,final4
		cadeia condicao		
		condicao = "sim"
		
		escreva("Temos opções de calculo para volume, sendo eles: Cubo, Paralelepipedo, Cilindro e Esfera \n - Calculo volume do cubo - ")

			
		
			
		      enquanto(condicao == "sim"){
			escreva("\nDigite o valor do lado do seu cubo: ")
			leia(lado)
			final = volumecubo(lado)
			escreva("O volume desse cubo é: ", final)
			escreva("\nDeseja calcular outro volume de cubo? ")
			leia(condicao)	
			limpa()
			se (condicao == "nao"){
				condicao = "sim"
				enquanto(condicao == "sim"){
					escreva("- Calculo volume do paralelepipedo - ")
					escreva("\nDigite a altura: ")
					leia(altura)
					escreva("Digite a largura: ")
					leia(largura)
					escreva("Digite a comprimento: ")
					leia(comprimento)
					final2 = volumeparalelepipedo(altura,largura,comprimento)
					escreva("O volume desse paralelepipedo é: ", final2)
					escreva("\nDeseja calcular outro volume de paralelepípedo? ")
					leia(condicao)
					limpa()
				}se(condicao == "nao"){
					condicao = "sim"
					enquanto(condicao == "sim"){
						escreva("- Calculo volume do cilindro - ")
						escreva("\nDigite a altura do cilindro: ")
						leia(hcilindro)
						escreva("Digite o raio da base do cilindro: ")
						leia(rcilindro)
						final3 = volumecilindro(hcilindro, rcilindro)
						escreva("O volume do cilindro é: ", final3)
						escreva("\nDeseja calcular outro volume de cilindro? ")
						leia(condicao)
						limpa()
			 		}se(condicao == "nao"){
			 			condicao = "sim"
			 			enquanto(condicao == "sim"){
			 				escreva("- Calculo volume do esfera - ")
			 				escreva("\nDigite o raio da esfera: ")
			 				leia(resfera)
			 				final4 = volumeesfera(resfera)
			 				escreva("O volume dessa esfera é: ", final4)
			 				escreva("\nDeseja calcular outro volume de cilindro? ")
			 				leia(condicao)
			 				limpa()
			 			}se(condicao == "nao"){
			 				escreva("Obrigado por usar o nosso sistema de cálculo de volume! Até o proximo software!!")
			 			}
			 		}
				}
				
			}
		}
}
	funcao real volumecubo(real x){
		real resultado
			resultado = x*x*x
		
		retorne resultado
	}
	funcao real volumeparalelepipedo(real h, real x, real y){
		real resultado
		resultado = h * x * y
		retorne resultado
	}
	funcao real volumecilindro(real h, real r){
		real resultado
		resultado = 3.14 * (r*r) * h
		retorne resultado
	}
	funcao real volumeesfera(real r){
		real resultado
		resultado = (4/3) * 3.14 * (r*r*r)
		retorne resultado
	}
	

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2650; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */