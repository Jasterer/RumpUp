package colec.auxiliares;

import java.util.Random;

public class Nif implements OperacionesNif {
    private static Random random = new Random();
    private static final String letters = "TRWAGMYFPDXBNJZSQVHLCKE";


//    @Joni se te ocurre alguna forma de gnerar un numero aletorio

    @Override
    public long generaDni() {
        return random.nextLong();
    }

    @Override
    public char dameLetraParaDni(long paramDni) {
        char retorno = letters.charAt((int) paramDni % 23);
        return retorno;
    }

    @Override
    public String generaNif() {
        long numDni =generaDni();
        char letraDni = dameLetraParaDni(numDni);
        return String.valueOf(numDni+letraDni);
    }
}
