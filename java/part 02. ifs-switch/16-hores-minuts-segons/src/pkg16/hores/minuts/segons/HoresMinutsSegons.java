/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.hores.minuts.segons;

import java.util.Scanner;

/**
 *
 * @author vicent
 */
public class HoresMinutsSegons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
Donat un valor que llegim pel dispositiu d’entrada, valor que representa un nombre de segons, dissenyeu un algorisme que calculi l’equivalència en hores, minuts i segons.
*/
	int s;
	int hores, minuts, segons;
        Scanner scan=new Scanner(System.in);
        

	System.out.println("Introdueix el nombre de segons\n");
        s=scan.nextInt();

	hores=s/3600;
	minuts=(s/60)-(hores * 60);
	segons=s%60;

	System.out.println("Tenim "+hores+" hores, "+minuts+" minuts i "+segons+" segons\n");

    }
    
}
