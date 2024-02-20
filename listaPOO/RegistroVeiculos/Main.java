package listaPOO.RegistroVeiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo obj1 = new Veiculo();
        Veiculo obj2 = new Veiculo();
        Veiculo obj3 = new Veiculo();

        obj1.ano = 2002;
        obj1.marca = "Renault";
        obj1.placa = "XX-XXXX";
        
        obj2.ano = 2018;
        obj2.marca = "Gol";
        obj2.placa = "XX-XXXX";
        
        obj3.ano = 2018;
        obj3.marca = "Fiat";
        obj3.placa = "XX-XXXX";

        System.out.print(obj1.ano + " - " + obj1.marca + " - " + obj1.placa + "\n");
        System.out.print(obj2.ano + " - " + obj2.marca + " - " + obj2.placa + "\n");
        System.out.print(obj3.ano + " - " + obj3.marca + " - " + obj3.placa);

    }
}
