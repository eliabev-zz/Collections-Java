package main.java.one.digitalinnovation.list;

import java.util.*;

public class ExampleList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Jose");
        nomes.add("Franco");
        nomes.add("Adriana");
        nomes.add("Paulo");
        nomes.add("Vitor");
        nomes.add("Florença");
        nomes.add("Claudia");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Lucas");

        System.out.println(nomes);

        nomes.remove(3);

        System.out.println(nomes);

        nomes.remove("Claudia");

        System.out.println(nomes);

        nomes.remove("Elaibe");

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nome);

        System.out.println(nomes.get(0));

        int indice = nomes.indexOf("Ricardo");

        System.out.println(indice);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Jose");

        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temeu = nomes.contains("Eliabe");

        System.out.println(temeu);

        boolean temFilho = nomes.contains("Lucas");

        System.out.println(temFilho);

        boolean temCoisa = nomes.isEmpty();

        System.out.println(temCoisa);

        for (String nomeDoNome : nomes) {
            System.out.println(nomeDoNome);
        }

        System.out.println(nomes);

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }

        nomes.clear();

        temCoisa = nomes.isEmpty();

        System.out.println(temCoisa);


    }
}
