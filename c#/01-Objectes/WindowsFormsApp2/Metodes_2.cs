using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp2
{
    public class Metodes_2
    {

        ///////////////////////    
        // VARIABLES PRIVATE
        ///////////////////////
        private int result; // variable de la classe (propietat)


        /////////////////////
        // MÈTODES PÚBLICS //
        /////////////////////
        public String MetodeSenseParametres()
        {
            return "Aquest metode no te cap parametre";
            //System.out.println("Aquest metode no te cap parametre");
        }

        public int Suma(int a, int b)
        {
            // Aquest mètode té 2 paràmetres (a i b)
            result = a + b;
            return result;
        }

        public int Resta(int a, int b)
        {
            return a - b;
        }

       

    }
}
