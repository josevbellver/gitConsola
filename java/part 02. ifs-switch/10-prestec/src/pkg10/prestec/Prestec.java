/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.prestec;
import java.util.Scanner;

/**
 *
 * @author vicent
 */
public class Prestec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
   /*
Programa per determinar si un sol.licitant pot aconseguir un préstec. 

Haurà de demanar les dades per cada sol·licitant: 
 - Nom 
 - quantitat demanada
 - salari anual 
 - valor d'altres propietats. 

El banc només considerarà als sol.licitants amb un estat de crèdit bo. D'aquells, només acceptés els que tinguin més de 6 punts. Els punts s'obtenen de la manera següent:

5 punts si el salari és 50% del préstec o més.
3 punts si el salari és com a mínim 25%, però menys del 50% del préstec.
1 punt si el salari és com a mínim 10% però menys de 25% del préstec.

5 punts si es té una altra propietat del doble del préstec o més.
3 punts si es té una altra propietat igual o major al préstec però menor del doble.
*/

	/**********************/
	//variables
	/**********************/
	String nom;
	int punts=0;
	float demanda, salari, propietats;
        Scanner scan=new Scanner(System.in);



	/**********************/
	//recollim informació
	/**********************/
	System.out.println("Dona'm el nom\n");
	nom=scan.next();

	System.out.println("Dona'm la quantitat demandada\n");
	demanda=scan.nextFloat();
        
	System.out.println("Dona'm el salari\n");
	salari=scan.nextFloat();

	System.out.println("Valor d'altres propietats\n");
	propietats=scan.nextFloat();




	/***************/
	//calculem punts
	/***************/	
	punts=0;//primer posem valor a 0 els punts, per a començar a sumar-los després.

	//Primer respecte al salari
	if (salari >= 0.5*demanda)
		punts=5;			
		else if (salari >= 0.25*demanda)
			punts=3;
			else if (salari >= 0.1*demanda)
                            punts=1;
				

	//Ara respecte a les propietats
	if (propietats >= 2*demanda) //si es té una altra propietat del doble del préstec o més.
            punts=punts+5;	
		//si es té una altra propietat igual o major al préstec però menor del doble.
		else  if (propietats >= demanda)
			punts=punts+3;		
			

	/***********************/
	//imprimim els resultats
	/***********************/
	if (punts>=6)
		System.out.println("Podem donar el prèstec al senyor "+nom+" perquè té "+punts+" punts\n");
	else
		System.out.println("No podem donar el prèstec al senyor "+nom+" perquè té "+punts+" punts\n");


    }
    
}
