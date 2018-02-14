/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.irpf;

import javax.swing.JOptionPane;

/**
 *
 * 
 * 
 * @author vicent
 * 
 */
public class IRPF {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        /*Calcula el salari net d’un treballador a partir de la lectura de les hores treballades i preu per hora, 
        sabent que hi ha un 10% de retenció d’IRPF.*/
        //variables
        int hores, ret;
        float sou_brut, preu_hora, sou_net;

        //programa
        ret = 10;

        hores = Integer.parseInt(JOptionPane.showInputDialog("Dona'm les hores treballades"));
        // Ara passem el preu total a float
        preu_hora = (float) Integer.parseInt(JOptionPane.showInputDialog("Dona'm el preu de les hores"));

        sou_brut = hores * preu_hora;
        sou_net = sou_brut - (sou_brut * ret / 100);

        JOptionPane.showMessageDialog(null, "\n\n El sou net amb \"retenció\" del " + ret + "% és: " + sou_net + " €\n\n", "SOU NET", 1);

    }
}
