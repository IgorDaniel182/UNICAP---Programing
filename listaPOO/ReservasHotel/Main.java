package listaPOO.ReservasHotel;

public class Main {
    public static void main(String[] args) {
        Reservas obj1 = new Reservas();
        Reservas obj2 = new Reservas();
        Reservas obj3 = new Reservas();
    
        obj1.nomeHospede = "Luis";
        obj1.numerosNoites = 3;
        obj1.tipoQuarto = "Simples";
        
        obj2.nomeHospede = "Xin";
        obj2.numerosNoites = 5;
        obj2.tipoQuarto = "Duplo";
        
        obj3.nomeHospede = "Luffy";
        obj3.numerosNoites = 2;
        obj3.tipoQuarto = "Suíte";

        System.out.print(obj1.nomeHospede + " - " + obj1.numerosNoites + " - " + obj1.tipoQuarto + "\n");
        System.out.print(obj2.nomeHospede + " - " + obj2.numerosNoites + " - " + obj2.tipoQuarto + "\n");
        System.out.print(obj3.nomeHospede + " - " + obj3.numerosNoites + " - " + obj3.tipoQuarto);
        
    }
}
