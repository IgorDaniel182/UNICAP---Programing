package listaPOOMetodos.GerenciadorCursos;

public class Curso {
    String nome;
    String categoria;
    int cargaHoraria;
    int numeroAlunosInscritos;

    public void inscreverAlunos()
    {
        numeroAlunosInscritos += 1;
    }
    public void cancelarInscricao()
    {   
        if(numeroAlunosInscritos >= 1)
        {
            numeroAlunosInscritos -= 1;
        }
    }
    public void atualizaCargaHoraria(int novaCargaHoraria)
    {
        cargaHoraria = novaCargaHoraria;
    }
    public void exibiInformacoes()
    {
        System.out.println(nome + " da área de " + categoria + " tem " + cargaHoraria + "hrs de carga horária e possue " + numeroAlunosInscritos + " alunos inscritos.");
    }

}
