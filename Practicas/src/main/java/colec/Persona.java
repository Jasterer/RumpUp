package colec;

import colec.auxiliares.Nif;

import java.util.Date;

public class Persona {

    // TODO definir todas definir todas la operaciones que se pueden hacer con una persona?
    //    Atributos
    // public protected private
    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected int edad;
    protected double altura;
    protected double peso;
    protected boolean fumador;
    protected Date nacimiento;
    protected Nif nifGenerador;
    protected String nif;

    //valor a esos atributos
    // Es util tener un constructor por defecto
    public Persona() {
        this(new Date());
    }

    // Un constructor parametrizado
    public Persona (Date fechaNacimiento)
    {
        nifGenerador = new Nif();
        nif = nifGenerador.generaNif();
        sexo = null;
        edad= 0;
        altura= 0.0;
        fumador= true;
        nacimiento = fechaNacimiento;
        peso =0.0;
    }

//    TODO @Joni que pasaria si queremos pasar el nombre y apellidos y la fecha sexo un caso real,con el menos posible de código

    /** Constructor de copia */
    public Persona (Persona otra)
    {
        nifGenerador = otra.nifGenerador;
        nif = nifGenerador.generaNif();
        sexo = null;
        edad= 0;
        altura= 0.0;
        fumador= true;
        nacimiento = fechaNacimiento;
        peso =0.0;
    }

    public String getNif() {
        return nif;
    }
}
