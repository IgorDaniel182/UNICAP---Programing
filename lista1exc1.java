

package com.mycompany.listajava;

import java.util.Scanner;

public class ListaJAVA {

    public static void main(String[] args) {
        Scanner dado;
        float n;
        
        dado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        n = dado.nextFloat();
        
        if( n % 2 == 0){
            System.out.print("Seu numero é par! ");
        }else{
            System.out.print("Seu numero é ímpar! ");
        }
        
        
    }
}
