package main.java.one.digitalinnovation.comparators;

import java.util.Comparator;

public class CarroOrdemReversaComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro o1, Carro o2) {
        return o2.getAno() - o1.getAno();
    }
}
