/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.pantalons;
import java.util.Scanner;

/**
 *
 * @author vicent
 */
public class Pantalons {
static double descompte1=0.15;
static double descompte2=0.30;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
20*/

        ///////////////
        // VARIABLES //
        ///////////////
	int num_pantalons;
	double preu, total=0;
        Scanner scan=new Scanner(System.in);
        
        
        // PROGRAMA //
	System.out.println("Dona'm el numero de pantalons\n");
        num_pantalons=scan.nextInt();

        
	System.out.println("Ara dona'm el preu dels pantalons\n");
	preu=scan.nextDouble();

	if (num_pantalons < 5 && num_pantalons >0)
	{
		total=num_pantalons*preu;
	}
		else if ((num_pantalons >= 5) && (num_pantalons < 12))
		{
			total=(num_pantalons * preu) - ((num_pantalons * preu)*descompte1);
		}
			else if (num_pantalons > 12)
			{
				total=(num_pantalons * preu) - ((num_pantalons * preu)*descompte2);
			}
        else
        {
            System.out.println("El num de pantalons no pot ser inferior a 1");
        }

	System.out.println("El preu total és de "+total+" € \n");
    }
    
}
