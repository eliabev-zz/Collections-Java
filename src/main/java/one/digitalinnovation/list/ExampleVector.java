package main.java.one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basketball");
        esportes.add("Futebol Americano");
        esportes.add("Voleiball");

        System.out.println(esportes);

        esportes.set(0, "Ping Pong");

        esportes.remove(2);

        esportes.remove("Voleiball");

        System.out.println(esportes.get(0));

        for (String esporte : esportes) {
            System.out.println(String.format("%sº: ", esportes.indexOf(esporte)+1) + esporte);
        }
    }


}
