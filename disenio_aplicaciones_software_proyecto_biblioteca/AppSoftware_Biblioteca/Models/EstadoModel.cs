using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class EstadoModel
    {

        private int codigoEstado;
        private string estado;

        public EstadoModel(int codigoEstado, string estado)
        {
            this.codigoEstado = codigoEstado;
            this.estado = estado;
        }

        public int CodigoEstado
        {
            get { return codigoEstado; }
            set { codigoEstado = value; }
        }

        public string Estado
        {
            get { return estado; }
            set { estado = value; }
        }

    }
}
