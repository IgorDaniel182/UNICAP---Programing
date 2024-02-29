package codeTestJava.construtores.Universidades;

public class Universidade {
    String nome;
    int quantidadeAlunosInscritos;
    String cursos [] = new String[3];

    Universidade(String nome, int quantidadeAlunosInscritos, String [] cursos)
    {
        this.nome = nome;
        this.quantidadeAlunosInscritos = quantidadeAlunosInscritos;
        this.cursos = cursos;
    }
 }
