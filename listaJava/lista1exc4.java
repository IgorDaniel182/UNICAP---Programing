/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner; 
public class lista1exc4

{
	public static void main(String[] args) {
	    float n1;
	    Scanner dados;
	    dados = new Scanner(System.in);
	    
	    System.out.print("Digite um numero: ");
	    n1 = dados.nextFloat();
	    if ( n1 > 0 ){
	        n1 = n1 * 2;
	       System.out.print("O dobro do valor é: " + n1 );
	    }else{
	        n1 = n1 * 3;
	        System.out.print("O triplo do valor é: " + n1);
	    }
	        
	}
}
