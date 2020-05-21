package colec.auxiliares;

/**
 * En la interface la idea es hablar de prototipos
 */
public interface OperacionesNif {
    /**
     * Generamos un numero aleatorio y
     * @return
     */
     long generaDni();
     char dameLetraParaDni(long paramDni);
     String generaNif();
}
