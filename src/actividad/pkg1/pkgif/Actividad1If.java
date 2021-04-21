/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1.pkgif;

import java.util.Scanner;
/**
 *
 * @author Santiago Vela
 */
public class Actividad1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Año actual: 2021");
       
       
       System.out.println("Coloca un año:");
       int año = entrada.nextInt();
       int nuevoaño = 0;
       
       if(año < 2021){
           nuevoaño = 2021 - año;
           System.out.println("Han pasado " + nuevoaño + " años");
       } else if(año > 2021){
           nuevoaño = año - 2021;
           System.out.println("Faltan " + nuevoaño + " años");
       } else{
           System.out.println("Continuamos en este año");
       }
       
    }
    
}
