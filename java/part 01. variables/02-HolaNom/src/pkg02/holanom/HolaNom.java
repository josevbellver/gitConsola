/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.holanom;

// Forma 1-> AMB EL METODE SCANNER

import java.util.Scanner;
import javax.swing.JOptionPane;

// Forma 2-> IMPORTAR javax.swing (per fer utilitzar aquest objecte

//import java.util.Scanner;       // FORMA 1 (amb scan)


/**
 *
 * @author vicent
 */
public class HolaNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // variables //
        String nom;
        
        
        
        // programa //
        
        //////////////////////////////////
        // FORMA 1. AMB EL MÈTODE scan //
        //////////////////////////////////
        
//      
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Dona'm el téu nom:");
//        nom=scan.nextLine();
//        System.out.println("\n\nHola "+nom+"!\nBenvingut!\n\n");
//        scan.close();
       
        //////////////////////////////////////////
        // FORMA 2. AMB EL MÈTODE INPUT DIALOG //
        //////////////////////////////////////////
         
        
        nom=JOptionPane.showInputDialog("Dona'm el téu nom");
        //System.out.println("Hola "+nom+". \n\nBenvingut!\n\n");
        //No descomentar //JOptionPane.showMessageDialog(null, "MISSATGE","TITOL",0-3);
        JOptionPane.showMessageDialog(null, "hola "+nom+".\n\n Benvingut!\n\n","hola!!!",1);
 
    }
    
}
