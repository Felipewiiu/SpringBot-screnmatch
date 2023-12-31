package br.com.alura.screnmatch.exercicios;

import br.com.alura.screnmatch.modeloExercicio.Carro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExerciciosComFilter {
    public static void main(String[] args) {
        Carro ford = new Carro("ford", 2000, 1995);
        Carro Fiat = new Carro("fiat", 30000, 2022);
        Carro chevrollet = new Carro("chevrollet", 40000, 2023);


//        List<Carro> carroList = new ArrayList<>();
//        carroList.add(ford);
//        carroList.add(Fiat);
//        carroList.add(chevrollet);

        // Outra maneira de se adicionar elementos dentro de um array

        List<Carro> carroList = Arrays.asList(ford, Fiat, chevrollet);

        carroList.stream().filter(c -> c.getAno() > 2000)
                .forEach(Carro::getPreco);// usando a referência ao método

    }
}
