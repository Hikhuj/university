using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class CatalogoModel
    {
        private int codigo_catalogo;
        private string catalogo;

        public CatalogoModel(int codigo_catalogo, string catalogo)
        {
            this.codigo_catalogo = codigo_catalogo;
            this.catalogo = catalogo;
        }

        public int Codigo_catalogo
        {
            get { return codigo_catalogo; }
            set { codigo_catalogo = value; }
        }

        public string Catalogo
        {
            get { return catalogo; }
            set { catalogo = value; }
        }

    }
}
