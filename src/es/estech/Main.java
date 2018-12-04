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

        System.out.println("Introduzca un número entero");
        String numero = sc.nextLine();

        if (numero.length() == 2 | numero.length() == 3) System.out.println("¿Es Capicúa? " + esCapicua(numero));
        else System.out.println("Para comprobar si es capicúa el número tiene que tener dos o tres cifras");

        if (numero.length() >= 3) System.out.println("¿Es par? " + esPar(numero));
        else System.out.println("El número tiene que tener tres o mas cifrás para comprobar si es par");

        if (numero.length() == 1) System.out.println("¿Es divisible por tres? " + esDivisiblePorTres(numero));
        else System.out.println("Para comprobar si el número es divisible por tres solo debe de tener una cifra");
	
    }
}
