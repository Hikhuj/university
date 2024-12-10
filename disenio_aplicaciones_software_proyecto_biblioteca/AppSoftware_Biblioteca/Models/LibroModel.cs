using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Permissions;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AppSoftware_Biblioteca.Models
{
    public class LibroModel
    {

        private int codigoLibro;
        private string isbn;
        private string titulo;
        private int codigoEditorial;
        private int codigoPais;
        private int tipoLibro;
        private DateTime fechaAdquisicion;

        public LibroModel(int codigoLibro, string isbn, string titulo, int codigoEditorial, int codigoPais, int tipoLibro, DateTime fechaAdquisicion)
        {
            this.codigoLibro = codigoLibro;
            this.isbn = isbn;
            this.titulo = titulo;
            this.codigoEditorial = codigoEditorial;
            this.codigoPais = codigoPais;
            this.tipoLibro = tipoLibro;
            this.fechaAdquisicion = fechaAdquisicion;
        }

        public int CodigoLibro
        {
            get { return codigoLibro; }
            set { codigoLibro = value; }
        }

        public string Isbn
        {
            get { return isbn; }
            set { isbn = value; }
        }

        public string Titulo
        { 
            get { return titulo; }
            set { titulo = value; }
        }

        public int CodigoEditorial
        { 
            get { return codigoEditorial; }
            set { codigoEditorial = value; }
        }

        public int CodigoPais
        { 
            get { return codigoPais; }
            set { codigoPais = value; }
        }

        public int TipoLibro
        { 
            get { return tipoLibro; }
            set { tipoLibro = value; }
        }

        public DateTime FechaAdquisicion
        { 
            get { return fechaAdquisicion; }
            set { fechaAdquisicion = value; }
        }

    }
}
