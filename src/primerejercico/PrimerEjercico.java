/*
 * .A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro. Análisis Es necesario que al algoritmo se le proporcione la edad de Juan para calcular la edad de Alberto, de Ana y de la mamá. 
    Datos de entrada: Edad de Juan. Datos de salida, Edad de Alberto, Edad de Juan: (En este caso es un dato de entrada y salida al mismo tiempo). Edad de Ana. Edad de la mamá.
    Proceso: Edad de Alberto = 2/3 * edad de Juan, 
    Edad de Ana = 4/3 * edad de Juan, 
    Edad de la mamá = Edad de Alberto + Edad de Juan + Edad de Ana.

 */
package primerejercico;

import java.util.Scanner;

public class PrimerEjercico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Definición de variables
        int edaJuan, edaAlbert, edaAna, edaMama;

        // preguntar cual es la edad de Juan
        System.out.print("Escriba la edad que tiene Juan: ");
        edaJuan = scanner.nextInt();

        // procedimiento para calcular las edades
        edaAlbert = edaJuan * 2 / 3;

        // Calcular la edad de Ana
        edaAna = edaJuan * 4 / 3;

        // Calcular la edad de la mamá (suma de las tres edades)
        edaMama = edaAlbert + edaJuan + edaAna;

        // Mostrar los resultados
        System.out.println("Las edades son las siguientes: ");
        System.out.println( "Alberto = " + edaAlbert + " Juan= " + edaJuan + " Ana= " + edaAna + " Mama: " + edaMama);
       
    }
    
}
