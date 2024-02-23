package listaPOOMetodos.MonitorAtividadesFisicas;

public class Main {
    public static void main(String[] args) {
        AtividadeFisica obj1 = new AtividadeFisica();
        AtividadeFisica obj2 = new AtividadeFisica();

        obj1.atividadeFisica = "Musculacao";
        obj1.registrarAtividade(20);
        obj1.exibirAtividade();

        obj2.atividadeFisica = "Correr";
        obj2.registrarAtividade(40);
        obj2.exibirAtividade();

        obj1.comparaCalorias(obj2);
    }
}
