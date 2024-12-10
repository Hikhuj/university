using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Controller
{
    class EditorialController
    {

        public static Boolean insertEditorial(string EDITORIAL_NAME)
        {
            // Denegar resultado si no se realiza accion
            Boolean result = false;
            // SQL query a ejecutar
            string sqlInsertEditorial = "INSERT INTO editorial (editorial) VALUES (@editorial)";

            // Conexion DB en String
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Crear conexion con DB creando objeto y agregando como parametro el DB string connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Crear un objecto de tipo SqlCommand que reciba el query y el conector SQL
                SqlCommand cmd = new SqlCommand(sqlInsertEditorial, sqlConnection);

                // Parametros a agregar para el comando por medio de un String Interpolation
                // Se asigna a que variable en el query va a subplantar, el tipo de dato y el valor que va a ingresar.
                cmd.Parameters.Add("@editorial", SqlDbType.NVarChar).Value = EDITORIAL_NAME;

                // Abrir conexion
                sqlConnection.Open();

                // Ejecutar el SQL query
                int evaluator = cmd.ExecuteNonQuery();

                // Evaluar si se vieron afectados rows en la transaccion
                if (evaluator > 0)
                {
                    // Query se ejecutó correctamente
                    result = true;
                }

                // Cerrar conexion;
                sqlConnection.Close();
            }

            return result;
        }

        public static int getEditorial(string EDITORIAL_NAME)
        {

            int editorialId = 0;

            // SQL query a ejecutar
            string sqlGetEditorial = "SELECT cod_editorial FROM editorial WHERE editorial=@editorial";

            // Conexion DB en String
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Crear conexion con DB creando objeto y agregando como parametro el DB string connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Crear un objecto de tipo SqlCommand que reciba el query y el conector SQL
                SqlCommand cmd = new SqlCommand(sqlGetEditorial, sqlConnection);

                // Parametros a agregar para el comando por medio de un String Interpolation
                // Se asigna a que variable en el query va a subplantar, el tipo de dato y el valor que va a ingresar.
                cmd.Parameters.Add("@editorial", SqlDbType.NVarChar).Value = EDITORIAL_NAME;

                // Abrir conexion
                sqlConnection.Open();

                // Ejecutar el SQL query
                editorialId = cmd.ExecuteNonQuery();

                // Cerrar conexion;
                sqlConnection.Close();
            }
            return editorialId;
        }

    }
}
