public class l3 {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10,11,12,13,14,15};
        int c[] = new int [15];

        c = preencher(a,b,c);

        exibirVetor(c);

    }
    public static int[] preencher(int a[], int b[], int c[]){
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            c[i+5] = b[i];
        }
        return c;
    }
    public static void exibirVetor( int x[]){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + "|");
        }
    }
}