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
		float n;
		
		dados = new Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		n = dados.nextFloat();
		
		if( n % 2 == 0){
		    n = n + 5;
		    System.out.print("Número par! Adicionando 5 ao valor.... = " + n);
		}else{
		    n = n + 8;
		    System.out.print("Número Impar! Adicionando 8 ao valor... = " + n);
		}
	}
}
