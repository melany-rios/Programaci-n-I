/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama4;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class Diagrama4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados 2 numeros A y B imprimir el mayor de ellos
        int n1, n2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número"); //Ingreso del primer numero
        n1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número"); //Ingreso del segundo numero
        n2 = entrada.nextInt();
        if (n1 > n2) { //Pregunta si el primer numero es mayor que el segundo
            System.out.println("El número mayor es: " + n1); //Imprime el primer numero
        } else {
            System.out.println("El número mayor es: " + n2); //Imprime el segundo numero
        }
    }

}
