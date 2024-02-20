package Livraria;
public class Main
{
    public static void main(String [] args)
    {
        Livraria l1 = new Livraria();
        Livraria l2 = new Livraria();
        Livraria l3 = new Livraria();
        
        l1.titulo = "As aventuras de nárnia";
        l1.autor = "Sivirino Assunção";
        l1.anoLancamento = 2009;

        l2.titulo = "Python para leigos";
        l2.autor = "Oscar Cesar";
        l2.anoLancamento = 2016;

        l3.titulo = "A lendária curva";
        l3.autor = "Arthon Senna";
        l3.anoLancamento = 2010;

        System.out.print(l1.titulo + l1.autor + l1.anoLancamento + "\n" + l2.titulo + l2.autor + l2.anoLancamento + "\n" + l3.titulo + l3.autor + l3.anoLancamento );

    }
}
