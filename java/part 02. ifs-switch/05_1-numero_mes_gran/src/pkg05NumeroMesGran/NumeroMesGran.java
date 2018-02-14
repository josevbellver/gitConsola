/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05NumeroMesGran;

import java.util.Scanner;       // FORMA 1 (amb scan)

/**
 *
 * @author vicent
 */
public class NumeroMesGran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Donat 2 nombres, que suposarem diferents, determineu quin és el més gran.
        //* variables *//
        int a, b, gran;
        Scanner scan = new Scanner(System.in);

        //* programa *//
        System.out.println("Dona'm el primer numero: \n");

        a = scan.nextInt();
        System.out.println("Dona'm el segon numero: \n");
        b = scan.nextInt();

        // inicialitzem la variable gran
        gran = 0;

        if (a == b) {

            System.out.println("\n\n\tELS NÚMEROS HAN DE SER DIFERENTS!!\n");
        } else {
            if (a > b) {
                gran = a;
            } else {
                gran = b;
            }
            System.out.println("El numero més gran es=" + gran + "\n");

        }
    }
}
