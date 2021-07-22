package main.java.one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparatorsList {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Etios", 2021));
        carros.add(new Carro("Civic", 2020));
        carros.add(new Carro("Corolla", 2018));
        carros.add(new Carro("Elantra", 2021));
        carros.add(new Carro("Voyage", 2014));
        carros.add(new Carro("Tucson", 2020));
        carros.add(new Carro("Celta", 2008));

        System.out.println("ORDEM DE INSERÇÃO");
        System.out.println(carros + "\n");

        carros.sort(Comparator.comparingInt(Carro::getAno));
        System.out.println("ORDENADO PELO ANO (method reference");
        System.out.println(carros + "\n");

        Collections.sort(carros, new CarroOrdemReversaComparator());
        System.out.println("ORDEM REVERSA (method comparable)");
        System.out.println(carros + "\n");

        carros.sort((first, second) -> first.getAno() - second.getAno());
        System.out.println("ORDENADO COM SORT E LAMBDA");
        System.out.println(carros + "\n");


    }
}
