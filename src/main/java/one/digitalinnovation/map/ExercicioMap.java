package main.java.one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();

        estados.put("SP", "Sao Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("ES", "Espirito Santo");
        estados.put("BA", "Bahia");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("PR", "Parana");
        estados.put("SC", "Santa Catarina");
        estados.put("GO", "Goias");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("PA", "Para");
        estados.put("CE", "Ceara");
        estados.put("PB", "Paraiba");
        estados.put("PE", "Pernambuco");
        estados.put("AM", "Amazonas");
        estados.put("AP", "Amapa");
        estados.put("AC", "Acre");
        estados.put("RO", "Rondonia");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");
        estados.put("MA", "Maranhao");
        estados.put("PI", "Piaui");
        estados.put("RR", "Roraima");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("AL", "Alagoas");

        estados.remove("RJ");
        estados.put("DF", "Distrito Federal");
        System.out.println(estados);

        System.out.println(estados.size());

        estados.values().remove("Mato Grosso do Sul");
        System.out.println(estados.size());

        for (Map.Entry<String, String> estado : estados.entrySet()) {
            System.out.println(estado.getValue().toUpperCase() + "(" + estado.getKey().toUpperCase() + ")");
        }

        System.out.println(estados.containsKey("SC"));
        System.out.println(estados.containsValue("Maranhao"));
    }
}
