package main.java.one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 23));
        estudantes.add(new Estudante("Lucas", 19));
        estudantes.add(new Estudante("Laura", 21));
        estudantes.add(new Estudante("Joao", 22));
        estudantes.add(new Estudante("Sofia", 20));
        estudantes.add(new Estudante("Henrique", 18));
        estudantes.add(new Estudante("Larissa", 23));

        System.out.println("-- ordem de inserção --");
        System.out.println(estudantes+ "\n");

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("-- ORDENADO PELA IDADE --");
        System.out.println(estudantes+ "\n");

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("-- ORDEM REVERSA DA IDADE --");
        System.out.println(estudantes+ "\n");

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("--- ORDENADO PELA IDADE (method reference) ---");
        System.out.println(estudantes+ "\n");

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- REVERSA (method reference) ---");
        System.out.println(estudantes+ "\n");

        Collections.sort(estudantes);
        System.out.println("--- ORDENADO PELA IDADE DE NOVO (interface comparable) ---");
        System.out.println(estudantes + "\n");

        Collections.sort(estudantes, new EstudanteOrdemReversaIdadeComparator());
        System.out.println("--- REVERSA DE NOVO (interface comparable) ---");
        System.out.println(estudantes + "\n");

    }
}
