package es.estech;


import java.util.Scanner;

public class Validate {
     /*
        Comprueba si lo que introducimos por teclado es un número entero o decimal
        Entrada: clase Scanner, y un número que determine la opción que vas a elegir:
            0 -> Validar un entero
            1 -> Validar un double
        Salida: el número ya validado
     */

    static Object validateNumeric(Scanner sc, int opcion) {

        Object validateNumber = 0;

        switch (opcion) {
            case 0:
                while (!sc.hasNextInt()) {
                    System.out.println("ERRROR: Introduce un número entero: ");
                    sc.next();
                }

                validateNumber = sc.nextInt();

                break;

            case 1:
                while (!sc.hasNextDouble()) {
                    System.out.println("ERRROR: Introduce un número entero o decimal: ");
                    sc.next();
                }

                validateNumber = sc.nextDouble();

                break;

            default:
                System.out.println("Has introducido mal la opción. Saliendo del programa");
                System.exit(0);
        }

        return validateNumber;
    }


    /*
      Comprueba si lo que introducimos por teclado es un número entero positivo.
      Entrada: clase Scanner,el número a validar, y un número entero que determina si quieres que sea mayor o mayor o igual que 0:
            0: mayor o igual que 0.
            1: mayor que 0.
      Salida: el número ya validado.
   */

    static Object greaterThan0(Scanner sc, Object o, int option) {
        int limit = 0;

        switch (option){
            case 0:
                limit = 0;
                break;
            case 1:
                limit = 1;
                break;
            default:
                System.out.println("No has introducido una opción correcta. Saliendo del programa");
                System.exit(0);
        }

        if(o instanceof Integer){
            int number = (int) o;

            while(number < limit){
                System.out.println("Debes introducir un número entero mayor que 0");

                while (!sc.hasNextInt()) {
                    System.out.println("ERRROR: Introduce un número entero: ");
                    sc.next();
                }

                number = sc.nextInt();
            }

            o = number;

        }else if(o instanceof Double){
            double number = (double) o;

            while(number < limit){
                System.out.println("Debes introducir un número entero o decimal mayor que 0");

                while (!sc.hasNextDouble()) {
                    System.out.println("ERRROR: Introduce un número entero o decimal: ");
                    sc.next();
                }

                number = sc.nextDouble();
            }

            o = number;

        }else{
            System.out.println("No has introducido un número. Saliendo del programa");
            System.exit(0);
        }

        return o;

    }

}