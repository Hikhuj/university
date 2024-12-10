using Microsoft.Owin.Hosting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace ASPNET_Web_Api_SelfHost_VideoStreaming
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            string baseAddress = "http://localhost:9000/";

            // Start OWIN host
            WebApp.Start<Startup>(url: baseAddress);
            Console.WriteLine("Streaming start...");
            Console.ReadLine();
        }
    }
}