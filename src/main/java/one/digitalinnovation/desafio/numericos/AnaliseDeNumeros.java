package main.java.one.digitalinnovation.desafio.numericos;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;
//        float x = leitor.nextFloat() ;

//continue a solução
        for (int i = 0; i < 5; i++) {
            float x = leitor.nextFloat();

            if (x % 2 == 1 || x % 2 == -1) {
                impares++;
            }
            else {
                pares++;
            }
            if (x > 0) {
                positivos++;
            }
            if (x < 0) {
                negativos++;
            }
        }
//insira suas variaveis corretamente
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }

}