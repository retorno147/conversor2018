/**
 * Proyecto colaborativo: conversor de unidades de medida
 */
package mgcss.conversor;

import java.util.Scanner;

public class Main {
/**
     * @param args no hay
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al convertidor de unidades de medida");
        System.out.println("***********************************************");
       //TODO aquí pondremos las llamadas a los métodos para convertir unidades
        /* ejemplo de llamada 
        double millas=0;
        double kilometros=longitud.milla(millas); */
        Perimetro_opcional per = new Perimetro_opcional();
        Scanner sc = new Scanner(System.in);
        System.out.println("Aqui vamos a probar el calculo del perimetro de una figura dada sus dimenciones");
        System.out.print("\nDeme el altura de la figura");
        per.setAltura(sc.nextFloat());
        System.out.print("\nDeme la base de la figura");
        per.setBase(sc.nextFloat());
        
        
    }

}
