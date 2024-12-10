using ASPNET_Web_Api_SelfHost_VideoStreaming.Streams;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;
using System.Web.Http;

namespace ASPNET_Web_Api_SelfHost_VideoStreaming.Controllers
{
    public class CameraController : ApiController
    {
        [HttpGet]
        public HttpResponseMessage FromImages()
        {
            // Con esto vamos a ir dejando una funcion para dejar una funcion
            var imageStream = new ImageStream();
            // Funcion lambda, definimos lo que va tener de salida
            Func<Stream, HttpContent, TransportContext, Task> func = imageStream.WriteToStream;
            var response = Request.CreateResponse();
            // vamos a pasar la funciona anonima
            response.Content = new PushStreamContent(func);
            response.Content.Headers.Remove("Content-Type");
            response.Content.Headers.TryAddWithoutValidation("Content-Type", "multipart/x-mixed-replace;boundary=" + imageStream.Boundary);

            return response;
        }

        [HttpGet]
        public HttpResponseMessage FromVideo(string videoName)
        {
            var video = new VideoStream(videoName);

            // Funcion anonima
            Func<Stream, HttpContent, TransportContext, Task> func = video.WriteToStream;
            var response = Request.CreateResponse();
            response.Content = new PushStreamContent(func, new MediaTypeHeaderValue("video/mp4"));

            return response;
        }
        
    }
}