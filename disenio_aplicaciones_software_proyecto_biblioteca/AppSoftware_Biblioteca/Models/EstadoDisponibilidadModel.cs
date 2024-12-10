using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AppSoftware_Biblioteca.Models
{
    public class EstadoDisponibilidadModel
    {

        private int codigoExistencia;
        private int codigoEstado;

        public EstadoDisponibilidadModel(int codigoExistencia, int codigoEstado)
        {
            this.codigoExistencia = codigoExistencia;
            this.codigoEstado = codigoEstado;
        }

        public int CodigoExistencia
        {
            get { return codigoExistencia; }
            set { codigoExistencia = value; }
        }

        public int CodigoEstado
        {
            get { return codigoEstado; }
            set { codigoEstado = value; }
        }

    }
}
