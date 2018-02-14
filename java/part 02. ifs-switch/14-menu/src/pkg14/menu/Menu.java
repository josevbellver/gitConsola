/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.menu;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
4) Mostra un menú per pantalla amb 2 entrades: 1) Saluda 2) Despedir-te.
Si premem saluda apareixerà un missatge que ens dirà “Hola”
Si premem Despedir-te  apareixerà un missatge que ens dirà “Adiós”
Si premem altra tecla apareixerà un missatge que ens diga “Opció no vàlida”
*/


	int opcio;
        Scanner scan=new Scanner(System.in);
	
	System.out.println("\n\n");
	System.out.println("\t\t     MENU     ");
	System.out.println("\t\t**************\n");
	System.out.println ("\t\t1) Saludar");
	System.out.println ("\t\t2) Despedir-te");
System.out.println("\n\n\t\t");

        opcio=scan.nextInt();
	switch (opcio) 
	{
		case 1:
			System.out.println ("\n\t\tHola!\n");
		break;

		case 2:
			System.out.println ("\n\t\tAdéu!\n");
		break;

		default:
                     JOptionPane.showMessageDialog(null, "\n\t\tOpció no vàlida\n","ERROR",0);
		break;
	}

System.out.println("\n\n\n");



    }
    
}
