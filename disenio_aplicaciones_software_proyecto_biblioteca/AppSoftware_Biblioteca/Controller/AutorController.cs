using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Controller
{
    class AutorController
    {
        public static Boolean insertAutor(string AUTOR_NAME)
        {
            // Resultado final
            Boolean result = false;

            // String que contiene el Query en SQL
            string sqlInsertAutor = "INSERT INTO autor(autor) VALUES (@autor)";

            // Crear string con el String Connection
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Realizar una accion usando el objeto de tipo SqlConnection que reciba el String Connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Objeto de tipo SqlQuery con el Query y SqlConnection como parametros
                SqlCommand cmd = new SqlCommand(sqlInsertAutor, sqlConnection);

                // Agregar el valor necesario para realizar el Query
                cmd.Parameters.Add("@autor", SqlDbType.NVarChar).Value = AUTOR_NAME;

                // Abrir la conexion
                sqlConnection.Open();

                // Ejecutar el Query y obtener la cantidad de rows afectadas
                int evaluator = cmd.ExecuteNonQuery();

                // Evaluar si se vieron afectados los rows en la transaccion
                if (evaluator > 0)
                {
                    // Query se ejecutó correctamente
                    result = true;
                }

                // Cerrar conexion
                sqlConnection.Close();
            }

                return result;
        }
        
        public static int getAutor(string AUTOR)
        {
            int autorId = 0;

            // SQL query a ejecutar
            string sqlGetEditorial = "SELECT cod_autor FROM autor WHERE autor=@autor";

            // Conexion DB en String
            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            // Crear conexion con DB creando objeto y agregando como parametro el DB string connection
            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                // Crear un objecto de tipo SqlCommand que reciba el query y el conector SQL
                SqlCommand cmd = new SqlCommand(sqlGetEditorial, sqlConnection);

                // Parametros a agregar para el comando por medio de un String Interpolation
                // Se asigna a que variable en el query va a subplantar, el tipo de dato y el valor que va a ingresar.
                cmd.Parameters.Add("@autor", SqlDbType.NVarChar).Value = AUTOR;

                // Abrir conexion
                sqlConnection.Open();

                // Ejecutar el SQL query
                autorId = cmd.ExecuteNonQuery();

                // Cerrar conexion;
                sqlConnection.Close();
            }

            return autorId;
        }


    }
}
