package main.java.one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Laura");
        estudantes.add("Tiago");
        estudantes.add("Sofia");
        estudantes.add("Joao");
        estudantes.add("Juliano");
        estudantes.add("Norma");
        estudantes.add("Francisco");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com a letra 'r' no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorna os elementos de novo: ");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Todos os elementos têm 'W' no nome? " + estudantes.stream().allMatch((elemento) ->
                elemento.contains("W")));

        System.out.println("Algum elemento com 'a' minusculo? " + estudantes.stream().anyMatch((elemento) ->
                elemento.contains("a")));

        System.out.println("Nenhum elemento com com 'a' minusculo? " + estudantes.stream().noneMatch((elemento) ->
                elemento.contains("a")));

        System.out.println("Retorna primeiro elemento da coleção");

        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Encadeada");
        System.out.println(estudantes.stream().peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
    }
}
