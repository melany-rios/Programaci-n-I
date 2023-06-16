/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama5;
import java.util.Scanner;
/**
 *
 * @author melan
 */
public class Diagrama5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un numero que representa la cantidad de lado de un polígono, determinar si se trata
        //de un triángulo, cuadrilatero o de un pentpagono; en caso de no tratarse de una de esas
        //figuras, imprimir un mensaje indicando de que polígono se trata 
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de lados del polígono"); //Ingreso de la cantidad de lados
        int lados = entrada.nextInt();
        switch (lados){ 
                case 3:
                    System.out.println("El polígono es un triángulo");
                    break;
                case 4:
                    System.out.println("El polígono es un cuadrilatero");
                    break;
                case 5:
                    System.out.println("El polígono es un pentágono");
                    break;
                default:
                    System.out.println("Error");
                    break;
                }
        
    }
   
}
