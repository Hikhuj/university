using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace eDescargas.Controllers
{
    [Authorize]
    public class SeguridadController : Controller
    {
        // Controlador de la pestania de seguridad
        
        // GET: Seguridad
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Opcion()
        {
            var lista = new List<string>() { "Usuarios", "Cambiar Contraseña" };
            ViewBag.list = lista;
            return View();
        }

    }
}