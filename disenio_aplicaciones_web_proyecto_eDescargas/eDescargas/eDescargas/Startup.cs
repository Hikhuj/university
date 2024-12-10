using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(eDescargas.Startup))]
namespace eDescargas
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
