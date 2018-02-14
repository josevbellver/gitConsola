/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.pkgswitch;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a partir d'una variable DIA indicar quin nom de dia de setmana estem: Exemple DIA=1 -> dilluns

        //int dia;
        String dia;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dona'm el dia de la setmana\n");
        //dia = scan.nextInt();
        dia = scan.next();
        switch (dia) {
            case "1":
                System.out.println("El dia és dilluns\n");
                break;
            case "2":
                System.out.println("El dia és dimarts\n");
                break;
            case "3":
                System.out.println("El dia és dimecres\n");
                break;
            case "4":
                System.out.println("El dia és dijous\n");
                break;
            case "5":
                System.out.println("El dia és divendres\n");
                break;
            case "6":
                System.out.println("El dia és dissabte\n");
                break;
            case "7":
                System.out.println("El dia és diumenge\n");
                break;
            default:
                System.out.println("No existeix cap dia amb aquest número\n");
                break;
        } //final switch

    }

}
