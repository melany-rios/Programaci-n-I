/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama3;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class Diagrama3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 2 numeros, almacenarlos en las variables X y Y. Intercambiar el contenido de las variables
        //de manera que el valor contenido en X pase a Y, y el valor de Y pase a X.
        int n1, n2, x, y, aux; //Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número"); //Ingreso del primero numero
        n1 = entrada.nextInt();
        x = n1; //Almaceno en X el numero ingresado
        System.out.println("Valor de X " + x);
        System.out.println("Ingrese el segundo número"); //Ingreso del segundo numero
        n2 = entrada.nextInt(); 
        y = n2; //Almaceno en Y el segundo numero ingresado
        System.out.println("Valor de Y " + y);
        aux = x; //Almaceno en la variable aux el valor de la variable x
        x = y; //Almaceno en la variable x el valor de la variable y
        y = aux; //Asigno a la variable y el valor de la variable aux
        System.out.println("Valor de X " + y);
        System.out.println("Valor de Y " + x);

    }

}
