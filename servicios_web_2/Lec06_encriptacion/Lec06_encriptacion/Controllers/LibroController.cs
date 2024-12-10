using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using Lec06_encriptacion.Data;
using Lec06_encriptacion.Models;

namespace Lec06_encriptacion.Controllers
{
    public class LibroController : ApiController
    {
        // GET: api/Libro
        public List<Libro> Get()
        {
            return Datos.listaLibros;
        }

        // GET: api/Libro/5
        public Libro Get(int id)
        {
            Crypt c = new Crypt();
            Libro libros = Datos.listaLibros.ElementAt(id);
            Libro resultado = new Libro();

            resultado.Nombre = c.desencriptar(libros.Nombre);
            resultado.Genero = c.desencriptar(libros.Genero);
            resultado.Autor = c.desencriptar(libros.Editor);
            resultado.Editor = c.desencriptar(libros.Editor);
            resultado.AnioPublicacion = libros.AnioPublicacion;

            return resultado;
        }

        // POST: api/Libro
        public void Post([FromBody]Libro libro)
        {
            Crypt c = new Crypt();
            libro.Nombre = c.encriptar(libro.Nombre);
            libro.Genero = c.encriptar(libro.Genero);
            libro.Autor = c.encriptar(libro.Autor);
            libro.Editor = c.encriptar(libro.Editor);
            Datos.listaLibros.Add(libro);
        }

        // PUT: api/Libro/5
        public void Put(int id, [FromBody]string value)
        {
        }

        // DELETE: api/Libro/5
        public void Delete(int id)
        {
        }
    }
}
