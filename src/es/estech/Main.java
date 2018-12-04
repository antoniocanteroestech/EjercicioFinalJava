package es.estech;

import java.util.Scanner;

public class Main {


    public static boolean esCapicua (String numero) {

        int n = Integer.parseInt(numero);

        boolean result = false;

    // Aqui he creaod un if para avisar de que el numero introducida debe tener 2 o 3 cifras para realizar la operacion
        if ((n < 10) || (n > 1000)) {
            System.out.println("El numero introducido tiene que tener 2 o 3 cifras para calcular si es capicúa");
            return false; //Si no saldrá del programa
        }


        //
        if (numero.length() == 2){
            if (numero.charAt(0)==numero.charAt(1)){
                result = true;
                System.out.printf("El numero %d es capicúa",n);
                       }
                       else {
                System.out.printf("El numero %d no es capicúa",n);
            }
        }

        if (numero.length() == 3){
            if (numero.charAt(0)==numero.charAt(2)){ //Aqui he rectificado el valor 1 por un 2, ya que para numeros de 3 cifras, queremos que compare la primera cifra (0) y la ultima (2)
                result = true;
                System.out.printf("El numero %d es capicúa",n);
            }
            else {
                System.out.printf("El numero %d no es capicúa",n);
            }
        }

        return result;
    }



    public static boolean esPar (String numero){

        int n = Integer.parseInt(numero);

        if (n< 99) {
            System.out.println("El numero introducido tiene que tener 3 cifras o más para calcular si es Par");
            return false;
        }

        if (n%2==0){
            System.out.printf("El numero %d es par",n);
            return true;

        } else {
            System.out.printf("El numero %d no es par",n);
            return false;
        }
    }

    public static boolean esDivisiblePorTres (String numero){
        int n = Integer.parseInt(numero);

        if (n>= 10) {
            System.out.println("El numero introducido tiene que tener 1 sola cifra para calcular si es divisible por 3");
            return false;
        }

        if (n%3==0){
            System.out.printf("El numero %d es divisible por 3",n);
            return true;
        } else {
            System.out.printf("El numero %d no es divisible por 3",n);
            return false;
        }
    }

    public static void main(String[] args) {

        // Abro Scanner para introducir numero con teclado

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero entero");

        // obtengo el valor del nuemro introducido por teclado
        String numero=sc.next();

        // Pregunto por la operacion a realizar
        System.out.println("Introduce la operacion a realizar");

        System.out.println();

        System.out.println("1. Calcula si es capicua" + "\n" + "2. Cacula si es par" + "\n" + "3. Calcula si divisible por 3");

        //Obtengo un int para usarlo con un swicth y crear las opciones a elegir

        int operacion=sc.nextInt();

        switch (operacion){
            case 1: esCapicua(numero); //Si elegimos 1, llama al metodo esCapicua, y este metodo podrá devolver 3 mensajes

                // o bien que el numero introducido no tiene el numero de digitos necesarios para reaizar esa operacion
                // o bien que el numero es capicúa
                // o bien que el numero no es capicùa
                break;

                // y el mismo funcionamiento para el reso de opciones a elegir
            case 2: esPar(numero);
                break;

            case 3: esDivisiblePorTres(numero);
                break;
        }

        sc.close(); // cerramos Scanner

    }
}
