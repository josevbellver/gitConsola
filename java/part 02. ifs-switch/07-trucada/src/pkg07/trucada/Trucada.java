/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.trucada;

import java.util.Scanner;       // FORMA 1 (amb scan)


/**
 *
 * @author vicent
 */

public class Trucada {

    // VARIABLES STATIQUES
    static double cost_addicional = 2;
    static double cost_normal = 0.06;

  
    
    
    public static void main(String[] args) {

        /* Calcula el total a pagar en una trucada telefònica considerant tota trucada que duri menys de 3 minuts 
        (5 passos) té un cost de 0,06 € Cada minut addicional té un cost de 2 €. 
Encara que el minut no hagi finalitzat el client pagarà tot el minut */
        // VARIABLES //
        Scanner scan = new Scanner(System.in);
        int durada;
        double total;

        System.out.println("dona'm la duració. de la trucada\n");
        durada = scan.nextInt();
        
        
        if (durada <= 3) {
            total = cost_normal * durada;
        } else {
            total = cost_normal * 3;
            durada = durada - 3;
            total = total + (durada * cost_addicional);
            durada = durada + 3;
        }

        System.out.println("El total de la trucada de " + durada + " minuts és: " + total + " €\n");

    }

}
