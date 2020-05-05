import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Matematicas mates = new Matematicas();

        Scanner operacion = new Scanner(System.in);
        System.out.println("introduzca la operación a realizar : \n" +
                " 1 suma \n" +
                " 2 resta \n" +
                " 3 multiplicación \n" +
                " 4 división");
        int ope = operacion.nextInt();
        System.out.println("introduzca parametro 1");
        int param1 = operacion.nextInt();
        System.out.println("introduzca parametro 2");
        int param2 = operacion.nextInt();

        if (ope == 1) {
            int suma = mates.sumas(param1, param2);
            System.out.println("la suma es : " + suma);
        }

        if (ope == 2) {
            int resta = mates.restas(param1, param2);
            System.out.println("la resta es : " + resta);
        }

        if (ope == 3) {
            int multiplicación = mates.multiplicas(param1, param2);
            System.out.println("la multiplicación es : " + multiplicación);
        }

        if (ope == 4) {
            int división = mates.divides(param1, param2);
            System.out.println("la división es : " + división);
        }


    }


    public static int leeUnSumando() {
        int param1;
        Scanner objeto = new Scanner(System.in);
        System.out.println("introduzca el primer número de la suma");
        param1 = objeto.nextInt();
        return param1;
    }

}