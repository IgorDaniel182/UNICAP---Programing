package listaPOO.RedeSocial;

public class Main {
    public static void main(String[] args) {
        PerfilUsuario obj1 = new PerfilUsuario();
        PerfilUsuario obj2 = new PerfilUsuario();
        PerfilUsuario obj3 = new PerfilUsuario();

        obj1.bio = "Viva a natureza";
        obj1.nome = "Samara";
        obj1.numerosSeguidores = 1202;

        obj2.bio = "Fã de star wars";
        obj2.nome = "Jorge";
        obj2.numerosSeguidores = 122;

        obj3.bio = "Gamer e Influencer";
        obj3.nome = "Marcia";
        obj3.numerosSeguidores = 1452;

        System.out.print(obj1.nome + " - " + obj1.bio + " - " + obj1.numerosSeguidores + "\n");
        System.out.print(obj2.nome + " - " + obj2.bio + " - " + obj2.numerosSeguidores + "\n");
        System.out.print(obj3.nome + " - " + obj3.bio + " - " + obj3.numerosSeguidores);

    }
}
