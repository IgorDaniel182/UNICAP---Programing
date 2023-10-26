public class l4 {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        int c[] = new int [5];

        c = quadradopreencher(a, c);
        exibirVetor(c);

    }
    
    public static int[] quadradopreencher(int a[], int c[]){
        for(int i = 0; i < a.length; i++){
            c[i] = (a[i]*a[i]); 
        }
        return c;
    }
    public static void exibirVetor( int x[]){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + "|");
        }
    }
}
