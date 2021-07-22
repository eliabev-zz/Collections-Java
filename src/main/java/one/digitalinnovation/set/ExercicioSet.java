package main.java.one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioSet {
    public static void main(String[] args) {
        TreeSet<Integer> inteiros = new TreeSet<>();
        inteiros.add(3);
        inteiros.add(88);
        inteiros.add(20);
        inteiros.add(44);
        inteiros.add(3);

        Iterator<Integer> iterator = inteiros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        inteiros.pollFirst();
        System.out.println(inteiros);

        inteiros.add(23);

        System.out.println(inteiros.size());
        System.out.println(inteiros);

        System.out.println(inteiros.isEmpty());
    }
}
