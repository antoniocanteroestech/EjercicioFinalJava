package es.estech;

import java.util.Scanner;

public class Main {


    public static boolean esCapicua(String numero) {
        boolean result = false;

        if (numero.length() == 2) {
            if (numero.charAt(0) == numero.charAt(1)) {
                result = true;
            }
        }

        if (numero.length() == 3) {
            if (numero.charAt(0) == numero.charAt(2)) {
                result = true;
            }
        }

        return result;
    }

    public static boolean esPar(String numero) {
        int n = Integer.parseInt(numero);
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esDivisiblePorTres(String numero) {
        int n = Integer.parseInt(numero);
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Función que valida un número entero
    public static int validate(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        return sc.nextInt();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, length;
        //Leemos un número y validamos que sea un número y no un String
        System.out.print("Introduce un número: ");
        number = validate(sc);
        //Guardamos su longitud para saber que operación debemos realizar
        length = String.valueOf(number).length();
        //Si el número tiene una longitud de 2 o de 3 decimos si es capicúa
        if (length >= 2 && length <= 3) {
            System.out.println("El número es capicúa: " + esCapicua(String.valueOf(number)));
        }
        //Si el número tiene una longitud mayor o igual a 3 decimos si es par o impar
        if (length >= 3) {
            System.out.println("El número es par: " + esPar(String.valueOf(number)));
        }
        //Si el número tiene una longitud de 1 solo comprobamos si es divisible por 3
        if (length == 1) {
            System.out.println("El número es divisible por 3: " + esDivisiblePorTres(String.valueOf(number)));
        }
    }
}
