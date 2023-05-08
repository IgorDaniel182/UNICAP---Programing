programa { inclua biblioteca Matematica --> mat
  funcao inicio() {

          real lcubo, resultadoC, alturaP, comprimentoP, larguraP, resultadoP, raioE, resultadoE, raioCI,alturaCI, resultadoCI 
          inteiro opc
          cadeia dnv
           
          dnv = "sim"

          
          
        enquanto(dnv == "sim"){
          

          menu()
          escreva("Opção: ")
          leia(opc)

          escolha(opc){
            caso 1:
            escreva("Digite o lado do cubo: ")
            leia(lcubo)
            resultadoC = volumeC(lcubo)
            escreva("O volume do cubo é: ", resultadoC)
            pare
            caso 2:
            escreva("Digite a altura do paralelepipedo: ")
            leia(alturaP)
            escreva("Digite a comprimento do paralelepipedo: ")
            leia(comprimentoP)
            escreva("Digite a largura do paralelepipedo: ")
            leia(larguraP)
            resultadoP = volumeP(alturaP, comprimentoP, larguraP)
            escreva("O volume do paralelepipedo é: ", resultadoP)
            pare 
            caso 3:
            escreva("Digite o raio da esfera: ")
            leia(raioE)
            resultadoE = volumeE(raioE)
            escreva("O volume da esfera é: ", resultadoE)
            pare
            caso 4:
            escreva("Digite o raio do cilindro: ")
            leia(raioCI)
            escreva("Digite a altura do cilindro: ")
            leia(alturaCI)
            resultadoCI = volumeCI(raioCI, alturaCI)
            escreva("O volume do cilindro é ", resultadoCI)
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
        escreva("Opção 1 - Cubo\n")
        escreva("Opção 2 - Paralelepipedo\n")
        escreva("Opção 3 - Esfera\n")
        escreva("Opção 4 - Cilindro\n")
        escreva("Opção 0 - Sair \n")

      }



  }
}
