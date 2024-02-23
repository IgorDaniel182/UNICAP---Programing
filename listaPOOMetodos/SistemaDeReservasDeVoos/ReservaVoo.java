package listaPOOMetodos.SistemaDeReservasDeVoos;

public class ReservaVoo {
    String numeroVoo;
    String nomePassageiro;
    String classe;

    void alterarClasse(String novaClasse)
    {   
        classe = novaClasse;
    }
    void cancelarReserva()
    {
        numeroVoo = "";
        nomePassageiro = "";
        classe = "";
    }
    void confirmarReserva()
    {
        System.out.println("Reserva confirmada!");
    }
    void exibirDetalhes()
    {

        
        System.out.println("Número voo: "+ numeroVoo + "\nNome passageiro: " + nomePassageiro + "\nClasse: " + classe);
    }

}
