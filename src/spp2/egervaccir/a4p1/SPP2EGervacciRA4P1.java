/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.a4p1;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SPP2EGervacciRA4P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner teclado = new Scanner (System.in);
        double angle, res;
        int trig;
        
        //Ejecución
        System.out.println("Calculadora de funciones trigonométricas");
        System.out.println("Seleccione la función deseada: ");
        System.out.println("1. Calcular Seno");
        System.out.println("2. Calcular Coseno");
        System.out.println("3. Calcular Tangente");
        System.out.println("4. Salir");
        trig = teclado.nextInt();
        
        //Operaciones
        switch (trig) {
            case 1:
                System.out.println("Calcular Seno");
                res = Math.sin(askangle());
                System.out.println("El seno del ángulo es igual a: " + res);
                break;
            
            case 2: 
                System.out.println("Calcular Coseno");
                res = Math.cos(askangle());
                System.out.println("El coseno del ángulo es igual a: " + res);
                break;
                
            case 3:
                System.out.println("Calcular Tangente");
                res = Math.tan(askangle());
                System.out.println("La tangente del ángulo es igual a: " + res);
                break;
            
            default: 
                System.out.println("Adios!");
        }
                
    }
static double askangle(){
        double angle;
        Scanner teclado = new Scanner (System.in);
       
        System.out.print("Ingrese el valor del ángulo: ");
                angle = teclado.nextDouble();
                angle = Math.toRadians(angle); 
                System.out.println("El valor del ángulo en radianes es igual a: " + angle);
        
        return angle;
        
    }    
}
