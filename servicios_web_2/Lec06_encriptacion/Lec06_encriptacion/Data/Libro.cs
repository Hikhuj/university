using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Lec06_encriptacion.Data
{
    // CLASE de Laboratorio 6
    public class Libro
    {
        private string nombre;
        private string genero;
        private string autor;
        private string editor;
        private int anioPublicacion;

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }

        public string Genero
        {
            get { return genero; }
            set { genero = value; }
        }

        public string Autor
        {
            get { return autor; }
            set { autor = value; }
        }

        public string Editor
        {
            get { return editor; }
            set { editor = value; }
        }

        public int AnioPublicacion
        {
            get { return anioPublicacion; }
            set { anioPublicacion = value; }
        }
    }
}