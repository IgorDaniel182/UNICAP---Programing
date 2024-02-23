package listaPOOMetodos.MonitorAtividadesFisicas;

public class AtividadeFisica {
    String atividadeFisica;
    int duracao;
    int caloriasQueimadas;

    void registrarAtividade(int novaDuracao)
    {
        duracao = novaDuracao;
        caloriasQueimadas = 2 * duracao;
    }
    void alterarTipoDeAtividade(String novoTipo)
    {
        atividadeFisica = novoTipo;
    }
    void exibirAtividade()
    {
        System.out.println("A atividade " + atividadeFisica + " tem duracao de " + duracao + "min e queima " + caloriasQueimadas + " calorias.");
    }
    void comparaCalorias(AtividadeFisica outraAtividadeFisica)
    {
        System.out.println("A atividade " + atividadeFisica + " queima " + caloriasQueimadas + "\nE a atividade " + outraAtividadeFisica.atividadeFisica + " queima " + caloriasQueimadas);
    }
}
