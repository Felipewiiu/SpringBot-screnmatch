package br.com.alura.screnmatch.exercicios;

import br.com.alura.screnmatch.modeloExercicio.Aluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploFletmap {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", 101, List.of("node_js", "react"));
        Aluno aluno1 = new Aluno("Carla", 102, List.of("Java", "Angula"));
        Aluno aluno2 = new Aluno("Joana", 103, List.of(".net", "view_js"));


        List<Aluno> lista = Arrays.asList(aluno, aluno1, aluno2);


        lista.stream()
                .forEach(e -> System.out.println(e.getCursos()));












    }
}
