package es.estech;

import java.util.Scanner;

public class Main {

    public static boolean esCapicua (String numero)
    {
        boolean result = false;

        if (numero.length() == 2){
            if (numero.charAt(0)==numero.charAt(1)){
                result = true;
            }
        }

        if (numero.length() == 3){
            if (numero.charAt(0)==numero.charAt(2)){
                result = true;
            }
        }

        return result;
    }

    public static boolean esPar (String numero){
        int n = Integer.parseInt(numero);
        if (n%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean esDivisiblePorTres (String numero){
        int n = Integer.parseInt(numero);
        if (n%3==0){
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String numberInSentence;

        System.out.println("Introduce un número entero");
        number = (int) Validate.validateNumeric(sc,0);

        //Parseo el número a una cadena
        numberInSentence = String.valueOf(number);
        if(number < 0){
            numberInSentence = numberInSentence.substring(1,numberInSentence.length()); //Le quito el símbolo - al número negativo para poder utilizarlo.
        }

        //Compruebo las cifras del número para mostrar una información u otra
        switch (numberInSentence.length()){
            case 1:
                if(esDivisiblePorTres(numberInSentence))
                    System.out.println(number + " es divisible por tres");
                else
                    System.out.println(number + " no es divisble por tres");
                break;
            case 2:
                if (esCapicua(numberInSentence))
                    System.out.println(number + " es capicúa");
                else
                    System.out.println(number + " no es capicúa");
                break;
            case 3:
                if (esCapicua(numberInSentence))
                    System.out.println(number + " es capicúa");
                else
                    System.out.println(number + " no es capicúa");

                if(esPar(numberInSentence))
                    System.out.println(number + " es par");
                else
                    System.out.println(number + " es impar");
                break;

            default:
                if(esPar(numberInSentence))
                    System.out.println(number + " es par");
                else
                    System.out.println(number + " es impar");
                break;

        }
        sc.close();
    }
}
