using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class AutorModel
    {

        private int codigoAutor;
        private string autor;

        public AutorModel(int codigoAutor, string autor){
            this.codigoAutor = codigoAutor;
            this.autor = autor;
        }

        public int CodigoAutor{
            get { return codigoAutor; }
            set { codigoAutor = value;}
        }

        public string Autor{
            get { return autor; }
            set { autor = value; }
        }

    }

}