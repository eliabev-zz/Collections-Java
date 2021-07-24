package main.java.one.digitalinnovation.optionals;

import java.util.Optional;

public class ExercicioOptional {
    public static void main(String[] args) {
        Optional<String> exercicioOpcional = Optional.of("Com valor");
        System.out.println("-- Valor opcional presente --");
        exercicioOpcional.ifPresentOrElse(System.out::println, () -> System.out.println("Não presente"));

        if (exercicioOpcional.isPresent()) {
            String valor = exercicioOpcional.get();
            System.out.println("\nDentro da variável:");
            System.out.println(valor);
        }

        exercicioOpcional.map((valor) -> valor.concat(" alterado!")).ifPresent(System.out::println);

        Optional<String> nullOpcional = Optional.ofNullable(null);
        System.out.println("\nValor opcional nulo");
//        nullOpcional.orElseThrow(IllegalStateException::new);
        nullOpcional.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

    }
}
