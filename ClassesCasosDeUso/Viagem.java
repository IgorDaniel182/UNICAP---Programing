package ClassesCasosDeUso;
public class Viagem {
    String id;
    String name;
    String cpf;
    String actualLocate;
    String destinyLocate;
    String horaSolicitacao;
    Usuario user;
    Motorista driver;
    Pagamento paymentValue;
    boolean happening;

    void startTravel()
    {
        happening = true;
    }
    void endTravel()
    {
        happening = false;
    }
    void payment()
    {
        paymentValue.done = true;
    }


}
