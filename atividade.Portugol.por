programa { inclua biblioteca Matematica --> mat
  funcao inicio() {

          real lcubo, resultadoC, alturaP, comprimentoP, larguraP, resultadoP, raioE, resultadoE, raioCI,alturaCI, resultadoCI 
          inteiro opc
          cadeia dnv
           
          dnv = "sim"

          
          
        enquanto(dnv == "sim"){
          

          menu()
          escreva("Op��o: ")
          leia(opc)

          escolha(opc){
            caso 1:
            escreva("Digite o lado do cubo: ")
            leia(lcubo)
            resultadoC = volumeC(lcubo)
            escreva("O volume do cubo �: ", resultadoC)
            pare
            caso 2:
            escreva("Digite a altura do paralelepipedo: ")
            leia(alturaP)
            escreva("Digite a comprimento do paralelepipedo: ")
            leia(comprimentoP)
            escreva("Digite a largura do paralelepipedo: ")
            leia(larguraP)
            resultadoP = volumeP(alturaP, comprimentoP, larguraP)
            escreva("O volume do paralelepipedo �: ", resultadoP)
            pare 
            caso 3:
            escreva("Digite o raio da esfera: ")
            leia(raioE)
            resultadoE = volumeE(raioE)
            escreva("O volume da esfera �: ", resultadoE)
            pare
            caso 4:
            escreva("Digite o raio do cilindro: ")
            leia(raioCI)
            escreva("Digite a altura do cilindro: ")
            leia(alturaCI)
            resultadoCI = volumeCI(raioCI, alturaCI)
            escreva("O volume do cilindro � ", resultadoCI)
            pare
            caso contrario: 
            escreva("Erro! ")

          }

          escreva("\n Deseja calcular outro volume? (sim/nao) ")
          leia(dnv)

        }
        escreva(" Obrigado por utilizar o nosso programa de calculo de volume!")
      }
      funcao real volumeC( real x){
        real resultado
        resultado = x*x*x
        retorne resultado
      }funcao real volumeP(real x, real y, real h){
        real resultado
        resultado = x * y * h
        retorne resultado
      }funcao real volumeE(real x){
        real resultado
        resultado = (4/3) * mat.PI * x
        retorne resultado
      }funcao real volumeCI(real x, real h){
        real resultado 
        resultado = mat.PI * (x * x ) * h
        retorne resultado
      }funcao cadeia menu(){
        escreva("Op��o 1 - Cubo\n")
        escreva("Op��o 2 - Paralelepipedo\n")
        escreva("Op��o 3 - Esfera\n")
        escreva("Op��o 4 - Cilindro\n")
        escreva("Op��o 0 - Sair \n")

      }



  }
}
