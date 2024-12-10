using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace eDescargas.Controllers
{

    public class HomeController : Controller
    {
        [Authorize]
        public ActionResult Index()
        {
            return View();
        }


        public ActionResult About()
        {
            ViewBag.Message = "Proyecto final de Diseño de Aplicaciones Web.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Bienvenidos a la página de contactos.";

            return View();
        }

    }
}