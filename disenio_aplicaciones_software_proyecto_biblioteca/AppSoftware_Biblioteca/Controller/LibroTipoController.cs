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
    class LibroTipoController
    {
        public static Boolean insertLibroTipo(string TIPO_LIBRO)
        {
            // Denegar resultado si no se realiza accion
            Boolean result = false;
            // SQL query a ejecutar
            string sqlInsertLibroTipo = "INSERT INTO libro_tipo (tipo) VALUES (@tipo)";

            // Conexion DB en String
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Crear conexion con DB creando objeto y agregando como parametro el DB string connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Crear un objecto de tipo SqlCommand que reciba el query y el conector SQL
                SqlCommand cmd = new SqlCommand(sqlInsertLibroTipo, sqlConnection);

                // Parametros a agregar para el comando por medio de un String Interpolation
                // Se asigna a que variable en el query va a subplantar, el tipo de dato y el valor que va a ingresar.
                cmd.Parameters.Add("@tipo", SqlDbType.NVarChar).Value = TIPO_LIBRO;

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

        public static int getLibroTipo(string TIPO_LIBRO)
        {

            int libroTipoId = 0;

            // SQL query a ejecutar
            string sqlGetLibroTipo = "SELECT cod_tipoLibro FROM libro_tipo WHERE tipo=@tipo";

            // Conexion DB en String
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Crear conexion con DB creando objeto y agregando como parametro el DB string connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Crear un objecto de tipo SqlCommand que reciba el query y el conector SQL
                SqlCommand cmd = new SqlCommand(sqlGetLibroTipo, sqlConnection);

                // Parametros a agregar para el comando por medio de un String Interpolation
                // Se asigna a que variable en el query va a subplantar, el tipo de dato y el valor que va a ingresar.
                cmd.Parameters.Add("@tipo", SqlDbType.NVarChar).Value = TIPO_LIBRO;

                // Abrir conexion
                sqlConnection.Open();

                // Ejecutar el SQL query
                libroTipoId = cmd.ExecuteNonQuery();

                // Cerrar conexion;
                sqlConnection.Close();
            }
            return libroTipoId;
        }
    }
}
