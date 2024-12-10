using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using System.Web.Http;

namespace ASPNET_Web_Api_SelfHost_VideoStreaming.Controllers
{
    public class VideosController : ApiController
    {
        public HttpResponseMessage Get()
        {
            // Creamos un objecto IEnumerable de videos, como no estamos descargando ninguna DB, creamos una lista de tipo string
            IEnumerable<string> videos = new List<string> { "Christmas", "Ilumination" };
            HttpResponseMessage responseMessage = Request.CreateResponse(HttpStatusCode.OK, videos);
            return responseMessage;
        }
    }
}