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
    public partial class frm_Login : Form
    {
        public frm_Login()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            // Necesito conectarme a DevCom.
            // A: Referencio DevCom aca.

            // Si el usuario y contrasenia da TRUE
            if (DevCom.claveValida(txtbox_usuario.Text, txtbox_clave.Text))
            {

                // HIDE window
                this.Hide();

                // SHOW menu
                Form miformulario = new frm_Menu();
                miformulario.Show();
            }
            else
            {
                MessageBox.Show("Clave incorrecta", "Error");
            }
            
            //this.Dispose();
            //this.Hide();

        }

        private void button2_Click(object sender, EventArgs e)
        {

            //Application.Exit();
            this.Dispose();

        }

        private void txtbox_usuario_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
