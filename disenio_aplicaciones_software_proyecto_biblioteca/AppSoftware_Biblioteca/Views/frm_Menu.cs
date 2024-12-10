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

namespace AppSoftware_Biblioteca.Views
{
    public partial class frm_Menu : Form
    {
        public frm_Menu()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            Form form_libro = new Libro();
            form_libro.Show();
        }

        private void Btn_abrirLibros_Click(object sender, EventArgs e)
        {
            this.Hide();
            Form form_libro = new Libro();
            form_libro.Show();
        }

        private void Btn_abrirEstudiantes_Click(object sender, EventArgs e)
        {
            this.Hide();
            Form Form_frm_estudianteView = new frm_EstudianteView();
            Form_frm_estudianteView.Show();
        }
    }
}
