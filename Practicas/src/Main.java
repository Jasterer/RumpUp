import java.util.Scanner;

public class Main {
    // Comentario de una sola linea
    /*
      Commentario de varias
      lineas
      que puedes
      escribir como Kapo

     */
    public static void main(String[] args) {

        // Suma dos enteros
        // 5+3 y dame la salida por la consola

        int num1=5;
        int num2=3;

        int resultado;
        resultado=num1+num2;
        System.out.println("El resultado de la suma es igual a: "+ resultado);

        //Lectura analítica de la suma


        num1=leeUnSumando();
        num2=leeUnSumando();

        SumaMatematicas calculadora = new SumaMatematicas();
        resultado = calculadora.sumaDosNumeros(num1,num2);
        System.out.println("El resultado de la suma es igual a: "+ resultado);

      //  sumaDosNumeros();

        System.out.println("El resultado de la suma es igual a: "+ calculadora.sumaDosNumeros(num1,num2));
    }
    /**
     * Funcion que recoge una entrada
     * @return el valor
     *
     */
    public static int leeUnSumando() {
        int param1;
        Scanner objeto=new Scanner(System.in);
        System.out.println("introduzca el primer número de la suma");
        param1=objeto.nextInt();
        return param1;
    }




    /**
     * Funcion estática original
     */
    public static void sumaDosNumeros() {

        int num1=0,num2=0, resultado=0;

        Scanner objeto=new Scanner(System.in);

        System.out.println("introduzca el primer número de la suma");
        num1=objeto.nextInt();

        System.out.println("Introduzca e segundo número de la suma");
        num2=objeto.nextInt();

        resultado=num1+num2;

        System.out.println("El resultado de la suma es igual a:"+resultado);

    }
}


/**  import java.util.Scanner;

 public class Main {

     public static int main(String[] args) {

       suma=SumaMatematicas;
       resta=RestaMatematicas;
       multiplicacion=multiplacionMatematicas;
       division=DivisionMatematicas;
       Scanner operacion=new Scanner(System.in);
       System.out.println("introduzca la operación a realiza:(suma,resta,multiplicación o división)");
       ope=operacion.nextInt();
       }

     public static void main(String[] args) {
       if ope=suma=SumaMatematicas;
         num1=leeUnSumando();
         num2=leeUnSumando();

         SumaMatematicas calculadora = new SumaMatematicas();
         resultado = calculadora.sumaDosNumeros(num1,num2);
         System.out.println("El resultado de la suma es igual a: "+ resultado);

         System.out.println("El resultado de la suma es igual a: "+ calculadora.sumaDosNumeros(num1,num2));
         }

     public static int leeUnSumando() {
         int param1;
         Scanner objeto=new Scanner(System.in);
         System.out.println("introduzca el primer número de la suma");
         param1=objeto.nextInt();
         return param1;
         }


     public static void main(String[] args) {
       if ope=resta=RestaMatematicas;
         num1=leeUnSumando();
         num2=leeUnSumando();

         RestaMatematicas calculadora = new restaMatematicas();
         resultado = calculadora.restaDosNumeros(num1,num2);
         System.out.println("El resultado de la resta es igual a: "+ resultado);

         System.out.println("El resultado de la resta es igual a: "+ calculadora.sumaDosNumeros(num1,num2));
         }

      public static int leeUnSumando() {
         int param1;
         Scanner objeto=new Scanner(System.in);
         System.out.println("introduzca el primer número de la resta");
         param1=objeto.nextInt();
         return param1;
         }

     public static void main(String[] args) {
      if ope=multiplicación=multiplicacionMatematicas;
         num1=leeUnSumando();
         num2=leeUnSumando();

         MultiplicacionMatematicas calculadora = new multiplicacionMatematicas();
         resultado = calculadora.multiplicacionDosNumeros(num1,num2);
         System.out.println("El resultado de la multiplicación es igual a: "+ resultado);

         System.out.println("El resultado de la multiplicación es igual a: "+ calculadora.sumaDosNumeros(num1,num2));
         }

     public static int leeUnSumando() {
         int param1;
         Scanner objeto=new Scanner(System.in);
         System.out.println("introduzca el primer número de la multiplicación");
         param1=objeto.nextInt();
         return param1;
         }

     public static void main(String[] args) {
      if ope=división=DivisionMatematicas;
         num1=leeUnSumando();
         num2=leeUnSumando();

         DivisionMatematicas calculadora = new DivisionMatematicas();
         resultado = calculadora.divisionDosNumeros(num1,num2);
         System.out.println("El resultado de la división es igual a: "+ resultado);

         System.out.println("El resultado de la división es igual a: "+ calculadora.divisionDosNumeros(num1,num2));
         }

     public static int leeUnSumando() {
         int param1;
         Scanner objeto=new Scanner(System.in);
         System.out.println("introduzca el primer número de la división");
         param1=objeto.nextInt();
         return param1;
         }