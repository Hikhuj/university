using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class PaisModel
    {

        private int codigoPais;
        private string pais;

        public PaisModel(int codigoPais, string pais)
        {
            this.codigoPais = codigoPais;
            this.pais = pais;
        }

        public int CodigoPais
        {
            get { return codigoPais; }
            set { codigoPais = value; }
        }

        public string Pais
        {
            get { return pais; }
            set { pais = value; }
        }

    }
}
