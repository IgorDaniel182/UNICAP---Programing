/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		Scanner dados;
		float a,b,c,maior,meio,menor;
		
		dados = new Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		a = dados.nextFloat();
		System.out.print("Digite o segundo numero: ");
		b = dados.nextFloat();
		System.out.print("Digite o terceiro numero: ");
		c = dados.nextFloat();
		
		
		if(a > b && b > c){
		    maior = a;
		    meio = b;
		    menor = c;
		    System.out.print("Maior: " + maior + "|| Meio: " + meio + "|| Menor: " + menor);
		    
		    
		}else if(a > c && c > b){
		    maior = a;
		    meio = c;
		    menor = b;
		    System.out.print("Maior: " + maior + "|| Meio: " + meio + "|| Menor: " + menor);
		    
		}else if(b > a && a > c){
		    maior = b;
		    meio = a;
		    menor = c;
		    System.out.print("Maior: " + maior + "|| Meio: " + meio + "|| Menor: " + menor);
		    
		}else if(b > c && c > a){
		    maior = b;
		    meio = c;
		    menor = a;
		    System.out.print("Maior: " + maior + "|| Meio: " + meio + "|| Menor: " + menor);
		}else if(c > a && a > b){
		    maior = c;
		    meio = a;
		    menor = b;
		    System.out.print("Maior: " + maior + "|| Meio: " + meio + "|| Menor: " + menor);
		    
		}else if(c > b && b > a){
		    maior = c;
		    meio = b;
		    menor = a;
		    System.out.print("Maior: " + maior + "|| Meio: " + meio + "|| Menor: " + menor);
		}else{
		    System.out.print("Error!");
		}
	}
}
