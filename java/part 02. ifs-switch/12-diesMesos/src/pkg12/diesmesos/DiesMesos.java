/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.diesmesos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class DiesMesos {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        /*
Programa que demani el numero de mes (de l'1 al 12) i imprimiu el numero de dies que té el mes, on:
 
 - El mes 2 té 28 dies (oblidem-nos ja dels bisiests)
 - Els mesos 4,6,9 i 11 tenen 30 dies
 - Els mesos 1,3,5,7,8,10 i 12 tenen 31 dies

Si dóna un mes diferent als anteriors haurà imprimir el missatge "MES ERRONI".
*/
	int mes;
        Scanner scan=new Scanner(System.in);        
        
	System.out.println("Dona'm el numero de mes\n");
	mes=scan.nextInt();

	if (mes==2)
	{
		System.out.println("Tenim 28 dies\n");
	}
		else if ((mes==4) || (mes==6) || (mes==9) || (mes==11))
		{
			System.out.println("Tenim 30 dies \n");
		}
			else if ((mes==1) || (mes==3) || (mes==5) || (mes==7) || (mes==8) || (mes==10) || (mes==12))
			{
				System.out.println("Tenim 31 dies \n");
			}
			else
			{
				System.out.println("MES ERRONI \n");
                                JOptionPane.showMessageDialog(null, "MES ERRONI\n","ERROR",0);
			}
                                
	
    }
    
    
}
