using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Lec06_encriptacion.Data
{
    public class Login
    {
        private string nombre;

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }

        private string contrasenia;

        public string Contrasenia
        {
            get { return contrasenia; }
            set { contrasenia = value; }
        }

    }
}