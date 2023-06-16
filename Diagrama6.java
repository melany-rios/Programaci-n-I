/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama6;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class Diagrama6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados 3 numeros A, B y C imprimir el mayor de ellos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número"); //Ingreso del numero A
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo número"); //Ingreso del numero B
        int b = entrada.nextInt();
        System.out.println("Ingrese el tercer número"); //Ingreso del numero C
        int c = entrada.nextInt();
        if (a > b & a > c) { //Pregunta si A es mayor que B y C
            System.out.println("Es el mayor número: " + a); //Imprimo A
        } else if (b > a & b > c) { //Pregunta si B es mayor que A y C
            System.out.println("Es el mayor número: " + b); //Imprimo B
        } else { System.out.println("Es el mayor número: " + c); //Imprimo C
        }
    }

}
