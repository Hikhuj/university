using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class EditorialModel{

        private int codigo_editorial;
        private string editorial;

        public EditorialModel(int codigo_editorial, string editorial)
        {
            this.codigo_editorial = codigo_editorial;
            this.editorial = editorial;
        }

        public int Codigo_editorial
        {
            get { return codigo_editorial; }
            set { codigo_editorial = value; }
        }

        public string Editorial
        {
            get { return editorial; }
            set { editorial = value; }
        }

    }
}