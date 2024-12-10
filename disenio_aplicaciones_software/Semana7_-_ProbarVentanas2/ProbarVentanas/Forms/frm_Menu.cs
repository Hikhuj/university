using ProbarVentanas.Forms;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProbarVentanas
{
    public partial class frm_Menu : Form
    {
        public frm_Menu()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            //this.Dispose();
            Application.Exit();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            Form miformulario = new frm_Depositar();
            miformulario.Show();


        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form miformulario = new frm_Retirar();
            miformulario.Show();

        }

        private void button4_Click(object sender, EventArgs e)
        {
            Form miformulario = new  frm_Reporte();
            miformulario.Show();
        }
    }
}
