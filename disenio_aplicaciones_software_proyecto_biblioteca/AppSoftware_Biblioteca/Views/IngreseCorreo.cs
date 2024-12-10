using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;

namespace AppSoftware_Biblioteca.Views
{
    public partial class IngreseCorreo : Form
    {
        public IngreseCorreo()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {
            Boolean CorreoExiste(String CORREO)
            {
                Boolean result;
                String corr;

                string query = "SELECT correo FROM estudiante WHERE correo='" + CORREO + "'";

                // Crear conexion llamando a App.config
                string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

                // Crear conexion SQL
                SqlConnection connection = new SqlConnection(conn);

                // Crear adaptador SQL
                SqlDataAdapter dadapter = new SqlDataAdapter(query, connection);

                // Crear DataSet
                DataSet ds = new DataSet();

                // Abrir conexion
                connection.Open();

                dadapter.Fill(ds);

                corr = ds.Tables[0].Rows[0]["correo"].ToString();

                connection.Close();

                ds.Dispose();

                if (corr == CORREO)
                {
                    result = true;
                }
                else
                {
                    result = false;
                }

                Console.WriteLine("Correo ingresado: " + CORREO + ". Correo en el sistema: " + corr + ".");
                Console.WriteLine("Resultado: " + result);

                return result;
            }
        }
    }
}
