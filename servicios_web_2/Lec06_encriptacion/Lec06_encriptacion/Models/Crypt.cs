using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Web;

namespace Lec06_encriptacion.Models
{
    public class Crypt
    {
        public string encriptar(string cadena)
        {
            string resultado = string.Empty;
            // Con esto nos aseguramos que la cadena esta en bytes
            Byte[] encripta = new UnicodeEncoding().GetBytes(cadena);
            resultado = Convert.ToBase64String(encripta);
            return resultado;
        }

        public string desencriptar(string cadena)
        {
            string resultado = string.Empty;
            Byte[] desencripta = Convert.FromBase64String(cadena);
            resultado = new UnicodeEncoding().GetString(desencripta);
            return resultado;
        }
    }
}