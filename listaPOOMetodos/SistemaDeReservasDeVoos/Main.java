package listaPOOMetodos.SistemaDeReservasDeVoos;

public class Main {
    public static void main(String[] args) {
        ReservaVoo obj1 = new ReservaVoo();

        obj1.classe = "Primeira classe";
        obj1.nomePassageiro = "Chaco";
        obj1.numeroVoo = "0123123012-32";
        
        obj1.exibirDetalhes();
    }
}
