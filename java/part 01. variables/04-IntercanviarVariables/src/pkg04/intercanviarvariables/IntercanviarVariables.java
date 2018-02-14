/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.intercanviarvariables;

import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class IntercanviarVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Intercanviar el valor de 2 variables senceres*/ 

	int a,b,c; 

        a=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el número 1"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el número 2"));

	System.out.println("\n**************\n");
	System.out.println("primers valors\n"); 
	System.out.println("a="+a+", b="+b+"\n"); 
	
	//intercanviem les variables
	c=a; 
	a=b; 
	b=c; 

	System.out.println("\n**************\n");
	System.out.println("següents valors\n"); 
	System.out.println("a="+a+", b="+b+"\n\n"); 

}
    }
    
