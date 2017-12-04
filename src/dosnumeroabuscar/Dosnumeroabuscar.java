/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosnumeroabuscar;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Dosnumeroabuscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     System.out.println( "por favor digite los 5 numeros separados por un espacio :");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int e = scan.nextInt();
    
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   System.out.println(d);
   System.out.println(e);
   
   System.out.println( "por favor digite un numero mas  :");
   int f = scan.nextInt();
   
   
   if(f == a || f == b || f == c || f == d || f == e ){
   System.out.println("El número  " + f + "  aparece en los primeros 5 números");
   }
   else {
   System.out.println("el numero  " +f+ "  no aparece en los primeros 5 numeros ");
   }
   }
   
    }
    

