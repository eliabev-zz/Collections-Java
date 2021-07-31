package main.java.one.digitalinnovation.desafio;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Float[] teste = new Float[6];

        Scanner demo = new Scanner(System.in);

//takes an integer input


//consuming the <enter> from input above

//        for (int i = 0; i < teste.length; i++) {
//
//            var a = demo.nextLine();
//            teste[i] = Float.parseFloat(a);
//
//        }
        int i = 0;
        while (i < 6) {
            var a = demo.nextLine();
            if (Float.parseFloat(a) != 0) {
                teste[i] = Float.parseFloat(a);
                i++;
            }
        }


//for-each loop to print the string
        int total = 0;
        for (Float val : teste) {
            if (val > 0){
                total++;
            }

// close the scanner

            demo.close();

        }
        if (total > 1){
            System.out.println(total + " valores positivos");
        }
        if (total == 1){
            System.out.println("1 valor positivo");
        }
    }
}