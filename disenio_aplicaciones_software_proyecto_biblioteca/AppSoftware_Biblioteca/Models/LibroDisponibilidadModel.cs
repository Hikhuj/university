using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class LibroDisponibilidadModel
    {

        private int codigoExistencia;
        private int codigoLibro;

        public LibroDisponibilidadModel(int codigoExistencia, int codigoLibro)
        {
            this.codigoExistencia = codigoExistencia;
            this.codigoLibro = codigoLibro;
        }

        public int CodigoExistencia
        {
            get { return codigoExistencia; }
            set { codigoExistencia = value; }
        }

        public int CodigoLibro
        {
            get { return codigoLibro; }
            set { codigoLibro = value; }
        }

    }
}
