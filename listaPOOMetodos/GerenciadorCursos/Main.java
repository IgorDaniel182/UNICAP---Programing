package listaPOOMetodos.GerenciadorCursos;

public class Main {
    public static void main(String[] args) {
        Curso obj1 = new Curso();
        obj1.nome = "Sistemas para internet";
        obj1.categoria = "TI";
        obj1.cargaHoraria = 300;
        obj1.numeroAlunosInscritos = 12;

        obj1.exibiInformacoes();
        obj1.atualizaCargaHoraria(200);
        obj1.cancelarInscricao();
        obj1.exibiInformacoes();
    }
}
