package listaPOOMetodos.GerenciadorTarefas;

public class Main {
    public static void main(String[] args) {
        Tarefa obj1 = new Tarefa();

        obj1.descricao = "Estudar Java";
        obj1.prioridade = 2;
    
        obj1.exibirTarefa();

        obj1.concluirTarefa();

        obj1.exibirTarefa();

        obj1.mudarPrioridade(1);

        obj1.resetarTarefa();

        obj1.exibirTarefa();
    }
}
