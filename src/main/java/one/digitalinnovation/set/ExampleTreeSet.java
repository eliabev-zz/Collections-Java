package main.java.one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCities = new TreeSet<>();

        treeCities.add("Porto Alegre");
        treeCities.add("Floripa");
        treeCities.add("Curitiba");
        treeCities.add("San Pablo");
        treeCities.add("Rio de Janeiro");
        treeCities.add("Belorizonte");
        System.out.println(treeCities);

        System.out.println(treeCities.first());
        System.out.println(treeCities.last());
        System.out.println(treeCities);

        System.out.println(treeCities.lower("Floripa"));
        System.out.println(treeCities.higher("Floripa"));
        System.out.println(treeCities.lower("Florida"));

        System.out.println(treeCities.pollFirst());
        System.out.println(treeCities.pollLast());
        System.out.println(treeCities);

        Iterator<String> iterator = treeCities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String cidade : treeCities) {
            System.out.println(cidade);
        }
    }
}
