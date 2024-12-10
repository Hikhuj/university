using AppSoftware_Biblioteca.Controller;
using AppSoftware_Biblioteca.Views;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AppSoftware_Biblioteca
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

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void btn_ingresar_Click(object sender, EventArgs e)
        {
            // Necesito conectarme a DevCom.
            // A: Referencio DevCom aca.

            // Si el usuario y contrasenia da TRUE
            if (EstudianteController.estudianteExiste(txtbox_usuario.Text, txtbox_clave.Text))
            {

                // HIDE window
                this.Hide();

                // SHOW menu
                Form form_menu = new frm_Menu();
                form_menu.Show();

            }
            else
            {
                MessageBox.Show("Clave incorrecta", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

            //this.Dispose();
            //this.Hide();
        }

        private void btn_salir_Click(object sender, EventArgs e)
        {
            //Application.Exit();
            this.Dispose();
        }
    }
}
