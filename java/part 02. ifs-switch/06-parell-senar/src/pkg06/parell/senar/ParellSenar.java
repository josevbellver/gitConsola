/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.parell.senar;
import java.util.Scanner;       // FORMA 1 (amb scan)

/**
 *
 * @author vicent
 */
public class ParellSenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llegir un número entre i determinar si es parell o senar (if i switch)
        // MODIFICACIÓ: EL NÚMERO HA D'ESTAR ENTRE 1 i 10
        // VARIABLES
	int num;
        Scanner scan=new Scanner(System.in);
               
        // PROGRAMA
	System.out.println("dona'm el número \n");
        num = scan.nextInt();
        if ((num > 10) || (num<1))
        {
            System.out.println("El número "+num+" Ha d'estar entre 1 i 10\n");
        }
        else
        {
            if (num % 2==0)
            {
		System.out.println("El número "+num+" és parell\n");
            }
            else
            {
            	System.out.println("El número "+num+" és senar\n");
            }
        }


}
            
}
