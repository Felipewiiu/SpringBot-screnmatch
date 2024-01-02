package br.com.alura.screnmatch.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExemploFindAnyParallelStream {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        // Utilizando parallelStream para encontrar um elemento qualquer em paralelo
        Optional<Integer> numeroQualquer = numeros.parallelStream()
                .peek(e -> System.out.println("Aqui os números antes de filtrar " + e.toString()) )
                .filter(numero -> numero % 10 == 0) // Filtra os números que são múltiplos de 10
                .peek(e -> System.out.println("Aqui os números depois de filtrado " + e.toString()) )
                .findAny();

        if (numeroQualquer.isPresent()) {
            System.out.println("Encontrado: " + numeroQualquer.get());
        } else {
            System.out.println("Nenhum número encontrado.");
        }
    }
}
