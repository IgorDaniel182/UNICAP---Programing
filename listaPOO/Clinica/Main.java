package listaPOO.Clinica;

public class Main {
    public static void main(String[] args) {
        Paciente obj1 = new Paciente();
        Paciente obj2 = new Paciente();
        Paciente obj3 = new Paciente();

        obj1.nome = "Felipe";
        obj1.idade = 20;
        obj1.diagnostico = "Gripe";

        obj2.nome = "Marta";
        obj2.idade = 35;
        obj2.diagnostico = "Tuberlucose";

        obj3.nome = "Fabiana";
        obj3.idade = 20;
        obj3.diagnostico = "Pnemonia";

        System.out.print(obj1.nome + " - " + obj1.idade + " - " + obj1.diagnostico + "\n");
        System.out.print(obj2.nome + " - " + obj2.idade + " - " + obj2.diagnostico + "\n");
        System.out.print(obj3.nome + " - " + obj3.idade + " - " + obj3.diagnostico);

    }
}
