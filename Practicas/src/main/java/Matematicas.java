public class Matematicas {
    public long sumas(long param1, long param2) {
        return (param1 + param2);
    }

    public long divides(long param1, long param2) {
        long resultado = param1 / param2;
        return resultado;
    }

    public long multiplicas(long param1, long param2) {
        long resultado = param1 * param2;
        return resultado;
    }

    public long restas(long param1, long param2) {
        long resultado = param1 - param2;
        return resultado;
    }

    /**
     * Esta funcion
     * @param param1 aqui metemos
     * @return si es par o no
     *
     * a evitar noEsPar
     * !noEsPar error de codification
     */
    public boolean esPar(long param1) {
        return param1 % 2 == 0;
//        //TODO es un numero par? como lo harias?
//        // Operador modulo (resto de una division) %
//        if (param1 % 2 == 0) {
//            System.out.println("Número par:" + param1);
//        } else {//if (param1 % 2 != 0) {
//            System.out.println("Número impar:" + param1);
//        }

    }

    /**
     * 2 , 4 , 6 , 8  200393837
     * Criba de eratostenes ,
     * caso 7
     *   2 -> false , 4 , 6
     *   3 -> false 6
     *   4
     *   5 -> false
     *   6
     *   7
     * @param param1
     * @return
     */
    public boolean esPrimo(long param1) {
        long num1 = 2;
        while (num1 < param1-1)
        {
            if ((param1 % num1) != 0)
            {
                num1 = 1;
                break;
            }
            num1++;//num = num +1; num +=1;
        }
        return num1 == 1;
    }
}
