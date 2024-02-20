package Livraria;
public class Main
{
    public static void main(String [] args)
    {
        Livros l1 = new Livros();
        Livros l2 = new Livros();
        Livros l3 = new Livros();

        l1.autor = "Chico";
        l1.anoLancamento = 2000;
        l1.titulo = "The creator";

        l2.autor = "Marcos";
        l2.anoLancamento = 2000;
        l2.titulo = "The Leader";

        l3.autor = "Andre";
        l3.anoLancamento = 2000;
        l3.titulo = "The Senator";


        System.out.print(l1.autor + " - " + l1.titulo + " - " + l1.anoLancamento + "\n" + l2.autor + " - " + l2.titulo + " - " + l2.anoLancamento + "\n" +l3.autor + " - " + l3.titulo + " - " + l3.anoLancamento);
    }
}