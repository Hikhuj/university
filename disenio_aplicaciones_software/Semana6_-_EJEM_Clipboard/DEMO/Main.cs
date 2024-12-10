using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DEMO
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }

        private void btn_Traer_Click(object sender, EventArgs e)
        {
            textBox1.Text = Clipboard.GetText();
        }

        private void btn_Dejar_Click(object sender, EventArgs e)
        {
            // Le quiero asignar texto.
            // Puedo escribir: imagen, texto, archivos
            Clipboard.SetText(textBox1.Text);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();

            Imagen frm = new Imagen();

            frm.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //this.close();

            Application.Exit();

        }
    }
}
