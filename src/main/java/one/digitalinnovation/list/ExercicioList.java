package main.java.one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(String.format("%sº: ", nomes.indexOf(nome)+1) + nome);
        }

        nomes.set(2, "Roberto");

        System.out.println(nomes.get(1));

        System.out.println(nomes.get(4));

        nomes.remove("João");

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Juliano"));

        List<String> nomesAux = new ArrayList<>();

        nomesAux.add("Ismael");

        nomesAux.add("Rodrigo");

        /*for (String nome : nomesAux) {
            nomes.add(nome);
        }*/

        nomes.addAll(nomesAux);

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        System.out.println(nomes.isEmpty());

    }
}
