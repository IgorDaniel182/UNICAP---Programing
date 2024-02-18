/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lista1exc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dado;
        float a,b,c;
        
        dado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        a = dado.nextFloat();
        System.out.print("Digite outro numero: ");
        b = dado.nextFloat();
        System.out.print("Digite outro numero: ");
        c = dado.nextFloat();
        
        if(a+b < c){
            System.out.print("O terceiro valor é maior que os 2 primeiros! ");
        }else{
            System.out.print("O terceiro valor é menor que os 2 primeiros! ");
        }
    }
    
}
