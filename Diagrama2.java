/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama2;
import java.util.Scanner;
/**
 *
 * @author melan
 */
public class Diagrama2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Determinar e imprimir el anterior y el siguiente de un numero.
        Scanner entrada = new Scanner(System.in);
        // Ingreso del numero
        System.out.println("Ingrese un número para conocer su anterior y posterior");
        int n1=entrada.nextInt ();
        //Se resta uno al numero ingresado para conseguir el anterior
        int res=n1-1;
        //Se suma uno al numero ingresado para conseguir el siguiente
        int sum=n1+1;
        //Se imprime el resultado de las variables
        System.out.println("El número anterior es " +res);
        System.out.println("El número posterior es " + sum);
        
    }
    
}
