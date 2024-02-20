package listaPOO.Alunos;

public class Main {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        Aluno obj2 = new Aluno();
        Aluno obj3 = new Aluno();

        obj1.idade = 12;
        obj1.nome = "Luisa";
        obj1.serie = "9° ano";

        obj2.idade = 12;
        obj2.nome = "Blackbeard";
        obj2.serie = "9° ano";

        obj3.idade = 13;
        obj3.nome = "Marco";
        obj3.serie = "8° ano";

        System.out.print(obj1.idade + " - " + obj1.nome + " - " + obj1.serie);
        System.out.print(obj2.idade + " - " + obj2.nome + " - " + obj2.serie);
        System.out.print(obj3.idade + " - " + obj3.nome + " - " + obj3.serie);
    }
}
