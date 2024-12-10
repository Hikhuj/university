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
    class PaisController
    {

        public static Boolean insertPais(string PAIS)
        {
            // Denegar resultado si no se realiza accion
            Boolean result = false;
            // SQL query a ejecutar
            string sqlInsertPais = "INSERT INTO pais (pais) VALUES (@pais)";

            // Conexion DB en String
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Crear conexion con DB creando objeto y agregando como parametro el DB string connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Crear un objecto de tipo SqlCommand que reciba el query y el conector SQL
                SqlCommand cmd = new SqlCommand(sqlInsertPais, sqlConnection);

                // Parametros a agregar para el comando por medio de un String Interpolation
                // Se asigna a que variable en el query va a subplantar, el tipo de dato y el valor que va a ingresar.
                cmd.Parameters.Add("@editorial", SqlDbType.NVarChar).Value = PAIS;

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

        public static int getPais(string PAIS)
        {
            int tipoLibroId = 0;

            // SQL query a ejecutar
            string sqlGetPais = "SELECT cod_pais FROM pais WHERE pais=@pais";

            // Conexion DB en String
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Crear conexion con DB creando objeto y agregando como parametro el DB string connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Crear un objecto de tipo SqlCommand que reciba el query y el conector SQL
                SqlCommand cmd = new SqlCommand(sqlGetPais, sqlConnection);

                // Parametros a agregar para el comando por medio de un String Interpolation
                // Se asigna a que variable en el query va a subplantar, el tipo de dato y el valor que va a ingresar.
                cmd.Parameters.Add("@pais", SqlDbType.NVarChar).Value = PAIS;

                // Abrir conexion
                sqlConnection.Open();

                // Ejecutar el SQL query
                tipoLibroId = cmd.ExecuteNonQuery();

                // Cerrar conexion;
                sqlConnection.Close();
            }
            return tipoLibroId;
        }

    }
}
