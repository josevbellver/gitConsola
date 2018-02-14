using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _02_Llibre
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }


        private void mostraInformacio(Llibre l)
        {
            // extraiem informació per pantalla
            LBText.Text = l.Titol;


            LBAny.Text = Convert.ToString(l.AnyEdicio);
            LBAutor.Text = l.Autor;
            LBColor.Text = l.ColorPortada1;
            LBContingut.Text = l.ContingutLlibre;
            LBDimensio.Text = l.Dimensions;
            LBpagines.Text = Convert.ToString(l.NumeroPagines);

            ////////////////////////////////
            // MÈTODE UTILITZAT EN JAVA 8 //
            //                            //
            //// extraiem informació per pantalla amg MÈTODES GET!!
            //LBText.Text = l.getTitol();
            //LBAny.Text = Convert.ToString(l.getAnyEdicio());
            //LBAutor.Text = l.getAutor();
            //LBColor.Text = l.getColorPortada();
            //LBContingut.Text = l.getContingutLlibre();
            //LBDimensio.Text = l.getDimensions();
            //LBpagines.Text = Convert.ToString(l.getNumeroPagines());

        }

        private void BEnrere_Click(object sender, EventArgs e)
        {        
            //construcció objecte per defecte
            Llibre lli1 = new Llibre("60x60",300,2018);

            mostraInformacio(lli1);

		}

		private void BAvant_Click(object sender, EventArgs e)
        {
            //construcció objecte amb variables "externes"            
            Llibre lli2 = new Llibre("java 9", 340, "60x60", "Vicent", "Gris", 2017, "contingutcontingutcontingut ");

            mostraInformacio(lli2);

        }

    }
}
