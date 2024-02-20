package listaPOO.ControleEventos;

public class Main {
    public static void main(String[] args) {
        Evento obj1 = new Evento();
        Evento obj2 = new Evento();
        Evento obj3 = new Evento();

        obj1.data = "10/03/2022";
        obj1.local = "Recife";
        obj1.nome = "O brega mais bregoso";
        
        obj2.data = "12/05/2022";
        obj2.local = "Recife";
        obj2.nome = "Highground";
        
        obj3.data = "15/06/2022";
        obj3.local = "Recife";
        obj3.nome = "Pinheiros Alegre";

        System.out.print(obj1.nome + " - " + obj1.local + " - " + obj1.data + "\n");
        System.out.print(obj2.nome + " - " + obj2.local + " - " + obj2.data + "\n");
        System.out.print(obj3.nome + " - " + obj3.local + " - " + obj3.data);
        
    }
}
