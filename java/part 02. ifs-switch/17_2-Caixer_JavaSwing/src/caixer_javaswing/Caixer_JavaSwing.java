/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixer_javaswing;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class Caixer_JavaSwing {
// CONSTANTS
     static int pin=1234;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

    /**
     * @param args the command line arguments
     */
    
   
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
	double diners_totals=6000;	// comencem amb 6000 €
	int pin_usuari;
	String opcio;                   // opció a escollir de menú principal
        String [] OpcionsMenu={"Retirar Diners","Ingressar Diners","ConsultarDiners","Sortir"};	
        double diners_usuari;           // diners per treure/ingressar
	int op=-1;                      // Si l'usuari vol saldo negatiu
	double resta;                   // per comprovar el saldo negatiu
        String[] botons = { "Yes", "No", "Cancel" }; 
        Scanner scan=new Scanner(System.in);


        
        // PROGRAMA        
        

        pin_usuari=Integer.parseInt(JOptionPane.showInputDialog("Dona'm el PIN\n"));
        
	if (pin_usuari!=pin)
	{
		System.out.println("no tens el pin correcte. Sortim del programa\n\n");
                JOptionPane.showMessageDialog(null, "no tens el pin correcte. \n\nSortim del programa\n\n","ERROR",0);

	}
        else 
	{
		//imprimim el menú
            
                opcio=(String)JOptionPane.showInputDialog(null,"Escull la opcio","Menu Caixer",3,null,OpcionsMenu,OpcionsMenu[1]);

                switch (opcio)
		{
                    case "Sortir": System.exit(0);
                    break;
                    case "Retirar Diners":

                    diners_usuari=Double.parseDouble(JOptionPane.showInputDialog("Quant vols retirar?"));
                    resta=diners_totals-diners_usuari;
                    //COMPROVEM EL SALDO NEGATIU
                    if (resta <0)
                        op=JOptionPane.showOptionDialog(null,"Et quedaràs amb saldo negatiu\n Vols continuar?","SALDO NEGATIU",JOptionPane.WARNING_MESSAGE, 0, null, botons, botons[1]);
  
                    // SI NO ENS QUEDEM EN NEGATIU
                    // O HEM ACCEPTAT QUEDAR-NOS::
                    if (resta >=0 || op==0)
                    {
                        diners_totals=diners_totals-diners_usuari;
                        JOptionPane.showMessageDialog(null, "Et queden "+diners_totals+" € al banc","SALDO",1);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Gràcies. Adeu! \n\nEt queden "+diners_totals+" € al banc","SALDO",1);
                    break;
                    case "Ingressar Diners":
                        diners_usuari=Double.parseDouble(JOptionPane.showInputDialog("Quant vols ingressar?"));
			diners_totals=diners_totals+diners_usuari;
			//System.out.println("\n\n\t\t\tEt queden "+diners_totals+" € al banc");                  
	                JOptionPane.showMessageDialog(null, "Et queden "+diners_totals+" € al banc","SALDO",1);
                    break;
                    case "ConsultarDiners":
	                JOptionPane.showMessageDialog(null, "Et queden "+diners_totals+" € al banc","SALDO",1);
                    break;
                    default:
			System.out.println("\t\t\t\tOPCIÓ INCORRECTA\n");
                    break;
		}//FINAL SWITCH
	}//final else (imprimir menú)

        
System.out.println("\n\t\t\t Gràcies. Adéu! ('')--,--,-\n\n\n");
    }
}
