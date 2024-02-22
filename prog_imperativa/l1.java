package prog_imperativa;

import java.util.*;

public class l1{
    public static void main(String args[]){
        int x[] = new int[8];
        Scanner input = new Scanner(System.in);
        preencher(x, input);

        exibirVetor(x);


    }public static void preencher( int x[], Scanner input){
        for(int i = 0; i < x.length; i++){
            System.out.print("Digite um valor para a posição " + i + " do vetor: ");
            x[i] = input.nextInt();
        }
    }
    public static void exibirVetor( int x[]){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + "|");
        }
    }
}