using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class LibroAutorModel
    {

        private int codigoLibro;
        private int codigoAutor;

        public LibroAutorModel(int codigoLibro, int codigoAutor)
        {
            this.codigoLibro = codigoLibro;
            this.codigoAutor = codigoAutor;
        }

        public int CodigoLibro
        {
            get { return codigoLibro; }
            set { codigoLibro = value; }
        }

        public int CodigoAutor
        {
            get { return codigoAutor; }
            set { codigoAutor = value; }
        }
    }
}
