package listaPOOMetodos.GerenciadorTarefas;

public class Tarefa {
    String descricao;
    boolean concluida;
    int prioridade;
    String msgConcluida = "não foi";

    public void concluirTarefa()
    {
        concluida = true;
        msgConcluida = "foi";
    }
    public void mudarPrioridade(int novaPrioridade)
    {
        prioridade = novaPrioridade;
    }
    public void exibirTarefa()
    {
        System.out.println("A tarefa " + descricao + " tem prioridade " + prioridade + " e " + msgConcluida + " concluida!" );
    }
    public void resetarTarefa()
    {
        concluida = false;
        msgConcluida = "não foi";
    }
    
}
