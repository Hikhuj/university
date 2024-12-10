using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Windows.Forms;

namespace AppSoftware_Biblioteca.Controller
{
    public class EstudianteController
    {

        public static Boolean estudianteExiste(String CORREO, String CONTRASENIA)
        {
            Boolean result = false;
            String pass;

            string query = "SELECT contrasenia FROM estudiante WHERE correo='" + CORREO + "'";

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
            // Llenar con datos el DS
            dadapter.Fill(ds);
            // SAVE password
            pass = ds.Tables[0].Rows[0]["CONTRASENIA"].ToString();
            // Cerrar conexion siempre
            connection.Close();
            // Destruir el DataSet ds
            ds.Dispose();
            
            // Evaluar si es Null, Vacio o Espacio en Blanco
            if (String.IsNullOrEmpty(pass) || String.IsNullOrWhiteSpace(pass))
            {
                // Mensaje de error: Dato no ingresado
                MessageBox.Show("No a ingresado contraseña", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                // Mensaje de error: 
                if (pass == CONTRASENIA)
                {
                    result = true;
                    Console.WriteLine("Contrasenia dada: " + CONTRASENIA + ". Contrasenia de sistema: " + pass + ".");
                    Console.WriteLine("Resultado: " + result);
                }
                else
                {
                    MessageBox.Show("Contraseña incorrecta", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }

            return result;
        }

    }
}
