package listaPoo_1.Livros;

public class Main {
    public static void main(String[] args) {
        Livros obj1 = new Livros();
        Livros obj2 = new Livros();
        Livros obj3 = new Livros();

        obj1.anoPublicacao = 2002;
        obj1.autor = "José";
        obj1.titulo = "Os Oz";
        
        obj2.anoPublicacao = 2004;
        obj2.autor = "Maria";
        obj2.titulo = "Far far way";

        obj3.anoPublicacao = 2007;
        obj3.autor = "Mariana";
        obj3.titulo = "Dark land";

        System.out.print(obj1.anoPublicacao + " - " + obj1.autor + " - " + obj1.titulo + "\n");
        System.out.print(obj2.anoPublicacao + " - " + obj2.autor + " - " + obj2.titulo + "\n");
        System.out.print(obj3.anoPublicacao + " - " + obj3.autor + " - " + obj3.titulo );

    }
}
