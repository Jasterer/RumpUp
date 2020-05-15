import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaUsuario {
    private static final String MENU_PROGRAMITA = "Bienvenido al programa matemáticas : \n" +
            " 1 suma \n" +
            " 2 resta \n" +
            " 3 multiplicación \n" +
            " 4 división\n" +
            " 5 es un número par \n" +
            " 6 es un número primo\n";

    private Matematicas mates;

    public EntradaUsuario() {
        mates = new Matematicas();
    }

    public void usuarioReal() {
        System.out.println(MENU_PROGRAMITA);
        final Long ope = leeUnSumando("introduzca la operación a realizar");
        // TODO que pasa si el usuario se ha equivocado , como le darias otra oportunidad?
        long param1 = leeUnSumando();
        long param2 = 0;
        switch (ope.intValue()) {
            case 0: {
                continue(MENU_PROGRAMITA);
            }
            case 1:
            case 2:
            case 3:
            case 4: {
                /* Intenta leer este param solo cuando haga falta TODO @Joni
                 * Así inicializamos la variable solo si es necesario
                 */
                param2 = leeUnSumando();
                break;
            }
            case 5:
            case 6:
            default: {
                // No hacemos nada
            }
        }
        if (ope != 0) {
            realizaOperaciones(ope, param1, param2);
        } else {
            System.out.println("Operacion no valida");
        }
    }

    /**
     * modifica esta funcion para que si le metes una letra no casque TODO  @Joni
     *
     * @return
     */
    public long leeUnSumando() {
        return leeUnSumando("introduzca el parametro");
    }

    public long leeUnSumando(String mensaje) {
        String param1;

        /* mi idea es colocar una funcion para que no deje introducir letras, solo números...
         * pero dentro de los parentesis no se a que tengo k hacer referencia... TODO @Week
         *                                                                        */
//        if (!Character.isDigit(param1)) {
//            e.consume();
//        }

        // Vamos a aprender el manejo de excepciones con este ejemplo. este lo corregimos en vivo


        Scanner objeto = new Scanner(System.in);
        System.out.println(mensaje);
        param1 = objeto.nextLine();
        try {
            Long.parseLong(param1);
            System.out.println("lo que has metido ES un entero");
        } catch (NumberFormatException f) {
            System.out.println("lo que has metido no es un entero");
            param1 = "0";
        } catch (Exception e) {
            System.out.println("Algo ha fallado");
            param1 = "0";
        }
        return Long.parseLong(param1);

    }

    public void usuarioSimulado() {
        InputStream simulatedInput;
        String data1 = "1"; //Add an item option
        String data2 = "2"; //The item to add
        simulatedInput = new ByteArrayInputStream(data1.getBytes());

        System.setIn(new ByteArrayInputStream("data".getBytes()));


    }

    private void realizaOperaciones(long ope, long param1, long param2) {
        if (ope == 1) {
            long suma = mates.sumas(param1, param2);
            System.out.println("la suma es : " + suma);
        }

        if (ope == 2) {
            long resta = mates.restas(param1, param2);
            System.out.println("la resta es : " + resta);
        }

        if (ope == 3) {
            long multiplicación = mates.multiplicas(param1, param2);
            System.out.println("la multiplicación es : " + multiplicación);
        }

        if (ope == 4) {
            long división = mates.divides(param1, param2);
            System.out.println("la división es : " + división);
        }
        //TODO operaciones 5 y 6 @JONI
        if (ope == 5) {
            if (mates.esPar(param1)) {
                System.out.println("Número par:" + param1);
            } else {//if (param1 % 2 != 0) { Simplificable
                System.out.println("Número impar:" + param1);
            }
        }

        if (ope == 6) {
            if (mates.esPrimo(param1)) {
                System.out.println("es un número primo");
            } else {
                System.out.println("no es un número primo");
            }
        }
    }
}
