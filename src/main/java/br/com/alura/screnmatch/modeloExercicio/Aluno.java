package br.com.alura.screnmatch.modeloExercicio;

import java.util.List;

public class Aluno {
    private String nome;
    private Integer matricula;
    private List<String> cursos;

    public Aluno(String nome, Integer matricula, List<String> cursos){
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public List<String> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return
                 "\n" + "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", cursos=" + cursos + "\n";

    }
}
