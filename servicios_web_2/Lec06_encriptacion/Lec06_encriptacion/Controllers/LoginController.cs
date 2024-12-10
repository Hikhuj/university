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
    public class LoginController : ApiController
    {
        // GET: api/Login
        public List<Login> Get()
        {
            return Datos.listaUsuarios;
        }

        // GET: api/Login/5
        public Login Get(int id)
        {
            Crypt c = new Crypt();
            Login login = Datos.listaUsuarios.ElementAt(id);
            Login resultado = new Login();
            resultado.Nombre = login.Nombre;
            resultado.Contrasenia = c.desencriptar(login.Contrasenia);
            return resultado;
        }

        // POST: api/Login
        public void Post([FromBody]Login login)
        {
            Crypt c = new Crypt();
            login.Contrasenia = c.encriptar(login.Contrasenia);
            Datos.listaUsuarios.Add(login);
        }

        // PUT: api/Login/5
        public void Put(int id, [FromBody]string value)
        {
        }

        // DELETE: api/Login/5
        public void Delete(int id)
        {
        }
    }
}
