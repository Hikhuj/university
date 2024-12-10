using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Routing;

namespace eDescargas
{
    public class RouteConfig
    {
        // Para el manejo de rutas de la aplicacion
        public static void RegisterRoutes(RouteCollection routes)
        {
            routes.IgnoreRoute("{resource}.axd/{*pathInfo}");

            routes.MapRoute(
                name: "Default",
                // Como se muestra el path del URL
                url: "{controller}/{action}/{id}",
                // Aqui podemos cambiar el landing page o la pagina donde iniciaria el usuario cuando accede a nuestro sistema
                // Por lo que podemos cambiar el CONTROLLER a que sea alguno que sea login y mostrar una X ACTION para el usuario
                // que podria ser index donde se muestre las opciones de acceso.
                defaults: new { controller = "Home", action = "Index", id = UrlParameter.Optional }
            );
        }
    }
}
