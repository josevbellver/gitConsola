/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.salari;

import java.util.Scanner;

/**
 *
 * @author vicent
 */
public class Salari {

    /**
     * @param args the command line arguments
     */
    // CONSTANTS
    static int hores_normals = 34;
    static double sou_extra = 1.5;

    public static void main(String[] args) {
        /*
Calcula el salari net dels empleats d’una empresa pagats per hores de la següent manera

- les hores inferiors a 35 hores es paguen a una tarifa determinada que s’ha d’introduir pel teclat al igual que el número d’hores i el codi de treballador.
- Les hores iguals o superiors a 35 es pagaran com extres a un preu de 1.5 hores normals.
- L’import a deduir als treballadors depèn del sou:
- sou<= 120 €, no impostos
- els següents 900 € al 20%
- La resta al 30%.

Nota: Les hores treballades per l’empleat seran sempre hores senceres
         */

        //variables
        int total_hores, treb, hores_extres;
        double tarifa, salari_total;
        Scanner scan = new Scanner(System.in);

        //recollim dades
        System.out.println("Dona'm el codi de treballador\n");
        treb = scan.nextInt();
        System.out.println("Dona'm la tarifa normal\n");
        tarifa = scan.nextDouble();
        System.out.println("Dona'm les hores\n");
        total_hores = scan.nextInt();

        //calculem les hores extres
        hores_extres = total_hores - hores_normals;
        //càlcul de salari brut (hores normals + hores extres)
        if (total_hores <= hores_normals) {
            salari_total = total_hores * tarifa;
        } else {
            salari_total = hores_normals * tarifa;	//calcula tarifa normal
            salari_total = salari_total + (hores_extres * sou_extra * tarifa);	//suma hores extres + salari normal
        }
        //càlcul de salari net (aplicant retencions depenent del sou brut)
        if ((salari_total >= 120) && (salari_total < 1020)) {
            salari_total = salari_total - (salari_total * 0.2);
            //printf("Apliquem un descompte del 20%\n");
        } else if (salari_total >= 1020) {
            salari_total = salari_total - (salari_total * 0.3);
            //printf("Apliquem un descompte del 30%\n");
        }

        System.out.println("El salari del treballador num " + treb + " és " + salari_total + " € i ha treballat un total de " + total_hores + " hores\n");

    }

}
