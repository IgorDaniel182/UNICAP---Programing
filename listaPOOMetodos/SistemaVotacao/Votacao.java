package listaPOOMetodos.SistemaVotacao;

public class Votacao {
    String candidato;
    int votosRecebidos;

    public void adicionarVoto()
    {
        votosRecebidos += 1;
    }
    public void zerarVotos()
    {
        votosRecebidos = 0;
    }
    public void comparaVotos(Votacao outraVotacao)
    {
        if(votosRecebidos > outraVotacao.votosRecebidos)
        {
            System.out.println("O CANDIDATO " + candidato + " TEM MAIS VOTOS QUE O CANDIDATO " + outraVotacao.candidato);
        }
        else
        {
            System.out.println("O CANDIDATO " + outraVotacao.candidato + " TEM MAIS VOTOS QUE O CANDIDATO " + candidato);
        }
    }
}
