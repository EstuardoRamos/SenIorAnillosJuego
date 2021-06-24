/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorAnillosJ;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {
    
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int opc;
        System.out.println("Bienvenido al nuestri juego el senior de los anillos");
        System.out.println("1. Para empesar batalla.");
        System.out.println("2. Para salir.");
        opc=scanner.nextInt();
        if (opc==1){
            Batalla tmp = new Batalla(); 
           tmp.jugar();
            
        } 
        else {
            if (opc==2) {
                System.out.println("Adios!!");
            }
        }
           
    }
    
}
