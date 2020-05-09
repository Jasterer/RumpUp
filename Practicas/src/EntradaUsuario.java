import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaUsuario {

    private Matematicas mates;

    public EntradaUsuario() {
        mates = new Matematicas();
    }

    public void usuarioReal() {

        Scanner operacion = new Scanner(System.in);
        System.out.println("Bienvenido al programa matemáticas : \n" +
                " 1 suma \n" +
                " 2 resta \n" +
                " 3 multiplicación \n" +
                " 4 división\n" +
                " 5 es un número par \n" +
                " 6 es un numero primo"
        );
        int ope = leeUnSumando("introduzca la operación a realizar");
        int param1 = leeUnSumando();
        int param2 = leeUnSumando();

        realizaOperaciones(ope, param1, param2);

    }

    public int leeUnSumando() {
        return leeUnSumando("introduzca el parametro");
    }

    public int leeUnSumando(String mensaje) {
        int param1;
        Scanner objeto = new Scanner(System.in);
        System.out.println(mensaje);
        param1 = objeto.nextInt();
        return param1;
    }

    public void usuarioSimulado() {
        InputStream simulatedInput;
        String data1 = "1"; //Add an item option
        String data2 = "2"; //The item to add
        simulatedInput = new ByteArrayInputStream(data1.getBytes());

        System.setIn(new ByteArrayInputStream("data".getBytes()));


    }

    private void realizaOperaciones(int ope, int param1, int param2) {
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
        //TODO operaciones 5 y 6 @JONI
        if (ope == 5) {
            //int división = mates.esPar(param1);
            System.out.println("la respuesta es : " + ?);
        }

        if (ope == 6) {
//            int primo = mates.esPrimo(param1);
            System.out.println("la respuesta es : " + ?);
        }
    }


}
