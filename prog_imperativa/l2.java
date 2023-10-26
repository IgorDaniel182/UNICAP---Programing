public class l2 {
    public static void main(String args[]){
        int a[] = {4,2,12,16,6};
        int b[] = {2,4,6,8,10};
        int c[] = new int[10];

        c = subtrair(a, b);
        System.out.println("Vetor c: ");
        exibirVetor(c);


    }
    public static int[] subtrair(int[]a, int[]b){
        int[] c = new int[5];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i] - b[i];
        }
        return c;
    }
    public static void exibirVetor( int x[]){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + "|");
        }
    }
}
