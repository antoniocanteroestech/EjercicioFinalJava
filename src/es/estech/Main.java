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
        //Abrimos un Scanner y declaramos variable numero donde almacenar la entrada en consola pedida al usuario.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        String numero = sc.next();

        //Si el número es de una cifra, usamos el resultado del método esDivisiblePorTres para mostrar en pantalla el mensaje apropiado.
        if (numero.length()==1){
            if(esDivisiblePorTres(numero)){
                System.out.println("El número es divisible entre tres.");
            }else{
                System.out.println("El número no es divisible entre tres.");
            }
        }
        //Si el número es de dos o tres cifras, usamos el resultado del método esCapicua para mostrar en pantalla el mensaje apropiado.
        if(numero.length()==2 || numero.length()==3){
            if(esCapicua(numero)){
                System.out.println("El número es capicúa.");
            }else{
                System.out.println("El número no es capicúa.");
            }
        }
        //Si el número es de tres o mas cifras, usamos el resultado del método esPar para mostrar en pantalla el mensaje apropiado.
        if(numero.length()>=3){
            if(esPar(numero)){
                System.out.println("El número es par.");
            }else{
                System.out.println("El número no es par.");
            }
        }
        //Cerramos el Scanner
        sc.close();
    }
}

