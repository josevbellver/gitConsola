/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.sumarimultiplicar;
import javax.swing.JOptionPane; 


/**
 *
 * @author vicent
 */
public class SumarIMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*Ens demana 3 numeros. Sumem els 2 primers i multipliquem l'altre*/ 


	int a,b,c,resultat; 

        a=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el número 1"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el número 2"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el número 3"));

	resultat=(a+b)*c; 

        JOptionPane.showMessageDialog(null, "El resultat de ("+a+"+"+b+")*"+c+"="+resultat,"OPERACIONS",1);

}    }
   
