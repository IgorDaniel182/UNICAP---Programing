public class trocaValores
{
    public static void main(String[]args)
    {
        
        int a = 2;
        int b = 3;

        // método XOR para a troca dos valores:
        a = a^b;
        b = b^a;
        a = a^b;

        System.out.print(a + " " + b);
 
    }   
    public static void trocaValores(int num1, int num2)
    {
        
    }
}