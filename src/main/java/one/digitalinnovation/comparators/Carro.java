package main.java.one.digitalinnovation.comparators;

public class Carro implements Comparable<Carro> {

    private String modelo;
    private Integer ano;

    public Carro(String modelo, Integer ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() { return modelo; }
    public Integer getAno() { return ano; }

    @Override
    public String toString() { return modelo + " - " + ano;}

    @Override
    public int compareTo(Carro o) {
        return this.getAno() - o.getAno();
    }
}
