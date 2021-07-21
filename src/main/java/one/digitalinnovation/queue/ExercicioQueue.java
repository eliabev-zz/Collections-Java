package main.java.one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        String primeiroNome = nomes.peek();

        System.out.println(primeiroNome);
        System.out.println(nomes);

        String removePrimeiro = nomes.poll();
        System.out.println(removePrimeiro);
        System.out.println(nomes);

        nomes.add("Daniel");
        System.out.println(((LinkedList<String>) nomes).indexOf("Daniel"));
        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println(nomes.isEmpty());

        System.out.println(nomes.contains("Carlos"));
        
    }
}
