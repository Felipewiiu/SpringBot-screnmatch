package br.com.alura.screnmatch.exercicios;

import java.util.Arrays;
import java.util.List;

public class ExercicioStreem {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Felipe", "Carla", "Aline", "Jaqueline");
        // isso é um fuxo de dados e podemos fazer com ele um fluxo de operações

        nomes.stream()
                .sorted()
                .limit(4)
                .filter(n -> n.startsWith("J"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }

    //Neste exemplo foram o stream vai fazendo operações encadeadas.
}
