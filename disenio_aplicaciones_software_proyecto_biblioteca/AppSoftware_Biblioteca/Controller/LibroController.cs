using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Controller
{
    class LibroController
    {

        public static Boolean libroExiste(String ISBN)
        {

            Boolean result = false;
            String isbn;
            string query = string.Format("SELECT ISBN FROM libro WHERE ISBN='{0}';", ISBN.Trim());
            string conn;
            SqlConnection connection;
            SqlDataAdapter dadapter;
            DataSet ds = new DataSet();

            conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;
            connection = new SqlConnection(conn);
            dadapter = new SqlDataAdapter(query, connection);
            ds = new DataSet();

            // OPEN Connection
            connection.Open();

            // SAVE data on dataSet
            dadapter.Fill(ds);

            // CHECK si el resultado de SQL es Null
            if (ds.Tables[0].Rows.Count != 0)
            {
                // GET ISBN on variable
                isbn = ds.Tables[0].Rows[0]["ISBN"].ToString();

                if (isbn == ISBN)
                {
                    result = true;
                }
            }

            // CLOSE connection
            connection.Close();
            // DISCARD dataSet
            ds.Dispose();

            return result;

        }

        public static Boolean insertLibro(string ISBN, string TITULO, string EDITORIAL, string PAIS, string TIPO_LIBRO, string FECHA_COMPRA)
        {
            Boolean result = false;

            string sqlInsertLibro = "INSERT INTO libro(ISBN, titulo, cod_editorial, cod_pais, cod_tipoLibro, fecha_adquisicion) VALUES (@ISBN, @titulo, @cod_editorial, @cod_pais, @cod_tipoLibro, @fecha_adquisicion)";

            string conn = ConfigurationManager.ConnectionStrings["ConexionDB"].ConnectionString;

            using (SqlConnection sqlConnection = new SqlConnection(conn))
            {
                SqlCommand cmd = new SqlCommand(sqlInsertLibro, sqlConnection);

                Boolean resultEditorial = EditorialController.insertEditorial(EDITORIAL);
                Boolean resultPais = PaisController.insertPais(PAIS);
                Boolean resultTipoLibro = LibroTipoController.insertLibroTipo(TIPO_LIBRO);

                if (resultEditorial && resultPais && resultTipoLibro)
                {
                    cmd.Parameters.Add("@ISBN", SqlDbType.NVarChar).Value = ISBN;
                    cmd.Parameters.Add("@titulo", SqlDbType.NVarChar).Value = TITULO;
                    cmd.Parameters.Add("@cod_editorial", SqlDbType.Int).Value = EditorialController.getEditorial(EDITORIAL);
                    cmd.Parameters.Add("@cod_pais", SqlDbType.Int).Value = PaisController.getPais(PAIS);
                    cmd.Parameters.Add("@cod_tipoLibro", SqlDbType.Int).Value = LibroTipoController.getLibroTipo(TIPO_LIBRO);
                    cmd.Parameters.Add("@fecha_adquisicion", SqlDbType.DateTime).Value = "05-05-1990";

                    sqlConnection.Open();

                    int evaluator = cmd.ExecuteNonQuery();

                    if (evaluator > 0)
                    {
                        result = true;
                    }

                    sqlConnection.Close();
                }
            }
            return result;
        }

    }
}
