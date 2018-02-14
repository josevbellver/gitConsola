/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
// //////////////////////////////////////////////// //
// FORMA1: AMB Scanner;      FORMA2: amb JOptionPane.
// //////////////////////////////////////////////// //

import java.util.Scanner;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane; 

/**
 *
 * @author vicent
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CALCULADORA. A PARTIR DE 2 NÚMEROS SENCERS
        
        ///////////////
        // variables //
        ///////////////
        
        int num1, num2, result;
//        Scanner scan=new Scanner(System.in);
        
        
        
        //////////////
        // PROGRAMA //
        //////////////
        
        
        //////////////////////////////////
        // FORMA 1. AMB EL MÈTODE scan //
        //////////////////////////////////
//        System.out.print("Dona'm un número: ");
//        num1=scan.nextInt();
//        System.out.print("Dona'm un altre número: ");
//        num2=scan.nextInt();
//        
//        // FEM LA SUMA
//        result=num1+num2;
//        
//        // MOSTREM EL RESULTAT
//        System.out.println("\n\t\t"+num1+"+"+num2+"="+result+"\n\n");
//        
//        
//        
        //////////////////////////////////////////
        // FORMA 2. AMB EL MÈTODE INPUT DIALOG //
        //////////////////////////////////////////
      
        num1=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el número 1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el número 2"));        
   
        
        result=num1+num2;
        
        //System.out.println("El resultat de "+num1+"+"+num2+"="+result);
        JOptionPane.showMessageDialog(null, "El resultat de "+num1+"+"+num2+"="+result,"SUMA",2);
       

    }
    
}
