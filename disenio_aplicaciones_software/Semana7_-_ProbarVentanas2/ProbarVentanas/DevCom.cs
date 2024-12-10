using System;
using System.Data;

using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;


namespace ProbarVentanas
{
    class DevCom
    {
        /*
        Se usa un archivo CNN.CONFIG para conectarse a la base de datos
        Line 1: nombre del sistema a donde se conecta
        Line 2: nombre de la base de datos
        Line 3: Usuario y Contrasela con la cual conectarse (decimal seguridad, pero no se necesita por ahora)

        Este archivo se pone en proyectName/bin/debug por ahora
        */

        public static DataSet GetData()
        {
            // Funcion que retorna un dataSet
            SqlConnection conx = new SqlConnection();

            // Lee un archivo de texto sobre la DB, establece y abre la conexion a la DB y se almacena en esta variable de tipo SqlConnection
            conx = RetornaAcceso();

            // Objeto que me permite crear un adaptador.
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM CAT_USERS", conx); // no esta hecho para manejar los resultados por lo que no puede hacer todo con los datos
            DataSet ds = new DataSet();

            // deposita los resultados del SqlDataAdapter en el DataSet
            da.Fill(ds);
            
            // Retorna los resultados
            return ds;
        }

        public DataSet GetCuenta(String XData)
        {
            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();

            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM CAT_CUENTAS WHERE ID='" + XData +  "'", conx);
            DataSet ds = new DataSet();
            da.Fill(ds);
            return ds;
        }

        public static DataSet GetDataMovtos()
        {
            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();

           
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM CAT_CUENTAS", conx);
            DataSet ds = new DataSet();
            da.Fill(ds);
            return ds;
        }

        public static String ConsultarClave(String Usr, String Pwd)
        {
            String abc = "";
            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();

            SqlDataAdapter da = new SqlDataAdapter("SELECT COUNT(USERNAME) as DATA FROM CAT_USERS WHERE USERNAME='" + Usr + "' AND PASSWORD='" + Pwd + "'", conx);

            DataSet ds = new DataSet();

            da.Fill(ds);
            abc = ds.Tables[0].Rows[0]["DATA"].ToString();
            return abc;
        }

        /*
        public static Boolean consultarCuenta(string idCuenta)
        {
            string data = "";
            Boolean resultado = false;

            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();

            SqlDataAdapter da = new SqlDataAdapter("SELECT ID FROM CAT_CUENTAS WHERE ID ='" + idCuenta + "'", conx);
            DataSet ds = new DataSet();

            da.Fill(ds);

            data = ds.Tables[0].Rows[0]["DATA"].ToString();

            da.Dispose();

            if (data == idCuenta)
            {
                resultado = true;
            }

            return resultado;
        }
        */

        public static Boolean claveValida(String Usr, String Pwd)
        {
            // Crear una variable resultado para ser usada más adelante
            String resultado = "";
            // Crear objeto de tipo DataSet para manipular los datos retornados de la consulta.
            DataSet ds = new DataSet();
            // Se crea una conexion de base de datos, Objeto de tipo SqlConnection
            SqlConnection conx = new SqlConnection();


            // Se llama a la funcion RetornaAcceso
            conx = RetornaAcceso();

            // Inicializar el objeto SqlDataAdapter con el resultado de la consulta a realizar, Appending User, Pass y conexion.
            // Consulta: Retorna un conteo de cuandos usuarios tienen el User y Pass igual a los parametros recibidos.
            SqlDataAdapter da = new SqlDataAdapter("SELECT COUNT(USERNAME) as DATA FROM CAT_USERS WHERE USERNAME='" + Usr + "' AND PASSWORD='" + Pwd + "'", conx);

            // Llenar el objeto DS con los datos retornados de DA con la funcion .Fill()
            da.Fill(ds);

            // Se toma el objeto DataSet y se almacena en una variable tipo String
            resultado = ds.Tables[0].Rows[0]["DATA"].ToString();

            // Se deshecha el objeto DataSet.
            ds.Dispose();


            if (resultado == "1")
            {
                return true;
            }
            else
            {
                return false;
            }

            
        }

        public static DataSet consultaGeneral(String Sql)
        {
            String Resultado = "";
            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();

            SqlDataAdapter da = new SqlDataAdapter(Sql, conx);

            DataSet ds = new DataSet();

            da.Fill(ds);
            Resultado = ds.Tables[0].Rows[0]["DATA"].ToString();
            //ds.Dispose();

            //if (Resultado == "1") return true;
            //else return false;

            return ds;


        }

