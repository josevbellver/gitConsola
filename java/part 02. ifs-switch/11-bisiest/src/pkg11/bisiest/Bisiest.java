/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.bisiest;

import java.util.Scanner;

/**
 *
 * @author vicent
 */
public class Bisiest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introduïr un nº d'any i el programa et diu si és bisiest (de traspàs) o no.
// 
// REGLES BISIEST:
// Un any és bisiest si és múltiple de 400 sempre
// i també:
// Un any és bisiest si és múltiple de 4 i no de 100

        int any;
        boolean bisiest = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dona'm l'any\n");
        any = scan.nextInt();

        if ((any < 0) || (any > 3000)) {
            System.out.println("\n\n\n\tERROR, l'any ha d'estar entre 0 i 3000\n\n");
        } else if (any % 400 == 0) {
            bisiest = true;
        } else if ((any % 4 == 0) && (any % 100 != 0)) {
            bisiest = true;
        }

        // EQUIVALENT A LES 2 COMPARACIONS ANTERIORS
        //if ((any % 4 == 0) && (any % 100 != 0) || (any%400==0);
        if (!bisiest) {
            System.out.println("L'any " + any + " NO és bisiest\n");
        } else {
            System.out.println("L'any " + any + " és bisiest\n");
        }

    }

}
