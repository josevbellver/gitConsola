/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.caixer;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class Caixer {

    /**
     * @param args the command line arguments
     */
    // CONSTANTS
    static int pin = 1234;

    public static void main(String[] args) {
        /*
Programa caixer electrònic

Primer et demana un numero pin

Si este numero coincideix (el pin serà 1234), continuarem, sinò, el programa s'atura avisant que no tenim permís

Sortim amb un total de diners de 6000 € al banc

Si hem aconseguit entrar, surt un menú que et diu les operacions a realitzar:

Ingressar diners.
Retirar diners.
Informar dels diners

Després finalitza el programa

         */

        // VARIABLES
        double diners_totals = 6000;	//comencem amb 6000 €
        int pin_usuari;
        String opcio;		//opció de menú principal
        double diners_usuari;	//diners per treure/ingressar
        char op = '.';		//Si l'usuari vol saldo negatiu
        double resta;		//per comprovar el saldo negatiu
        Scanner scan = new Scanner(System.in);

        // PROGRAMA        
        System.out.println("\n\n\t\t\tDona'm el pin\n\t\t\t");
        pin_usuari = scan.nextInt();

        if (pin_usuari != pin) {
            System.out.println("no tens el pin correcte. Sortim del programa\n\n");
            JOptionPane.showMessageDialog(null, "no tens el pin correcte. \n\nSortim del programa\n\n", "ERROR", 0);

        } else {

            //imprimim el menú
            System.out.println("\n\n");
            System.out.println("\t\t\tMENÚ");
            System.out.println("\t\t\t----\n");
            System.out.println("\t\t\t1) Retirar Diners");
            System.out.println("\t\t\t2) Ingressar Diners");
            System.out.println("\t\t\t3) Consultar Diners");
            System.out.println("\t\t\t0) Sortir\t\t\t");

            opcio = scan.nextLine();
            opcio = scan.nextLine();

            System.out.println("\n\n");

            switch (opcio) {
                case "0":
                    System.exit(0);     // recomanable no utilitzar-ho
                case "1":

                    System.out.println("\t\t\tRETIRAR DINERS");
                    System.out.println("\t\t\t------- ------\n");
                    System.out.println("\t\t\tQuant vols retirar?\t\t\t");
                    diners_usuari = scan.nextDouble();

                    resta = diners_totals - diners_usuari;
                    //COMPROVEM EL SALDO NEGATIU
                    if (resta < 0) {
                        System.out.println("Et quedaràs amb saldo negatiu.");
                        System.out.println("Vols continuar?  s/n: ");
                        op = scan.next().charAt(0);
                    }

                    // SI NO ENS QUEDEM EN NEGATIU
                    // O HEM ACCEPTAT QUEDAR-NOS::
                    if (resta >= 0 || op == 's' || op == 'S') {
                        diners_totals = diners_totals - diners_usuari;

                    }
                    break;
                case "2":

                    System.out.println("\t\t\tINGRESSAR DINERS");
                    System.out.println("\t\t\t--------- ------\n");
                    System.out.println("\t\t\tQuant vols ingressar?\t\t\t");
                    diners_usuari = scan.nextDouble();

                    diners_totals = diners_totals + diners_usuari;
                    break;
                case "3":
                    System.out.println("\t\t\tCONSULTA DE SALDO");
                    System.out.println("\t\t\t-------- -- -----\n");
                    break;
                default:
                    System.out.println("\t\t\t\tOPCIÓ INCORRECTA\n");
                    break;

            }//FINAL SWITCH

        }//final else (imprimir menú)
        
        System.out.println("\n\n\t\t\tEt queden " + diners_totals + " € al banc");
        System.out.println("\n\t\t\t Gràcies. Adéu! ('')--,--,-\n\n\n");

    }

}
