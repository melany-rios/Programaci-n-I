/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama1;

import java.util.Scanner;


/**
 *
 * @author melany
 */
public class Diagrama1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 3 números en las variables A,B y c y realizar los siguientes calculos e imprimir:
        //a)La suma de los 3 numeros.
        //b)La diferencia del primero con el segundo.
        //c)el producto de los dos ultimos.
        //d)La division entre el primero y el tercero.
        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);
        //Ingreso de los 3 numeros
        System.out.println("Ingrese el primer número");
        n1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = entrada.nextInt();
        System.out.println("Ingrese el tercer número");
        n3 = entrada.nextInt();
        //Suma de los 3 numeros
        int sum = n1 + n2 + n3;
        //Impresion del resultado de la suma
        System.out.println("El resultado de la suma de todos los números es: " + sum);
        //Resta del primero con el segundo
        int res = n1 - n2;
        //Impresion del resultado de la resta
        System.out.println("El resultado de la resta entre el primer y el segundo número es: " + res);
        //Multiplicacion de los 2 ultimos numeros
        int mult = n2 * n3;
        //Impresion del resultado de la multiplicacion
        System.out.println("El resultado de la multiplicación entre el segundo y el tercer número es: " + mult);
        //Pregunta si el 3er numero es igual a cero para informar que no se puede realizar la division
        //caso contrario realiar la division entre el 1er numero y el 3ro e imprimir el resultado
        if (n3 == 0) 
            System.out.println("No se puede realizar la división");
        else {
            float div = (float) n1 / n3;
            System.out.println("El resultado de la división entre el primer y el tercer número es: " + div);
        }
     
    }

}
