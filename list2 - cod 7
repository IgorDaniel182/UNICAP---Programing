//Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o
//preço unitário. Calcular e escrever o total (total = quantidade adquirida × preço unitário),
//o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
//• Se quantidade <= 5 o desconto será de 2%
//• Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//• Se quantidade > 10 o desconto será de 5%

programa
{
	
	funcao inicio()
	{
	  cadeia nome
	  inteiro qtd
	  real preco, total, totalfinal

	  escreva("Digite o nome do produto: ")
	  leia(nome)
	  escreva("Digite a quantidade desse produto: ")
	  leia(qtd)
	  escreva("Digite o preço do produto: ")
	  leia(preco)

	  total = qtd * preco
	  se(qtd <= 5){
	  	totalfinal = total - (total * 2/100)
	  	escreva("O valor final da compra do ",nome ," será ", totalfinal)
	  }senao se(qtd > 5 e qtd <10){
	  	totalfinal = total - (total * 3/100)
	  	escreva("O valor final da compra do ",nome ," será ", totalfinal)
	  }senao se(qtd > 10){
	  	totalfinal = total - (total * 5/100)
	  	escreva("O valor final da compra do ",nome ," será ", totalfinal)
	  }
	}
}
