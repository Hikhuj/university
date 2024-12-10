using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Optimization;
using System.Web.Routing;

namespace eDescargas
{
    public class MvcApplication : System.Web.HttpApplication
    {
        protected void Application_Start()
        {
            // Ve en nuestro proyecto sobre diferentes areas, si no usamos areas, se puede eliminar
            AreaRegistration.RegisterAllAreas();
            // Es para agregar filtros para agregar globalmente para el proyecto.
            FilterConfig.RegisterGlobalFilters(GlobalFilters.Filters);
            // Este importa mucho por que es la tabla de rutas para el MVC poder trabajar bien, el controller se busca aca
            RouteConfig.RegisterRoutes(RouteTable.Routes);
            BundleConfig.RegisterBundles(BundleTable.Bundles);

            // WebSecurity.InitializeDatabaseConnection("StarterSite", "Usuario", "UserId", "Email", autoCreateTables: true);

            // Buscar para esta aplicacion sobre WebSecurity para redefinir la estructura de login.
        }
    }
}
