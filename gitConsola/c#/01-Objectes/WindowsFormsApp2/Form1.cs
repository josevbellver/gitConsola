using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {









        public Form1()
        {
            InitializeComponent();
        }

      
        
        private void BSuma_Click(object sender, EventArgs e)
        {
            int num1, num2, result;
            Metodes_2 met = new Metodes_2();

            num1 = Int32.Parse(TBNum1.Text);
            num2 = Int32.Parse(TBNum2.Text);

            result = met.Suma(num1, num2);

            LBEtiqueta.Text = Convert.ToString(result);

        }

        private void BResta_Click(object sender, EventArgs e)
        {
            int num1, num2, result;
            Metodes_2 met = new Metodes_2();

            num1 = Int32.Parse(TBNum1.Text);
            num2 = Int32.Parse(TBNum2.Text);

            result = met.Resta(num1, num2);

            LBEtiqueta.Text = Convert.ToString(result);

        }
    }
}
