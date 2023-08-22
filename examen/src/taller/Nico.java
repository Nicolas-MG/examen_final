/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Nico {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nm = new String[6];
     
        
        
        nm[0]="Maria";
        nm[1]="Juan";
        nm[2]="Andres";
        nm[3]="Nicolas";
        nm[4]="santigo";
        nm[5]="Felipe";
        int size = nm.length;
        System.out.println("en total de los nombres son: " + size);
        for(int i = 0; i<nm.length;i++){
            System.out.println("el nombre " + i + " es " + nm[i]);
        

        int[][] edades = new int[3][3];

        edades[0][0] = 25;
        edades[0][1] = 30;
        edades[0][2] = 35;
        edades[1][0] = 40;
        edades[1][1] = 45;
        edades[1][2] = 50;
        edades[2][0] = 55;
        edades[2][1] = 60;
        edades[2][2] = 65;

        System.out.println("Las edades de mi familia son:");
        for (int e = 0; e < edades.length; e++) {
        for (int j = 0; j < edades[e].length; j++) {
            System.out.print(edades[e][j] + " ");
            }
            System.out.println();
        }  
        } 
        
    }
      public static class CN {
      public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String[] nm = new String[6];

      for (int i = 0; i < nm.length; i++) {
            System.out.print("Ingrese un nombre: ");
             nm[i] = scanner.nextLine();
        }

            System.out.println("Los nombres que ingreso son:");
            for (String nombre : nm) {
            System.out.println(nombre);
            
            } 
     }     
}
}
      

      


   



 



    

