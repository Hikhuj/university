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
    public class HtmlController : ApiController
    {
        public HttpResponseMessage Get()
        {
            string htmlFileName = "TestData\\Html\\Data.html";
            string angularJS = "TestData\\Html\\angular.min.js";
            string mainJS = "TestData\\Html\\main.js";
            string js = File.ReadAllText(angularJS);
            js += Environment.NewLine + File.ReadAllText(mainJS);
            string html = File.ReadAllText(htmlFileName);
            html = html.Replace("#REPLACE_WITH_JS#", js);
            var response = new HttpResponseMessage { Content = new StringContent(html) };
            response.Content.Headers.ContentType = new MediaTypeHeaderValue("text/html");
            return response;
        }
    }
}