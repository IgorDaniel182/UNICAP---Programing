package listaPOOMetodos.SistemaVotacao;

public class Main {
    public static void main(String[] args) {
        Votacao obj1 = new Votacao();
        obj1.candidato = "IGOR";
        obj1.votosRecebidos = 4;

        Votacao obj2 = new Votacao();
        obj2.candidato = "ADELSON";
        obj2.votosRecebidos = 2;

        obj1.comparaVotos(obj2);
    }
}
