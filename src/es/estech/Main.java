package es.estech;

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
            if (numero.charAt(0)==numero.charAt(1)){
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
	
    }
}
