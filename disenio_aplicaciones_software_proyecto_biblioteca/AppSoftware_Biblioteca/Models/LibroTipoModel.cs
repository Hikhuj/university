using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    class LibroTipoModel
    {
        private int codigoTipoLibro;
        private string tipo;

        public LibroTipoModel(int codigoTipoLibro, string tipo)
        {
            this.codigoTipoLibro = codigoTipoLibro;
            this.tipo = tipo;
        }

        public int CodigoTipoLibro
        {
            get { return codigoTipoLibro; }
            set { codigoTipoLibro = value; }
        }

        public string Tipo
        {
            get { return tipo; }
            set { tipo = value; }
        }

    }
}
