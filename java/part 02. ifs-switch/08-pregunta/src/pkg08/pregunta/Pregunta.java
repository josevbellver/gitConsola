/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.pregunta;
import java.util.Scanner;


/**
 *
 * @author vicent
 */
public class Pregunta 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
   
        /*
        Pregunta la edat i el sexe i et diu si eres home o dona i si ets major d'edat o no.
        AMB ELSE IF
        */

        // VARIABLES
	char sexe;
	int edat;
        Scanner scan=new Scanner(System.in);
        
        // PROGRAMA
	System.out.println("Quants anys tens? \n");
	edat=scan.nextInt();

	System.out.println("De quin sexe eres? (H o D) \n");
        sexe=scan.next().charAt(0);
        
        if (edat>=18)
        { 	 	
			if (sexe=='D')
 	       			 System.out.println("Dona major d'edat\n");
			else if (sexe=='H')
		 		System.out.println("Home major d'edat\n");
			else
				System.out.println("No m'has dit si eres home o dona: "+sexe+"\n");
	}
	 else 
	{
			if (sexe=='D')
	   			 System.out.println("Dona menor d'edat\n");
			else if (sexe=='H')
	   			System.out.println("Home menor d'edat\n");
			else
				System.out.println("No m'has dit si eres home o dona\n");
	}
	System.out.println("Prem una tecla per continuar\n");
	//aquesta funció para l'execució fins que l'usuari pulse una tecla.
   } 


        
}
    