        public  void IngresaCuenta(String ID, String Nombre_Cliente, String SALDO_ACTUAL)
        {
            /*string constr = ConfigurationManager.ConnectionStrings["constr"].ConnectionString;*/

            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();


            using (SqlCommand cmd = new SqlCommand("INSERT INTO CAT_CUENTAS (ID, NOMBRE_CLIENTE, SALDO_ACTUAL) " +
                " VALUES (@ID, @NOMBRE_CLIENTE, @SALDO_ACTUAL)"))

            {
                cmd.Parameters.AddWithValue("@ID", ID);
                cmd.Parameters.AddWithValue("@NOMBRE_CLIENTE", Nombre_Cliente);
                cmd.Parameters.AddWithValue("@SALDO_ACTUAL", SALDO_ACTUAL);

                cmd.Connection = conx;
                conx.Open();
                cmd.ExecuteNonQuery();
                conx.Close();
            }

        }

        public static void ActualizarCuenta(String ID, String Nombre_Cliente, String SALDO_ACTUAL) {
            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();
            using (SqlCommand cmd = new SqlCommand("UPDATE CAT_CUENTAS SET ID=@ID,  " +
                " NOMBRE_CLIENTE=@NOMBRE_CLIENTE, SALDO_ACTUAL=@SALDO_ACTUAL " +
                " WHERE ID=@ID"))

            {
                cmd.Parameters.AddWithValue("@ID", ID);
                cmd.Parameters.AddWithValue("@NOMBRE_CLIENTE", Nombre_Cliente);
                cmd.Parameters.AddWithValue("@SALDO_ACTUAL", SALDO_ACTUAL);

                cmd.Connection = conx;
                conx.Open();
                cmd.ExecuteNonQuery();
                conx.Close();
            }



        }

        public static void DepositarCuenta(String ID, String SALDO_ACTUAL)
        {
            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();
            using (SqlCommand cmd = new SqlCommand("UPDATE CAT_CUENTAS" +
                " SET SALDO_ACTUAL=@SALDO_ACTUAL " +
                " WHERE ID=@ID"))

            {
                cmd.Parameters.AddWithValue("@ID", ID);
                cmd.Parameters.AddWithValue("@SALDO_ACTUAL", SALDO_ACTUAL);

                cmd.Connection = conx;
                conx.Open();
                cmd.ExecuteNonQuery();
                conx.Close();
            }



        }

        public static String RetornaDataConfig() {

            // Retorna la configuracion de la base de datos que se almacena por lo general en el
            // projectName/bin/debugAnd-OrRelease/CNN.CONFIG

            String Server = "";
            String Catalog= "";
            String Security = "";

            // Se llama a la clase que permite tomar el archivo y almacenarlo en un objeto de tipo StreamReader.
            System.IO.StreamReader file =
                new System.IO.StreamReader(@"CNN.CONFIG");

            // Almacenar cada linea que se necesita en su respectiva categoria
            Server = file.ReadLine();
            Catalog= file.ReadLine();
            Security = file.ReadLine();

            // Retornar el archivo en un StringChain
            return "Data Source=" + Server + "; Initial Catalog='" + Catalog + "';  " + Security + " " ;
        }

        public static SqlConnection RetornaAcceso() {
            // Funcion reforna la conexion a la base de datos

            // Crear objeto de tipo SqlConnection para almacenar la conexion.
            SqlConnection conecta = new SqlConnection();

            // Se almacena en el objeto *conecta* los parametros de conexion a la DB,
            // Se hace llamado del metdo RetornaDataConfig para que retorne la configuracion de la DB
            conecta.ConnectionString = RetornaDataConfig();

            // Retorna conexion
            return conecta;
        }

        public void IngresaMovimiento(String ID_CUENTA, String ID_MOVTO, Double MONTO_MOVTO)
        {
            /*string constr = ConfigurationManager.ConnectionStrings["constr"].ConnectionString;*/
            
            SqlConnection conx = new SqlConnection();
            conx = RetornaAcceso();


            using (SqlCommand cmd = new SqlCommand("INSERT INTO TRA_CUENTAS (ID_CUENTA, ID_MOVTO, MONTO_MOVTO) " +
                " VALUES (@ID_CUENTA, @ID_MOVTO, @MONTO_MOVTO)"))

            {
                cmd.Parameters.AddWithValue("@ID_CUENTA", ID_CUENTA);
                cmd.Parameters.AddWithValue("@ID_MOVTO", ID_MOVTO);
                cmd.Parameters.AddWithValue("@MONTO_MOVTO", MONTO_MOVTO);

                cmd.Connection = conx;
                conx.Open();
                cmd.ExecuteNonQuery();
                conx.Close();
            }

        }

    }
}
