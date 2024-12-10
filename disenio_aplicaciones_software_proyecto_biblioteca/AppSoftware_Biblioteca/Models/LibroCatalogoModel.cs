using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class LibroCatalogoModel
    {

        private int codigoLibro;
        private int codigoCatalogo;

        public LibroCatalogoModel(int codigoLibro, int codigoCatalogo)
        {
            this.codigoLibro = codigoLibro;
            this.codigoCatalogo = codigoCatalogo;
        }

        public int CodigoLibro
        {
            get { return codigoLibro; }
            set { codigoLibro = value; }
        }

        public int CodigoCatalogo
        {
            get { return codigoCatalogo; }
            set { codigoCatalogo = value; }
        }

    }
}
