using AppSoftware_Biblioteca.Controller;
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
    public partial class Libro : Form
    {
        public Libro()
        {
            InitializeComponent();
        }

        private void btn_salir_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btn_Buscar_Click_2(object sender, EventArgs e)
        {

        }

        private void btn_buscar_por_isbn_Click(object sender, EventArgs e)
        {

        }

        private void btn_buscar_por_isbn_Click_1(object sender, EventArgs e)
        {
            int length_txt_buscar_libro_titulo = Txt_buscar_libro_titulo.Text.Trim().Length;

            try
            {
                // Evaluar si INPUT esta vacio o 
                if (String.IsNullOrEmpty(Txt_buscar_libro_titulo.Text.Trim()) || length_txt_buscar_libro_titulo > 15)
                {
                    MessageBox.Show("No ha ingresado un ISBN o bien es muy largo", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
                else
                {
                    if (LibroController.libroExiste(Txt_buscar_libro_titulo.Text.Trim()))
                    {
                        MessageBox.Show("El libro ya existe, no puede agregarse", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                    else
                    {
                        MessageBox.Show("El ISBN no existe, puede ser agregado", "Válido", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Exception: {0}", ex.Message);
            }
}

        private void btn_libro_agregar_Click(object sender, EventArgs e)
        {
            int length_txt_libro_agregar_isbn = txt_libro_agregar_isbn.Text.Trim().Length;

            try
            {
                // Evaluar si INPUT esta vacio o 
                if (String.IsNullOrEmpty(txt_libro_agregar_isbn.Text.Trim()) || length_txt_libro_agregar_isbn > 15)
                {
                    MessageBox.Show("No ha ingresado un ISBN o bien es muy largo", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
                else
                {
                    if (LibroController.libroExiste(txt_libro_agregar_isbn.Text.Trim()))
                    {
                        MessageBox.Show("El libro ya existe, no puede agregarse", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                    else
                    {
                        MessageBox.Show("El ISBN es válido, guardando datos, por favor haga click en el botón para continuar", "Válido", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        /*
                        if (LibroController.guardarLibro(txt_libro_agregar_isbn.Text.Trim(), txt_libro_agregar_titulo.Text, txt_libro_agregar_autor.Text, txt_libro_agregar_editorial.Text, txt_libro_agregar_pais.Text, txt_libro_agregar_tipo.Text, "date test"))
                        {
                            MessageBox.Show("Libro guardado correctamente", "Válido", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        }
                        else
                        {
                            MessageBox.Show("Disculpas, en estos momentos no se puede agregar este libro", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                        }
                        */

                        Boolean result = LibroController.insertLibro(txt_libro_agregar_pais.Text);

                        if (result)
                        {
                            MessageBox.Show("Libro guardado correctamente", "Válido", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        }
                        else
                        {
                            MessageBox.Show("Disculpas, en estos momentos no se puede agregar este libro", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                        }

                    }
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Exception: {0}", ex.Message);
            }

            txt_libro_agregar_autor.Text = String.Empty;
            txt_libro_agregar_editorial.Text = String.Empty;
            Txt_buscar_libro_titulo.Text = String.Empty;

        }

        private void Libro_Load(object sender, EventArgs e)
        {

        }

        private void btn_salir_Click_1(object sender, EventArgs e)
        {
            
        }

        private void btn_eliminar_Click_1(object sender, EventArgs e)
        {

        }

        private void btn_nuevo_Click_1(object sender, EventArgs e)
        {

        }

        private void btn_guardar_Click_1(object sender, EventArgs e)
        {

        }
    }
}
