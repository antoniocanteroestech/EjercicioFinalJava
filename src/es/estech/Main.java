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
	    System.out.println("Introduzca un número a analizar:");
        Scanner scan = new Scanner(System.in);
        String numero= scan.next();
        if(numero.length()<2 || numero.length()>3){
            if(numero.length()==1){
                boolean result=esDivisiblePorTres(numero);
                if(result==false){
                    System.out.println("No es divisible por 3.");
                }else{
                    System.out.println("Es divisible por 3.");
                }
            }else{
                boolean result=esPar(numero);
                if(result==false){
                    System.out.println("Es impar.");
                }else{
                    System.out.println("Es par.");
                }
            }
        }else{
            boolean result=esCapicua(numero);
            if(result==false){
                System.out.println("No es capicua.");
            }else{
                System.out.println("Es capicua.");
            }
        }
    }
}
