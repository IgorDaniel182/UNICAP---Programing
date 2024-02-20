/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class lista1exc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,c;
        Scanner dados;
        
        dados = new Scanner(System.in);
        System.out.print("Digite um numero para A: ");
        a = dados.nextFloat();
        System.out.print("Digite um número para B: ");
        b = dados.nextFloat();
        
        if(a == b){
            c = a+b;
            System.out.print("O valor de C é: " + c + " soma");
                   
        }else{
            c = a * b;
            System.out.print("O resultado de C é: " + c + " multiplicação ");
        }
        dados.close();

            
        
        
    }
    
}
